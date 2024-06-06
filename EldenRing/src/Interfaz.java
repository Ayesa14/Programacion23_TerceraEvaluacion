import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    private JTextField nameField;
    private JTextField strengthField;
    private JTextField agilityField;
    private JTextField intelligenceField;
    private JButton saveButton;
    private JButton loadButton;

    public Interfaz() {
        // Create the text fields
        nameField = new JTextField(20);
        strengthField = new JTextField(20);
        agilityField = new JTextField(20);
        intelligenceField = new JTextField(20);

        // Create the buttons
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");

        // Add action listeners to the buttons
        saveButton.addActionListener(e -> {
            // Implement save functionality here
        });

        loadButton.addActionListener(e -> {
            // Implement load functionality here
        });

        // Create a panel and add the components to it
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Strength:"));
        panel.add(strengthField);
        panel.add(new JLabel("Agility:"));
        panel.add(agilityField);
        panel.add(new JLabel("Intelligence:"));
        panel.add(intelligenceField);
        panel.add(saveButton);
        panel.add(loadButton);

        // Add the panel to the frame
        this.add(panel);

        // Set the frame properties
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
