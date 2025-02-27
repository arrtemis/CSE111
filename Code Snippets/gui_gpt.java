import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_gpt {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Show GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());

        // Buttons
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        // Label and Text Field
        JLabel nameLabel = new JLabel("Enter Your Name:");
        JTextField nameField = new JTextField(10);

        // Checkboxes
        JCheckBox boldCheck = new JCheckBox("Bold");
        JCheckBox italicCheck = new JCheckBox("Italic");

        // Radio Buttons (Grouped)
        JRadioButton redRadio = new JRadioButton("Red");
        JRadioButton yellowRadio = new JRadioButton("Yellow");
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(redRadio);
        colorGroup.add(yellowRadio);

        // Combo Box
        String[] options = {"Freshman", "Sophomore", "Junior", "Senior"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Label to display formatted text
        JLabel outputLabel = new JLabel("Your formatted text will appear here.");
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // Action Listener to update the text based on selections
        ActionListener updateText = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = nameField.getText().trim();
                if (text.isEmpty()) {
                    outputLabel.setText("Please enter a name.");
                    return;
                }

                // Determine Font Style
                int fontStyle = Font.PLAIN;
                if (boldCheck.isSelected() && italicCheck.isSelected()) {
                    fontStyle = Font.BOLD | Font.ITALIC;
                } else if (boldCheck.isSelected()) {
                    fontStyle = Font.BOLD;
                } else if (italicCheck.isSelected()) {
                    fontStyle = Font.ITALIC;
                }

                // Set Font Style
                outputLabel.setFont(new Font("Arial", fontStyle, 14));

                // Determine Color
                if (redRadio.isSelected()) {
                    outputLabel.setForeground(Color.RED);
                } else if (yellowRadio.isSelected()) {
                    outputLabel.setForeground(Color.YELLOW);
                } else {
                    outputLabel.setForeground(Color.BLACK); // Default
                }

                // Get selected dropdown option
                String studentYear = (String) comboBox.getSelectedItem();

                // Update output text
                outputLabel.setText(text + " is a " + studentYear + " student.");
            }
        };

        // Add action listeners to all interactive components
        nameField.addActionListener(updateText);
        boldCheck.addActionListener(updateText);
        italicCheck.addActionListener(updateText);
        redRadio.addActionListener(updateText);
        yellowRadio.addActionListener(updateText);
        comboBox.addActionListener(updateText);
        okButton.addActionListener(updateText);

        // Cancel button clears everything
        cancelButton.addActionListener(e -> {
            nameField.setText("");
            boldCheck.setSelected(false);
            italicCheck.setSelected(false);
            redRadio.setSelected(false);
            yellowRadio.setSelected(false);
            comboBox.setSelectedIndex(0);
            outputLabel.setText("Your formatted text will appear here.");
            outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            outputLabel.setForeground(Color.BLACK);
        });

        // Add components to the frame
        frame.add(okButton);
        frame.add(cancelButton);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(boldCheck);
        frame.add(italicCheck);
        frame.add(redRadio);
        frame.add(yellowRadio);
        frame.add(comboBox);
        frame.add(outputLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
