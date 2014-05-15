package shade.designer;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;

class DesignerGUI extends JFrame{
    private final String[] SHADE_TYPE = {"Regular","Folding","Roman"};
    private final String[] SHADE_SIZE = {"25 Inches","27 Inches","32 Inches","40 Inches"};
    private final String[] SHADE_COLOR = {"Natural","Blue","Teal","Red","Green"};
    private final int[] SHADE_TYPE_PRICE = {0, 5, 15};
    private final int[] SHADE_SIZE_PRICE = {0, 2, 4, 6};
    private final int[] SHADE_COLOR_PRICE = {5, 0, 0, 0, 0};
    private final String[] SHADE_AMOUNT = {"0","1","2","3","4","5","6","7","8","9"};
    private final int BASE_PRICE = 50;
    
    private JList typeList, sizeList, colorList;
    private JLabel priceLabel;
    private JTextField priceField;
    private JPanel listPanel, pricePanel;
    private JComboBox amountBox;
    private int finalTypePrice, finalSizePrice, finalColorPrice=5, amountNeeded;
    public DesignerGUI() {
        setTitle("Shade designer");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        listPanel = new JPanel();
        pricePanel = new JPanel();
        JPanel smallCombo = new JPanel();
        
        listPanel.setLayout(new GridLayout(1,4));
        typeList = new JList(SHADE_TYPE);
        sizeList = new JList(SHADE_SIZE);
        colorList = new JList(SHADE_COLOR);

        priceLabel = new JLabel("Total price: $");
        priceField = new JTextField("0.00",10);
        priceField.setEditable(false);
        pricePanel.setPreferredSize(new Dimension(500,35));
        amountBox = new JComboBox(SHADE_AMOUNT);
        amountBox.setBorder(BorderFactory.createTitledBorder("Amount of shades"));
        amountBox.setEditable(true);
        amountBox.addItemListener(new AmountListener());
        smallCombo.add(amountBox);
        typeList.setSelectedIndex(0);
        sizeList.setSelectedIndex(0);
        colorList.setSelectedIndex(0);
        typeList.setBorder(BorderFactory.createTitledBorder("Shade style"));
        sizeList.setBorder(BorderFactory.createTitledBorder("Shade size"));
        colorList.setBorder(BorderFactory.createTitledBorder("Shade color"));
        typeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        typeList.addListSelectionListener(new ListListener());
        sizeList.addListSelectionListener(new ListListener());
        colorList.addListSelectionListener(new ListListener());
        
        listPanel.add(typeList);
        listPanel.add(sizeList);
        listPanel.add(colorList);
        listPanel.add(smallCombo);
        
        pricePanel.add(priceLabel);
        pricePanel.add(priceField);
        
        add(listPanel);
        add(pricePanel, BorderLayout.SOUTH);
    }
    private class ListListener implements ListSelectionListener{
        public void valueChanged(ListSelectionEvent e){
            if(e.getSource()==typeList)
                finalTypePrice = SHADE_TYPE_PRICE[typeList.getSelectedIndex()];
            else if(e.getSource()==sizeList)
                finalSizePrice = SHADE_SIZE_PRICE[sizeList.getSelectedIndex()];
            else if(e.getSource()==colorList)
                finalColorPrice = SHADE_COLOR_PRICE[colorList.getSelectedIndex()];
            getNewTotal();
        }
    }
    private class AmountListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            String getItem = (String)amountBox.getSelectedItem();
            amountNeeded = Integer.parseInt(getItem);
            getNewTotal();
        }
    }
    private void getNewTotal(){
        DecimalFormat dollar = new DecimalFormat("#,###,##0.00");
        int newTotal = (BASE_PRICE+finalTypePrice+finalSizePrice+finalColorPrice)*amountNeeded;
        priceField.setText(dollar.format(newTotal));
    }
}
