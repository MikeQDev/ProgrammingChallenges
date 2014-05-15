package longdistancecall;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

class CallCalculator extends JFrame{
    private final double DAYTIME_RATE = .07, EVENING_RATE = .12, OFF_PEAK_RATE = .05;
    private JRadioButton dayRadio, eveningRadio, offRadio;
    private JLabel minLabel;
    private JTextField minField;
    private JButton calcButton;
    private ButtonGroup group;
    
    public CallCalculator() {
        setTitle("Long distance call calculator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        setVisible(true);
    }
    public void buildPanel(){
        setLayout(new GridLayout(1,2));
        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3,1));
        radioPanel.setBorder(BorderFactory.createTitledBorder("Time"));
        JPanel minutePanel = new JPanel();
        JPanel calcPanel = new JPanel();
        
        minutePanel.setLayout(new FlowLayout());
        minField = new JTextField(4);
        minLabel = new JLabel("Minutes used");
        
        calcButton = new JButton("Calculate");
        
        group = new ButtonGroup();
        dayRadio = new JRadioButton("Daytime (6:00AM-5:59PM)",true);
        eveningRadio = new JRadioButton("Evening (6:00PM-11:59PM)");
        offRadio = new JRadioButton("Off-Peak (12:00AM-5:59AM)");
        
        group.add(dayRadio);
        group.add(eveningRadio);
        group.add(offRadio);
        
        add(dayRadio);
        add(eveningRadio);
        add(offRadio);
        
        radioPanel.add(dayRadio);
        radioPanel.add(eveningRadio);
        radioPanel.add(offRadio);
        
        minutePanel.add(minLabel);
        minutePanel.add(minField);
        
        calcPanel.add(calcButton);
        
        JPanel rightPanel = new JPanel();
        
        rightPanel.setLayout(new GridLayout(2,1));
        
        rightPanel.add(minutePanel);
        rightPanel.add(calcPanel);
        
        calcButton.addActionListener(new CalcListener());
        
        add(radioPanel);
        add(rightPanel);
        
        pack();
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            double cost;
            double minutes = Double.parseDouble(minField.getText());
            if(dayRadio.isSelected())
                cost = DAYTIME_RATE;
            else if(eveningRadio.isSelected())
                cost = EVENING_RATE;
            else
                cost = OFF_PEAK_RATE;
            JOptionPane.showMessageDialog(null,"Total cost: "+dollar.format(cost*minutes));
        }
    }
    public static void main(String[] args){
        new CallCalculator();
    }
}
