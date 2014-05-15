package travelexpenses;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class TravelExpenseCalculator extends JFrame{
    private final double MEAL_REIM = 37, PARKING_REIM = 10, TAXI_REIM = 20, LODGING_REIM = 95, MILES_REIM = .27;
    private JPanel totalDaysPanel, airfarePanel, carRentalPanel, milesDrivenPanel,
                    parkingFeePanel, taxiPanel, registrationPanel, lodgingPanel;
    private JTextField totalDaysField, airfareField, carRentalField, milesDrivenField,
                    parkingFeeField, taxiField, registrationField, lodgingField;
    private JLabel totalDaysLabel, airfareLabel, carRentalLabel, milesDrivenLabel,
                    parkingFeeLabel, taxiLabel, registrationLabel, lodgingLabel;
    private JButton calcButton;
    private JCheckBox rentalCheck;
    
    public TravelExpenseCalculator() {
        setTitle("Travel Expense Calculator");
        setSize(339,190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        setVisible(true);
    }
    public void buildPanel(){
        setLayout(new BorderLayout());
        totalDaysLabel = new JLabel("Total days");
        airfareLabel = new JLabel("Airfare fees $");
        carRentalLabel = new JLabel("Car rental fee $");
        milesDrivenLabel = new JLabel("Miles driven");
        parkingFeeLabel = new JLabel("Parking fees $");
        taxiLabel = new JLabel("Taxi fees $");
        registrationLabel = new JLabel("Regsitration fees $");
        lodgingLabel = new JLabel("Lodging fees(p/n) $");
        calcButton = new JButton("Calculate");
        rentalCheck = new JCheckBox("Rental car",true);
        
        totalDaysField = new JTextField(4);
        airfareField = new JTextField(4);
        carRentalField = new JTextField(4);
        milesDrivenField = new JTextField(4);
        milesDrivenField.setText("0");
        milesDrivenField.setEditable(false);
        parkingFeeField = new JTextField(4);
        taxiField = new JTextField(4);
        registrationField = new JTextField(4);
        lodgingField = new JTextField(4);
        
        JPanel rentalCheckPanel = new JPanel();  
        rentalCheckPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        totalDaysPanel = new JPanel();
        totalDaysPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        airfarePanel = new JPanel();
        airfarePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        carRentalPanel = new JPanel();
        carRentalPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        milesDrivenPanel = new JPanel();
        milesDrivenPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        parkingFeePanel = new JPanel();
        parkingFeePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        taxiPanel = new JPanel();
        taxiPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        registrationPanel = new JPanel();
        registrationPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        lodgingPanel = new JPanel();
        lodgingPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        rentalCheckPanel.add(rentalCheck);
        totalDaysPanel.add(totalDaysLabel);
        totalDaysPanel.add(totalDaysField);
        airfarePanel.add(airfareLabel);
        airfarePanel.add(airfareField);
        carRentalPanel.add(carRentalLabel);
        carRentalPanel.add(carRentalField);
        milesDrivenPanel.add(milesDrivenLabel);
        milesDrivenPanel.add(milesDrivenField);
        parkingFeePanel.add(parkingFeeLabel);
        parkingFeePanel.add(parkingFeeField);
        taxiPanel.add(taxiLabel);
        taxiPanel.add(taxiField);
        registrationPanel.add(registrationLabel);
        registrationPanel.add(registrationField);
        lodgingPanel.add(lodgingLabel);
        lodgingPanel.add(lodgingField);
        
        rentalCheck.addItemListener(new CheckListener());
        calcButton.addActionListener(new CalcListener());
        
        JPanel east = new JPanel();
        east.setLayout(new GridLayout(5,1));
        
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(5,1));
        
        west.add(totalDaysPanel);
        west.add(airfarePanel);
        west.add(carRentalPanel);
        west.add(milesDrivenPanel);
        west.add(rentalCheckPanel);
        east.add(parkingFeePanel);
        east.add(taxiPanel);
        east.add(registrationPanel);
        east.add(lodgingPanel);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(calcButton, BorderLayout.SOUTH);
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            int totalDays=0;
            double airfareFees=0, carRentalFees=0, milesDrivenFees=0,
                    parkingFees=0, taxiFees=0, registrationFees=0, lodgingFees=0;
            try{
                totalDays = Integer.parseInt(totalDaysField.getText());
                airfareFees = Double.parseDouble(airfareField.getText());
                carRentalFees = Double.parseDouble(carRentalField.getText());
                milesDrivenFees = Double.parseDouble(milesDrivenField.getText());
                parkingFees = Double.parseDouble(parkingFeeField.getText());
                taxiFees = Double.parseDouble(taxiField.getText());
                registrationFees = Double.parseDouble(registrationField.getText());
                lodgingFees = Double.parseDouble(lodgingField.getText());
                double mealsReimbursed = totalDays * MEAL_REIM;
                double parkingReimbursed = totalDays * PARKING_REIM;
                double taxiReimbursed = totalDays * TAXI_REIM;
                double lodgingReimbursed = totalDays * LODGING_REIM;
                double milesReimbursed = milesDrivenFees * MILES_REIM;
                double totalExpenses = airfareFees+carRentalFees+parkingFees+taxiFees
                                        +registrationFees+lodgingFees;
                double reimbursedMoney = mealsReimbursed + parkingReimbursed + taxiReimbursed
                                        +lodgingReimbursed + milesReimbursed;
                double moneyOwed = totalExpenses-reimbursedMoney;
                if(moneyOwed>0)
                JOptionPane.showMessageDialog(null, "Total expenses: "+dollar.format(totalExpenses)
                                                +"\nTotal allowed expenses: "+dollar.format(reimbursedMoney)
                                                +"\nMoney owed: "+dollar.format(moneyOwed));
                else
                    JOptionPane.showMessageDialog(null, "Total expenses: "+dollar.format(totalExpenses)
                                                +"\nTotal allowed expenses: "+dollar.format(reimbursedMoney)
                                                +"\nSaved money: "+dollar.format(moneyOwed*-1));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error. Form not completed/contains invalid data.");
            }
        }
    }
    private class CheckListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(e.getSource()==rentalCheck){
                if(rentalCheck.isSelected()){
                    carRentalField.setEditable(true);
                    milesDrivenField.setEditable(false);
                    milesDrivenField.setText("0");
                }else{
                    carRentalField.setEditable(false);
                    milesDrivenField.setEditable(true);
                    carRentalField.setText("0");
                }
            }
        }
    }
    public static void main(String[] args){
        new TravelExpenseCalculator();
    }
}
