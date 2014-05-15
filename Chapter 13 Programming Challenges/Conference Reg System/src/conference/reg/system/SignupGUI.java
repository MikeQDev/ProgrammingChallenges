package conference.reg.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SignupGUI extends JFrame{
    private final int DINNER_PRICE = 30;
    private final int[] FEES = {295, 295, 395, 395}, REGISTRATION = {895, 495};
    private final String[] WORKSHOPS = {"Introduction to E-commerce","The Future of the Web",
                                            "Advanced Java Programming","Network Security"};
    private final String[] REGISTRATION_TYPES = {"General", "Student"};
    
    private JCheckBox dinnerCheck;
    private JList workshopList;
    private JComboBox registrationBox;
    private JButton calcButton;
    public SignupGUI() {
        setTitle("Conference Registrator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        JPanel smallCombo = new JPanel();
        workshopList = new JList(WORKSHOPS);
        registrationBox = new JComboBox(REGISTRATION_TYPES);
        dinnerCheck = new JCheckBox("Dinner");
        calcButton = new JButton("Calculate price");
        registrationBox.setBorder(BorderFactory.createTitledBorder("Registration type"));
        registrationBox.setPreferredSize(new Dimension(160,45));
        workshopList.setBorder(BorderFactory.createTitledBorder("Workshops"));
        smallCombo.add(registrationBox);
        calcButton.addActionListener(new CalcListen());
        add(smallCombo, BorderLayout.NORTH);
        add(dinnerCheck, BorderLayout.EAST);
        add(workshopList, BorderLayout.CENTER);
        add(calcButton, BorderLayout.SOUTH);
    }
    private class CalcListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int totalPrice = 0;
            if(dinnerCheck.isSelected())
                totalPrice+=DINNER_PRICE;
            int workshops = getWorkshops();
            totalPrice+=workshops;
            int regType = getRegistrationType();
            totalPrice+=regType;
            System.out.println(totalPrice);
        }
    }
    private int getWorkshops(){
        int workShopCost = 0;
        int[] selected = workshopList.getSelectedIndices();
        for(int s:selected)
            workShopCost+=FEES[s];
        return workShopCost;
    }
    private int getRegistrationType(){
        int registrationCost;
        int selected = registrationBox.getSelectedIndex();
        registrationCost = REGISTRATION[selected];
        return registrationCost;
    }
}
