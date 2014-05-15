package propertytax;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class PropertyCalculator extends JFrame{
    private double actualValue = 0;
    private final double ASSESS_VALUE = .6;
    private final double PROPERTY_TAX = .0064;
    private JTextField textBox;
    private JButton calcButton;
    private JLabel label, details, details2;
    
    public PropertyCalculator() {
        setTitle("Property Calculator");
        setSize(258,133);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        textBox = new JTextField(7);
        calcButton = new JButton("Calculate");
        label = new JLabel("Property value $");
        details = new JLabel("(Assessment value: 6% actual");
        details2 = new JLabel("Property tax: .64% assessment)");
        
        JPanel small = new JPanel();
        small.setLayout(new GridLayout(2,1));
        calcButton.addActionListener(new TaxListener());
        
        small.add(details);
        small.add(details2);
        
        add(label);
        add(textBox);
        add(calcButton);
        add(small);
        
        setVisible(true);
    }
    private class TaxListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            actualValue = Double.parseDouble(textBox.getText());
            double assValue = actualValue * ASSESS_VALUE;
            double propertyTax = assValue * PROPERTY_TAX;
            JOptionPane.showMessageDialog(null, "Assessed value: "+dollar.format(assValue)
                                            +"\nProperty tax: "+dollar.format(propertyTax));
        }
    }
    public static void main(String[] args){
        new PropertyCalculator();
    }

}
