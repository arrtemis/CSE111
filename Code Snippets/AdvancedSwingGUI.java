import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.awt.*;
import java.util.Hashtable;

public class AdvancedSwingGUI extends JFrame {
    
    // Text formatting components
    private JTextField nameField;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;
    private JCheckBox underlineCheckBox;
    private JComboBox<String> fontFamilyCombo;
    private JSlider fontSizeSlider;
    private JButton textColorButton;
    private JButton bgColorButton;
    private JComboBox<String> alignmentCombo;
    private JComboBox<String> studentTypeCombo;
    
    // Display components
    private JTextPane previewPane;
    private JLabel resultLabel;
    private JSlider zoomSlider;
    
    // Current formatting state
    private Color currentTextColor = Color.BLACK;
    private Color currentBgColor = Color.WHITE;
    private int currentAlignment = SwingConstants.LEFT;
    
    public AdvancedSwingGUI() {
        // Set up the frame
        setTitle("Advanced Text Formatting");
        setSize(920, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Create the main panels
        JPanel controlsPanel = createControlsPanel();
        JPanel previewPanel = createPreviewPanel();
        JPanel resultPanel = createResultPanel();
        
        // Add panels to the frame with some padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(controlsPanel, BorderLayout.NORTH);
        mainPanel.add(previewPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        // Initialize with default values
        updatePreview();
    }
    
    private JPanel createControlsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Text Controls"));
        
        // First row - basic controls
        JPanel basicControls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> displayResult());
        basicControls.add(okButton);
        
        JButton cancelButton = new JButton("Reset");
        cancelButton.addActionListener(e -> resetControls());
        basicControls.add(cancelButton);
        
        basicControls.add(new JLabel("Enter Your Name:"));
        
        nameField = new JTextField(15);
        nameField.getDocument().addDocumentListener(new SimpleDocumentListener(this::updatePreview));
        basicControls.add(nameField);
        
        panel.add(basicControls);
        
        // Second row - text formatting
        JPanel formattingControls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.addActionListener(e -> updatePreview());
        formattingControls.add(boldCheckBox);
        
        italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.addActionListener(e -> updatePreview());
        formattingControls.add(italicCheckBox);
        
        underlineCheckBox = new JCheckBox("Underline");
        underlineCheckBox.addActionListener(e -> updatePreview());
        formattingControls.add(underlineCheckBox);
        
        // Font family selector
        formattingControls.add(new JLabel("Font:"));
        String[] fontFamilies = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        // Limit to common fonts for simplicity
        String[] commonFonts = {"Arial", "Times New Roman", "Courier New", "Verdana", "Georgia", "Comic Sans MS"};
        fontFamilyCombo = new JComboBox<>(commonFonts);
        fontFamilyCombo.setSelectedItem("Arial");
        fontFamilyCombo.addActionListener(e -> updatePreview());
        formattingControls.add(fontFamilyCombo);
        
        panel.add(formattingControls);
        
        // Third row - more formatting
        JPanel advancedControls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // Font size slider
        advancedControls.add(new JLabel("Size:"));
        fontSizeSlider = new JSlider(JSlider.HORIZONTAL, 8, 36, 14);
        fontSizeSlider.setMajorTickSpacing(4);
        fontSizeSlider.setPaintTicks(true);
        fontSizeSlider.setSnapToTicks(true);
        
        // Add labels to the slider
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(8, new JLabel("8"));
        labelTable.put(16, new JLabel("16"));
        labelTable.put(24, new JLabel("24"));
        labelTable.put(32, new JLabel("32"));
        fontSizeSlider.setLabelTable(labelTable);
        fontSizeSlider.setPaintLabels(true);
        
        fontSizeSlider.addChangeListener(e -> updatePreview());
        advancedControls.add(fontSizeSlider);
        
        // Color buttons
        textColorButton = new JButton("Text Color");
        textColorButton.setBackground(currentTextColor);
        textColorButton.setForeground(getContrastColor(currentTextColor));
        textColorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(
                    AdvancedSwingGUI.this, "Choose Text Color", currentTextColor);
            if (newColor != null) {
                currentTextColor = newColor;
                textColorButton.setBackground(newColor);
                textColorButton.setForeground(getContrastColor(newColor));
                updatePreview();
            }
        });
        advancedControls.add(textColorButton);
        
        bgColorButton = new JButton("Background");
        bgColorButton.setBackground(currentBgColor);
        bgColorButton.setForeground(getContrastColor(currentBgColor));
        bgColorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(
                    AdvancedSwingGUI.this, "Choose Background Color", currentBgColor);
            if (newColor != null) {
                currentBgColor = newColor;
                bgColorButton.setBackground(newColor);
                bgColorButton.setForeground(getContrastColor(newColor));
                updatePreview();
            }
        });
        advancedControls.add(bgColorButton);
        
        // Text alignment
        advancedControls.add(new JLabel("Align:"));
        String[] alignments = {"Left", "Center", "Right"};
        alignmentCombo = new JComboBox<>(alignments);
        alignmentCombo.addActionListener(e -> {
            String selected = (String) alignmentCombo.getSelectedItem();
            if ("Left".equals(selected)) {
                currentAlignment = SwingConstants.LEFT;
            } else if ("Center".equals(selected)) {
                currentAlignment = SwingConstants.CENTER;
            } else if ("Right".equals(selected)) {
                currentAlignment = SwingConstants.RIGHT;
            }
            updatePreview();
        });
        advancedControls.add(alignmentCombo);
        
        // Student type combo
        advancedControls.add(new JLabel("Student Type:"));
        String[] options = {"Freshman", "Sophomore", "Junior", "Senior"};
        studentTypeCombo = new JComboBox<>(options);
        studentTypeCombo.addActionListener(e -> updatePreview());
        advancedControls.add(studentTypeCombo);
        
        panel.add(advancedControls);
        
        return panel;
    }
    
    private JPanel createPreviewPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Preview"));
        
        // Create preview text area with scrolling
        previewPane = new JTextPane();
        previewPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(previewPane);
        scrollPane.setPreferredSize(new Dimension(800, 200));
        panel.add(scrollPane, BorderLayout.CENTER);
        
        // Add zoom controls
        JPanel zoomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        zoomPanel.add(new JLabel("Zoom:"));
        
        zoomSlider = new JSlider(JSlider.HORIZONTAL, 50, 200, 100);
        zoomSlider.setMajorTickSpacing(50);
        zoomSlider.setPaintTicks(true);
        
        Hashtable<Integer, JLabel> zoomLabels = new Hashtable<>();
        zoomLabels.put(50, new JLabel("50%"));
        zoomLabels.put(100, new JLabel("100%"));
        zoomLabels.put(150, new JLabel("150%"));
        zoomLabels.put(200, new JLabel("200%"));
        zoomSlider.setLabelTable(zoomLabels);
        zoomSlider.setPaintLabels(true);
        
        zoomSlider.addChangeListener(e -> {
            if (!zoomSlider.getValueIsAdjusting()) {
                updatePreviewZoom();
            }
        });
        zoomPanel.add(zoomSlider);
        
        panel.add(zoomPanel, BorderLayout.SOUTH);
        
        return panel;
    }
    
    private JPanel createResultPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Result"));
        
        resultLabel = new JLabel();
        resultLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(resultLabel, BorderLayout.CENTER);
        
        return panel;
    }
    
    private void updatePreview() {
        // Get the entered text or use placeholder
        String text = nameField.getText();
        if (text.isEmpty()) {
            text = "Preview text will appear here";
        }
        
        // Determine font styling
        int fontStyle = Font.PLAIN;
        if (boldCheckBox.isSelected()) {
            fontStyle |= Font.BOLD;
        }
        if (italicCheckBox.isSelected()) {
            fontStyle |= Font.ITALIC;
        }
        
        // Get font family and size
        String fontFamily = (String) fontFamilyCombo.getSelectedItem();
        int fontSize = fontSizeSlider.getValue();
        
        // Create the font
        Font font = new Font(fontFamily, fontStyle, fontSize);
        
        // Set up the preview pane with all formatting
        previewPane.setFont(font);
        previewPane.setForeground(currentTextColor);
        previewPane.setBackground(currentBgColor);
        
        // Apply text alignment
        StyledDocument doc = previewPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        switch (currentAlignment) {
            case SwingConstants.CENTER:
                StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
                break;
            case SwingConstants.RIGHT:
                StyleConstants.setAlignment(center, StyleConstants.ALIGN_RIGHT);
                break;
            default:
                StyleConstants.setAlignment(center, StyleConstants.ALIGN_LEFT);
        }
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        
        // Apply underline if selected
        if (underlineCheckBox.isSelected()) {
            SimpleAttributeSet underline = new SimpleAttributeSet();
            StyleConstants.setUnderline(underline, true);
            doc.setCharacterAttributes(0, doc.getLength(), underline, false);
        }
        
        // Set the text
        previewPane.setText(text);
        
        // Apply zoom
        updatePreviewZoom();
    }
    
    private void updatePreviewZoom() {
        float zoomFactor = zoomSlider.getValue() / 100.0f;
        
        // Create a scaled font for the zoom effect
        Font currentFont = previewPane.getFont();
        int originalSize = fontSizeSlider.getValue();
        int zoomedSize = Math.round(originalSize * zoomFactor);
        
        Font zoomedFont = currentFont.deriveFont((float) zoomedSize);
        previewPane.setFont(zoomedFont);
    }
    
    private void displayResult() {
        String enteredText = nameField.getText();
        if (enteredText.isEmpty()) {
            resultLabel.setText("Please enter a name.");
            return;
        }
        
        String studentType = (String) studentTypeCombo.getSelectedItem();
        
        // Create a styled label for the result
        resultLabel.setText("<html><span style=\"" + 
                "font-family: " + fontFamilyCombo.getSelectedItem() + "; " +
                "font-size: " + fontSizeSlider.getValue() + "pt; " +
                (boldCheckBox.isSelected() ? "font-weight: bold; " : "") +
                (italicCheckBox.isSelected() ? "font-style: italic; " : "") +
                (underlineCheckBox.isSelected() ? "text-decoration: underline; " : "") +
                "color: rgb(" + currentTextColor.getRed() + "," + 
                currentTextColor.getGreen() + "," + currentTextColor.getBlue() + "); " +
                "background-color: rgb(" + currentBgColor.getRed() + "," + 
                currentBgColor.getGreen() + "," + currentBgColor.getBlue() + "); " +
                "\">" + enteredText + "</span> is a " + studentType + " student.</html>");
    }
    
    private void resetControls() {
        nameField.setText("");
        boldCheckBox.setSelected(false);
        italicCheckBox.setSelected(false);
        underlineCheckBox.setSelected(false);
        fontFamilyCombo.setSelectedItem("Arial");
        fontSizeSlider.setValue(14);
        zoomSlider.setValue(100);
        alignmentCombo.setSelectedItem("Left");
        studentTypeCombo.setSelectedIndex(0);
        
        currentTextColor = Color.BLACK;
        textColorButton.setBackground(currentTextColor);
        textColorButton.setForeground(Color.WHITE);
        
        currentBgColor = Color.WHITE;
        bgColorButton.setBackground(currentBgColor);
        bgColorButton.setForeground(Color.BLACK);
        
        currentAlignment = SwingConstants.LEFT;
        
        resultLabel.setText("");
        updatePreview();
    }
    
    private Color getContrastColor(Color color) {
        // Calculate the perceptive luminance for good contrast
        double luminance = 0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue();
        return luminance > 128 ? Color.BLACK : Color.WHITE;
    }
    
    // Simple document listener implementation
    private static class SimpleDocumentListener implements DocumentListener {
        private final Runnable action;
        
        public SimpleDocumentListener(Runnable action) {
            this.action = action;
        }
        
        @Override
        public void insertUpdate(DocumentEvent e) {
            action.run();
        }
        
        @Override
        public void removeUpdate(DocumentEvent e) {
            action.run();
        }
        
        @Override
        public void changedUpdate(DocumentEvent e) {
            action.run();
        }
    }
    
    public static void main(String[] args) {
        // Set look and feel to system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Create and display the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            AdvancedSwingGUI gui = new AdvancedSwingGUI();
            gui.setVisible(true);
        });
    }
}