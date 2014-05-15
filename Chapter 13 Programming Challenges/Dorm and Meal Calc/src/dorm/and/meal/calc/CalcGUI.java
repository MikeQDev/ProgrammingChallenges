package dorm.and.meal.calc;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class CalcGUI extends JFrame{
    private final String[] dormNames = {"Allen Hall","Pike Hall","Farthing Hall","University Suites"};
    private final String[] mealPlans = {"7 meals/week", "14 meals/week", "Unlimited meals"};
    private final int[] dormPrices = {1500, 1600, 1200, 1800};
    private final int[] mealPrices = {560, 1095, 1500};
    private JComboBox dormComboBox, mealComboBox;
    private JButton calcButton;
    private JLabel dormLabel, mealLabel;
    private JPanel dormPanel, mealPanel;
    private int finalDormCost=1500, finalMealCost=560;
    public CalcGUI() {
        setTitle("Dorm & Meal Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        dormPanel = new JPanel();
        mealPanel = new JPanel();
        dormComboBox = new JComboBox(dormNames);
        mealComboBox = new JComboBox(mealPlans);
        dormLabel = new JLabel("Dorm plan:");
        mealLabel = new JLabel("Meal plan:");
        calcButton = new JButton("Calculate price");
        
        dormComboBox.addItemListener(new DormListener());
        mealComboBox.addItemListener(new MealListener());
        calcButton.addActionListener(new CalcListener());
        
        dormPanel.add(dormLabel);
        dormPanel.add(dormComboBox);
        mealPanel.add(mealLabel);
        mealPanel.add(mealComboBox);
        
        add(dormPanel, BorderLayout.NORTH);
        add(mealPanel, BorderLayout.CENTER);
        add(calcButton, BorderLayout.SOUTH);
    }
    private class DormListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            int dormPlanChosen = dormComboBox.getSelectedIndex();
            finalDormCost = dormPrices[dormPlanChosen];
        }
    }
    private class MealListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            int mealPlanChosen = mealComboBox.getSelectedIndex();
            finalMealCost = mealPrices[mealPlanChosen];
        }
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            int totalCost = finalDormCost+finalMealCost;
            JOptionPane.showMessageDialog(null,"Dorm plan price: "+dollar.format(finalDormCost)
                                           + "\nMeal plan price: "+dollar.format(finalMealCost)
                                           + "\nTotal price: "+dollar.format(totalCost));
        }
    }
}
