import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnhancedSwingGUI extends JFrame {

  private JTextField nameField;
  private JCheckBox boldCheckBox;
  private JCheckBox italicCheckBox;
  private ButtonGroup colorGroup;
  private JRadioButton redRadio;
  private JRadioButton yellowRadio;
  private JComboBox<String> studentTypeCombo;
  private JLabel previewLabel;
  private JLabel resultLabel;

  public EnhancedSwingGUI() {
    // Set up the frame
    setTitle("Show GUI");
    setSize(800, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Create the controls panel
    JPanel controlsPanel = new JPanel();
    controlsPanel.setLayout(null); // Using absolute positioning for this example
    controlsPanel.setPreferredSize(new Dimension(800, 80));

    // Create components
    JButton okButton = new JButton("OK");
    okButton.setBounds(20, 30, 60, 25);
    controlsPanel.add(okButton);

    JButton cancelButton = new JButton("Cancel");
    cancelButton.setBounds(90, 30, 80, 25);
    controlsPanel.add(cancelButton);

    JLabel nameLabel = new JLabel("Enter Your Name:");
    nameLabel.setBounds(180, 30, 120, 25);
    controlsPanel.add(nameLabel);

    nameField = new JTextField();
    nameField.setBounds(300, 30, 100, 25);
    controlsPanel.add(nameField);

    boldCheckBox = new JCheckBox("Bold");
    boldCheckBox.setBounds(410, 30, 60, 25);
    controlsPanel.add(boldCheckBox);

    italicCheckBox = new JCheckBox("Italic");
    italicCheckBox.setBounds(470, 30, 60, 25);
    controlsPanel.add(italicCheckBox);

    colorGroup = new ButtonGroup();
    redRadio = new JRadioButton("Red", true);
    redRadio.setBounds(530, 30, 50, 25);
    colorGroup.add(redRadio);
    controlsPanel.add(redRadio);

    yellowRadio = new JRadioButton("Yellow");
    yellowRadio.setBounds(590, 30, 70, 25);
    colorGroup.add(yellowRadio);
    controlsPanel.add(yellowRadio);

    String[] options = { "Freshman", "Sophomore", "Junior", "Senior" };
    studentTypeCombo = new JComboBox<>(options);
    studentTypeCombo.setBounds(670, 30, 100, 25);
    controlsPanel.add(studentTypeCombo);

    // Create the results panel
    JPanel resultsPanel = new JPanel();
    resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
    resultsPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

    previewLabel = new JLabel("Preview");
    previewLabel.setFont(new Font("Arial", Font.PLAIN, 14));

    resultLabel = new JLabel("");

    resultsPanel.add(previewLabel);
    resultsPanel.add(Box.createVerticalStrut(15));
    resultsPanel.add(resultLabel);

    // Add panels to the frame
    add(controlsPanel, BorderLayout.NORTH);
    add(resultsPanel, BorderLayout.CENTER);

    // Add action listeners and event handling

    // Document listener for the text field
    nameField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
      @Override
      public void insertUpdate(javax.swing.event.DocumentEvent e) {
        updatePreview();
      }

      @Override
      public void removeUpdate(javax.swing.event.DocumentEvent e) {
        updatePreview();
      }

      @Override
      public void changedUpdate(javax.swing.event.DocumentEvent e) {
        updatePreview();
      }
    });

    // Action listeners for checkboxes and radio buttons
    ActionListener formattingListener = e -> updatePreview();
    boldCheckBox.addActionListener(formattingListener);
    italicCheckBox.addActionListener(formattingListener);
    redRadio.addActionListener(formattingListener);
    yellowRadio.addActionListener(formattingListener);
    studentTypeCombo.addActionListener(formattingListener);

    // Button action listeners
    okButton.addActionListener(e -> displayResult());

    cancelButton.addActionListener(e -> {
      nameField.setText("");
      boldCheckBox.setSelected(false);
      italicCheckBox.setSelected(false);
      redRadio.setSelected(true);
      studentTypeCombo.setSelectedIndex(0);
      resultLabel.setText("");
      updatePreview();
    });

    // Initial update
    updatePreview();
  }

  private void updatePreview() {
    // Get the entered text
    String text = nameField.getText();
    if (text.isEmpty()) {
      text = "Preview";
    }

    // Determine font style
    int fontStyle = Font.PLAIN;
    if (boldCheckBox.isSelected()) {
      fontStyle |= Font.BOLD;
    }
    if (italicCheckBox.isSelected()) {
      fontStyle |= Font.ITALIC;
    }

    // Set the font
    Font font = new Font("Arial", fontStyle, 14);
    previewLabel.setFont(font);

    // Set the text
    previewLabel.setText(text);

    // Set the color
    if (redRadio.isSelected()) {
      previewLabel.setForeground(Color.RED);
    } else if (yellowRadio.isSelected()) {
      previewLabel.setForeground(Color.YELLOW);
    }
  }

  private void displayResult() {
    String enteredText = nameField.getText();
    if (enteredText.isEmpty()) {
      resultLabel.setText("Please enter a name.");
      return;
    }

    String studentType = (String) studentTypeCombo.getSelectedItem();
    resultLabel.setText("\"" + enteredText + "\" is a " + studentType + " student.");
  }

  public static void main(String[] args) {
    // Create and display the GUI on the Event Dispatch Thread
    SwingUtilities.invokeLater(() -> {
      EnhancedSwingGUI gui = new EnhancedSwingGUI();
      gui.setVisible(true);
    });
  }
}