package joesautomotive;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class PriceCalculator extends JFrame{
    private final double OIL_CHANGE=26, LUBE_JOB=18, RADIATOR_FLUSH=30, TRANSMISSION_FLUSH=80,
                            INSPECTION=15, MUFFLER_REPLACEMENT=100, TIRE_ROTATION=20, HOURLY_RATE=20;
    private JLabel partsCostLabel, hoursLabel;
    private JCheckBox oilChangeField, lubeJobField, radiatorFlushField, transmissionFlushField,
                    inspectionField, mufflerReplacementField, tireRotationField;
    private JPanel otherServices, regularServices, hoursPanel, partCostPanel;
    private JTextField hoursField, partCostField;
    private JButton calcButton;
    public PriceCalculator() {
        setTitle("Joe's Automotive Price Calculator");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        pack();
        setVisible(true);
    }
    public void buildPanel(){
        setLayout(new BorderLayout());
        
        regularServices = new JPanel();
        regularServices.setBorder(BorderFactory.createTitledBorder("Regular services"));
        regularServices.setLayout(new GridLayout(4,1));
        
        otherServices = new JPanel();
        otherServices.setBorder(BorderFactory.createTitledBorder("Other services"));
        otherServices.setLayout(new GridLayout(3,1));
        
        hoursPanel = new JPanel();
        partCostPanel = new JPanel();
        
        calcButton = new JButton("Calculate");
        
        hoursLabel = new JLabel("Hours required");
        hoursField = new JTextField(3);
        partsCostLabel = new JLabel("Parts cost $");
        partCostField = new JTextField(4);
        
        oilChangeField = new JCheckBox("Oil change");
        lubeJobField = new JCheckBox("Lube job");
        radiatorFlushField = new JCheckBox("Radiator flush");        
        transmissionFlushField = new JCheckBox("Transmission flush");
        inspectionField = new JCheckBox("Inspection");
        mufflerReplacementField = new JCheckBox("Muffler replacement");        
        tireRotationField = new JCheckBox("Tire rotation");
        
        regularServices.add(oilChangeField);
        regularServices.add(lubeJobField);
        regularServices.add(radiatorFlushField);
        regularServices.add(transmissionFlushField);
        regularServices.add(inspectionField);
        regularServices.add(mufflerReplacementField);
        regularServices.add(tireRotationField);
        
        hoursPanel.add(hoursLabel);
        hoursPanel.add(hoursField);
        partCostPanel.add(partsCostLabel);
        partCostPanel.add(partCostField);
        
        JLabel costNote = new JLabel("($20/hr. labor charge)");
        
        otherServices.add(hoursPanel);
        otherServices.add(partCostPanel);
        otherServices.add(costNote);
        
        calcButton.addActionListener(new CalcListener());
        
        add(regularServices, BorderLayout.WEST);
        add(otherServices, BorderLayout.EAST);   
        add(calcButton, BorderLayout.SOUTH);
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double cost=0;
            double serviceCharge;
            double partsCharge;
            
            try{
                serviceCharge = Double.parseDouble(hoursField.getText())*HOURLY_RATE;
                partsCharge = Double.parseDouble(partCostField.getText());
                cost+=serviceCharge+partsCharge;
            }catch(NumberFormatException ex){
                
            }
            
            if(oilChangeField.isSelected())
                cost+=OIL_CHANGE;
            if(lubeJobField.isSelected())
                cost+=LUBE_JOB;
            if(radiatorFlushField.isSelected())
                cost+=RADIATOR_FLUSH;
            if(transmissionFlushField.isSelected())
                cost+=TRANSMISSION_FLUSH;
            if(inspectionField.isSelected())
                cost+=INSPECTION;
            if(mufflerReplacementField.isSelected())
                cost+=MUFFLER_REPLACEMENT;
            if(tireRotationField.isSelected())
                cost+=TIRE_ROTATION;
            JOptionPane.showMessageDialog(null,"Total cost: "+dollar.format(cost));
        }
    }
    public static void main(String[] args){
        new PriceCalculator();
    }
}
