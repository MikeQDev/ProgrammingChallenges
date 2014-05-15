package theatherrevenue;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class RevenueCalculator extends JFrame{
    private final double THEATHER_PERCENT = .20;
    private JLabel adultTicketPrice, adultTicketSold, childTicketPrice, childTicketSold, revenueKept;
    private JTextField adultTicketPriceField, adultTicketSoldField, childTicketPriceField, childTicketSoldField;
    private JButton calcButton;
    public RevenueCalculator() {
        setTitle("Revenue Calculator");
        setSize(238,189);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        setVisible(true);
    }
    public void buildPanel(){
        setLayout(new GridLayout(4,2));
        calcButton = new JButton("Calculate");
        revenueKept = new JLabel("(Note: Theather keeps 20% of sales)");
        JPanel adultTicketSoldPanel = new JPanel();
        adultTicketSoldPanel.setLayout(new GridLayout(2,2));
        JPanel childTicketSoldPanel = new JPanel();
        childTicketSoldPanel.setLayout(new GridLayout(2,2));
        adultTicketPrice = new JLabel("Adult ticket price $");
        childTicketPrice = new JLabel("Child ticket price $");
        adultTicketSold = new JLabel("Adult tickets sold");
        childTicketSold = new JLabel("Child tickets sold");
        
        adultTicketSoldField = new JTextField();
        adultTicketPriceField = new JTextField();
        childTicketSoldField = new JTextField();
        childTicketPriceField = new JTextField();
        
        adultTicketSoldPanel.add(adultTicketPrice);
        adultTicketSoldPanel.add(adultTicketPriceField);
        adultTicketSoldPanel.add(adultTicketSold);
        adultTicketSoldPanel.add(adultTicketSoldField);
        add(adultTicketSoldPanel);
        
        childTicketSoldPanel.add(childTicketPrice);
        childTicketSoldPanel.add(childTicketPriceField);
        childTicketSoldPanel.add(childTicketSold);
        childTicketSoldPanel.add(childTicketSoldField);
        add(childTicketSoldPanel);
        
        calcButton.addActionListener(new CalcListener());
        
        add(calcButton);
        add(revenueKept);
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double adultTicketSales = Double.parseDouble(adultTicketPriceField.getText())
                                        * Integer.parseInt(adultTicketSoldField.getText());
            double childTicketSales = Double.parseDouble(childTicketPriceField.getText())
                                        * Integer.parseInt(childTicketSoldField.getText());
            double netAdultTicketRevenue = adultTicketSales * THEATHER_PERCENT;
            double netChildTicketRevenue = childTicketSales * THEATHER_PERCENT;
            double totalGrossRev = adultTicketSales + childTicketSales;
            double totalNetRev = netAdultTicketRevenue + netChildTicketRevenue;
            JOptionPane.showMessageDialog(null,"Gross adult ticket revenue: "+dollar.format(adultTicketSales)
                                        +"\nNet adult ticket revenue: "+dollar.format(netAdultTicketRevenue)
                                        +"\nGross children ticket revenue: "+dollar.format(childTicketSales)
                                        +"\nNet children ticket revenue: "+dollar.format(netChildTicketRevenue)
                                        +"\nTotal gross revenue: "+dollar.format(totalGrossRev)
                                        +"\nTotal net revenue: "+dollar.format(totalNetRev));
        }
    }
    public static void main(String[] args){
        new RevenueCalculator();
    }
}
