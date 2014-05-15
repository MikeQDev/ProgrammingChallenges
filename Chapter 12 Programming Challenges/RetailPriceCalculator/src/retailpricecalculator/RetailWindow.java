package retailpricecalculator;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class RetailWindow extends JFrame{
    private JTextField wholesaleText, percentText;
    private JButton calcButton;
    private JLabel wholeLabel, percentLabel, percentSign;
    
    public RetailWindow() {
        setTitle("Retail Price Calculator");
        setSize(221,127);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        wholeLabel = new JLabel("Wholesale price   $");
        percentLabel = new JLabel("Markup percent");
        percentSign = new JLabel("%");
        wholesaleText = new JTextField(5);
        percentText = new JTextField(2);
        calcButton = new JButton("Calculate");
        
        calcButton.addActionListener(new CalcListen());
        
        add(wholeLabel);
        add(wholesaleText);
        add(percentLabel);
        add(percentText);
        add(percentSign);
        add(calcButton);
        
        setVisible(true);        
    }
    private class CalcListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double retailPrice;
            String wholeInput = wholesaleText.getText();
            String percentInput = percentText.getText();
            retailPrice = Double.parseDouble(wholeInput)*(1+(Double.parseDouble(percentInput)/100));
            JOptionPane.showMessageDialog(null,"Retail price: "+dollar.format(retailPrice));
        }
    }
    public static void main(String[] args){
        new RetailWindow();
    }
}
