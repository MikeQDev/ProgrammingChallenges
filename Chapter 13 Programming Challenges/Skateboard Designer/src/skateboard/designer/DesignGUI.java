package skateboard.designer;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class DesignGUI extends JFrame{
    private final String[] deckArray = {"The Master Thrasher","The Dictator","The Street King"};
    private final String[] truckArray = {"7.75 inch axle","8 inch axle","8.5 inch axle"};
    private final String[] wheelArray = {"51 mm","55 mm","58 mm","61 mm"};
    private final String[] otherArray = {"Grip tape","Bearings","Riser pads","Nuts & bolts kit"};
    private final int[] deckPriceArray = {60,45,50};
    private final int[] truckPriceArray = {35,40,45};
    private final int[] wheelPriceArray = {20,22,24,28};
    private final int[] otherPriceArray = {10,30,2,3};
    private final double salesTax = .06;
    
    private JComboBox deckComboBox, truckComboBox, wheelComboBox;
    private JLabel deckLabel, truckLabel, wheelLabel;
    private JList otherList;
    private JPanel deckPanel,truckPanel, wheelPanel, allPanel, otherPanel;
    private JButton calcButton;
    private int finalDeckPrice, finalTruckPrice, finalWheelPrice, finalOtherPrice;
    public DesignGUI() {
        setTitle("Skateboard Designer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        allPanel = new JPanel();
        allPanel.setLayout(new GridLayout(3,1));
        buildDeckPanel();
        buildTruckPanel();
        buildWheelPanel();
        buildOtherList();
        add(allPanel, BorderLayout.CENTER);
    }
    private void buildDeckPanel(){
        deckPanel = new JPanel();
        deckComboBox = new JComboBox(deckArray);
        deckLabel = new JLabel("Deck:");
        deckPanel.add(deckLabel);
        deckPanel.add(deckComboBox);
        allPanel.add(deckPanel);
    }
    private void buildTruckPanel(){
        truckPanel = new JPanel();
        truckComboBox = new JComboBox(truckArray);
        truckLabel = new JLabel("Truck assembly:");
        truckPanel.add(truckLabel);
        truckPanel.add(truckComboBox);
        allPanel.add(truckPanel);
    }
    private void buildWheelPanel(){
        wheelPanel = new JPanel();
        wheelComboBox = new JComboBox(wheelArray);
        wheelLabel = new JLabel("Wheels:");
        wheelPanel.add(wheelLabel);
        wheelPanel.add(wheelComboBox);
        allPanel.add(wheelPanel);
    }
    private void buildOtherList(){
        otherPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2,1));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1));
        otherPanel.setBorder(BorderFactory.createTitledBorder("Accessories"));
        otherList = new JList(otherArray);
        calcButton = new JButton("Calculate Price");
        calcButton.addActionListener(new CalcListener());
        otherPanel.add(otherList);
        buttonPanel.add(calcButton);
        eastPanel.add(otherPanel);
        eastPanel.add(buttonPanel);
        add(eastPanel, BorderLayout.EAST);
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            finalDeckPrice = deckPriceArray[deckComboBox.getSelectedIndex()];
            finalTruckPrice = truckPriceArray[truckComboBox.getSelectedIndex()];
            finalWheelPrice = wheelPriceArray[wheelComboBox.getSelectedIndex()];
            finalOtherPrice = getOthersPrice();
            int totalPrice = finalDeckPrice+finalTruckPrice+finalWheelPrice+finalOtherPrice;
            JOptionPane.showMessageDialog(null,"Deck price: "+dollar.format(finalDeckPrice)
                                            + "\nTruck price: "+dollar.format(finalTruckPrice)
                                            + "\nWheel price: "+dollar.format(finalWheelPrice)
                                            + "\nAccessory price: "+dollar.format(finalOtherPrice)
                                            + "\nTotal price: "+dollar.format(totalPrice));
        }
    }
    private int getOthersPrice(){
        int total=0;
        int[] gert = otherList.getSelectedIndices();
        for(int s : gert)
            total+=otherPriceArray[s];
        return total;
    }

}
