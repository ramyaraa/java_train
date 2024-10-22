package bro_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiNestedLoop {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Shape Generator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a text area to display the shapes
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Panel for user input
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // TextField to input pixel size
        JLabel label = new JLabel("Enter pixels:");
        JTextField pixelInput = new JTextField();
        panel.add(label);
        panel.add(pixelInput);

        // ComboBox to select the shape
        JLabel shapeLabel = new JLabel("Select Shape:");
        String[] shapes = {"Square", "Triangle Upper Right", "Triangle Upper Left", "Triangle Down Right", "Triangle Down Left"};
        JComboBox<String> shapeComboBox = new JComboBox<>(shapes);
        panel.add(shapeLabel);
        panel.add(shapeComboBox);

        frame.add(panel, BorderLayout.NORTH);

        // Button to generate shape
        JButton generateButton = new JButton("Generate Shape");
        frame.add(generateButton, BorderLayout.SOUTH);

        // Action listener for the button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) shapeComboBox.getSelectedItem();
                int pixels;
                try {
                    pixels = Integer.parseInt(pixelInput.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for pixels.");
                    return;
                }

                StringBuilder shapeOutput = new StringBuilder();

                if (selectedShape.equals("Square")) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            shapeOutput.append("*  ");
                        }
                        shapeOutput.append("\n");
                    }

                } else if (selectedShape.equals("Triangle Upper Right")) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row <= column) {
                                shapeOutput.append("#  ");
                            } else {
                                shapeOutput.append("   ");
                            }
                        }
                        shapeOutput.append("\n");
                    }

                } else if (selectedShape.equals("Triangle Upper Left")) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row + column <= pixels - 1) {
                                shapeOutput.append("#  ");
                            } else {
                                shapeOutput.append("   ");
                            }
                        }
                        shapeOutput.append("\n");
                    }

                } else if (selectedShape.equals("Triangle Down Right")) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row + column >= pixels - 1) {
                                shapeOutput.append("#  ");
                            } else {
                                shapeOutput.append("   ");
                            }
                        }
                        shapeOutput.append("\n");
                    }

                } else if (selectedShape.equals("Triangle Down Left")) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row >= column) {
                                shapeOutput.append("#  ");
                            } else {
                                shapeOutput.append("   ");
                            }
                        }
                        shapeOutput.append("\n");
                    }
                }

                // Set the text area to display the shape
                textArea.setText(shapeOutput.toString());
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
