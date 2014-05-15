package monthlysalestax;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class SalesTaxGUI extends JFrame{
    private final double STATE_TAX = .04;
    private final double COUNTY_TAX = .02;
    private JTextField totalSalesText;
    private JLabel descLabel, stateTaxLabel, countyTaxLabel;
    private JButton calcButton;
    
    public SalesTaxGUI() {
        setTitle("Sales tax calculator");
        setSize(226,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3,1));        
        
        JPanel s = new JPanel();
        JPanel d = new JPanel();
        JPanel b = new JPanel();
        
        descLabel = new JLabel("Monthly sales $");
        stateTaxLabel = new JLabel("(State tax: "+(100*STATE_TAX)+"%");
        countyTaxLabel = new JLabel("County tax: "+(100*COUNTY_TAX)+"%)");
        totalSalesText = new JTextField(7);
        calcButton = new JButton("Calculate");
        
        calcButton.addActionListener(new CalcListener());
        
        s.add(descLabel);
        s.add(totalSalesText);
        d.add(stateTaxLabel);
        d.add(countyTaxLabel);
        
        add(s);
        add(calcButton);
        add(d);
        
        pack();
        
        setVisible(true);        
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double sales = Double.parseDouble(totalSalesText.getText());
            double countyAmount= sales * COUNTY_TAX;
            double stateAmount = sales * STATE_TAX;
            double totalAmount = countyAmount + stateAmount;
            JOptionPane.showMessageDialog(null,"State tax amount: "+dollar.format(stateAmount)
                                            +"\nCounty tax amount: "+dollar.format(countyAmount)
                                            +"\nTotal tax amount: "+dollar.format(totalAmount));
        }
    }

}
