import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nutritional extends JFrame {

    private JTextField proteinField, carbField, fatField, resultField;

    public nutritional() {
        // Set up the JFrame
        setTitle("Nutritional Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Create labels and text fields
        JLabel proteinLabel = new JLabel("Proteins (g):");
        proteinField = new JTextField();
        JLabel carbLabel = new JLabel("Carbohydrates (g):");
        carbField = new JTextField();
        JLabel fatLabel = new JLabel("Fats (g):");
        fatField = new JTextField();
        JLabel resultLabel = new JLabel("Total Calories:");
        resultField = new JTextField();
        resultField.setEditable(false);

        // Create a Calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalCalories();
            }
        });

        // Add components to the JFrame
        add(proteinLabel);
        add(proteinField);
        add(carbLabel);
        add(carbField);
        add(fatLabel);
        add(fatField);
        add(resultLabel);
        add(resultField);
        add(calculateButton);

        setVisible(true);
    }

    private void calculateTotalCalories() {
        try {
            double protein = Double.parseDouble(proteinField.getText());
            double carbs = Double.parseDouble(carbField.getText());
            double fats = Double.parseDouble(fatField.getText());

            // Calculate total calories (using typical values of 4 calories/g for protein and carbs, and 9 calories/g for fats)
            double totalCalories = (protein * 4) + (carbs * 4) + (fats * 9);

            resultField.setText(String.format("%.2f", totalCalories));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values for all fields.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new nutritional();
            }
        });
    }
}


