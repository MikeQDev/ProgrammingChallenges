package celsiustofarenheit;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ConvertorGUI extends JFrame{
    private JLabel celsLabel;
    private JTextField celsField;
    private JButton calcButton;
    
    public ConvertorGUI() {
        setTitle("Celsius to Fahrenheit");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        
        JPanel celsPanel = new JPanel();
        celsField = new JTextField(3);
        celsLabel = new JLabel("Degrees in celsius");
        calcButton = new JButton("Convert fahrenheit");
        
        celsPanel.add(celsLabel);
        celsPanel.add(celsField);
        
        calcButton.addActionListener(new ButtonListener());
        
        add(celsPanel);
        add(calcButton);
        pack();
        setVisible(true);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                double cels = Double.parseDouble(celsField.getText());
                double fahr = ((double)9/5)*cels+32;
                JOptionPane.showMessageDialog(null, cels+" celsius = "+fahr+" fahrenheit");
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error; invalid/incomplete data found");
            }
        }
    }
    public static void main(String[] args){
        new ConvertorGUI();
    }
}
