package mpgcalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcGUI extends JFrame{
    private JLabel gallonsHeldLabel, milesLabel;
    private JTextField gallonsHeldField, milesField;
    private JButton calcButton;
    public CalcGUI() {
        setTitle("MPG Calculator");
        setSize(300,300);
        setLayout(new GridLayout(3,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gallonsHeldLabel = new JLabel("Gallons held");
        milesLabel = new JLabel("Miles per full tank");
        gallonsHeldField = new JTextField(3);
        milesField = new JTextField(3);
        calcButton = new JButton("Calculate MPG");
        JPanel gallonsPanel = new JPanel();
        JPanel milesPanel = new JPanel();
        gallonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        milesPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        gallonsPanel.add(gallonsHeldLabel);        
        gallonsPanel.add(gallonsHeldField);
        
        milesPanel.add(milesLabel);
        milesPanel.add(milesField);
        
        calcButton.addActionListener(new ButtonListen());
        
        add(gallonsPanel);
        add(milesPanel);
        add(calcButton);
        
        pack();
        setVisible(true);
    }
    private class ButtonListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double milesAmt;
            double gallonAmt;
            try{
                milesAmt = Double.parseDouble(milesField.getText());
                gallonAmt = Double.parseDouble(gallonsHeldField.getText());
                JOptionPane.showMessageDialog(null,"This car gets "+(milesAmt/gallonAmt)+" miles per gallon.");
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Error; incomplete or invalid data provided.");
            }
        }
    }
    public static void main(String[] args){
        new CalcGUI();
    }
}
