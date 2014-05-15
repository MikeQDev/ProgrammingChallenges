package scrollable.tax.calc;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.*;

class ScrollableCalcGUI extends JFrame{
    private JSlider taxSlider;
    private JLabel descLabel, taxLabel, percentLabel;
    private JButton calcButton;
    private JTextField priceField, taxField;
    private JPanel pricePanel, taxSlidePanel, buttonPanel;
    public ScrollableCalcGUI() {
        setTitle("Tax calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        pricePanel = new JPanel();
        taxSlidePanel = new JPanel();
        buttonPanel = new JPanel();
        JPanel smallTaxPanel = new JPanel();
        descLabel = new JLabel("Price:", SwingConstants.RIGHT);
        priceField = new JTextField(6);
        calcButton = new JButton("Calculate price");
        
        calcButton.addActionListener(new CalcButtonListen());
        buttonPanel.add(calcButton);
        
        taxLabel = new JLabel("Tax:");
        taxField = new JTextField(6);
        taxField.setText("6");
        taxField.setEditable(false);
        percentLabel = new JLabel("%");
        taxSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 6);
        
        taxSlider.setMajorTickSpacing(2);
        taxSlider.setMinorTickSpacing(1);
        taxSlider.setPaintLabels(true);
        taxSlider.setPaintTicks(true);
        
        
        pricePanel.add(descLabel);
        pricePanel.add(priceField);
        
        taxSlidePanel.setLayout(new GridLayout(2,1));
        smallTaxPanel.add(taxLabel);
        smallTaxPanel.add(taxField);
        smallTaxPanel.add(percentLabel);
        taxSlider.addChangeListener(new SliderListener());
        taxSlidePanel.add(taxSlider, BorderLayout.CENTER);
        taxSlidePanel.add(smallTaxPanel, BorderLayout.EAST);
        
        add(pricePanel, BorderLayout.NORTH);
        add(taxSlidePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private class CalcButtonListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double taxPercent = Double.parseDouble(taxField.getText())/100;
            double subTotal = Double.parseDouble(priceField.getText());
            double salesTax = taxPercent*subTotal;
            JOptionPane.showMessageDialog(null,"Subtotal: "+dollar.format(subTotal)
                                        +"\nSales tax: "+dollar.format(salesTax)
                                        +"\nTotal price: "+dollar.format(subTotal+salesTax));
        }
    }
    private class SliderListener implements ChangeListener{
        public void stateChanged(ChangeEvent e){
            taxField.setText(String.valueOf(taxSlider.getValue()));
        }
    }
}
