package cell.phone.pkgpackage;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;

class PackageGUI extends JFrame{
    private final double MODEL100PRICE = 29.95, MODEL110PRICE = 49.95, MODEL200PRICE = 99.95;
    private final int MINUTE300PRICE = 45, MINUTE800PRICE = 65, MINUTE1500PRICE = 99;
    private final int VOICEPRICE = 5, TEXTPRICE = 10;
    
    private final DecimalFormat DOLLAR = new DecimalFormat("$#,###,##0.00");
    
    private JMenuBar menuBar;
    private JMenu modelMenu, minuteMenu, extraMenu;
    private JRadioButtonMenuItem model100Item, model110Item, model200Item;
    private JRadioButtonMenuItem minute300Item, minute800Item, minute1500Item;
    private JCheckBoxMenuItem voiceMailItem, textMessageItem;
    private boolean textMessagingSelected, voiceMailSelected;
    
    private JTextField selectedModelField, selectedMinuteField, textMessageField, voiceMailField;
    private JLabel selectedModelLabel, selectedMinuteLabel, textMessageLabel, voiceMailLabel, totalLabel;
    private JTextField modelCost, minuteCost, textCost, voiceCost, totalCost;
    private double modelFinalCost=29.95, minuteFinalCost=65, textFinalCost=0, voiceFinalCost=5;
    
    public PackageGUI() {
        setTitle("Phone package calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildMenu();
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        setLayout(new GridLayout(5,3,5,9));
        selectedModelField = new JTextField("Model 100",5);
        selectedMinuteField = new JTextField("800 min/month",5);
        textMessageField = new JTextField("Disabled",5);
        voiceMailField = new JTextField("Enabled",5);
        selectedModelLabel = new JLabel("Selected model: ");
        selectedMinuteLabel = new JLabel("Selected package: ");
        textMessageLabel = new JLabel("Text messaging: ");
        voiceMailLabel = new JLabel("Voicemail: ");
        modelCost = new JTextField(DOLLAR.format(modelFinalCost));
        minuteCost = new JTextField(DOLLAR.format(minuteFinalCost));
        textCost = new JTextField(DOLLAR.format(textFinalCost));
        voiceCost = new JTextField(DOLLAR.format(voiceFinalCost));
        totalLabel = new JLabel("Total cost: ");
        totalCost = new JTextField(DOLLAR.format(modelFinalCost+minuteFinalCost+textFinalCost+voiceFinalCost));
        
        totalCost.setEditable(false);
        modelCost.setEditable(false);
        minuteCost.setEditable(false);
        textCost.setEditable(false);
        voiceCost.setEditable(false);
        selectedModelField.setEditable(false);
        selectedMinuteField.setEditable(false);
        textMessageField.setEditable(false);
        voiceMailField.setEditable(false);
        
        add(selectedModelLabel);
        add(selectedModelField);
        add(modelCost);
        add(selectedMinuteLabel);
        add(selectedMinuteField);
        add(minuteCost);
        add(textMessageLabel);
        add(textMessageField);
        add(textCost);
        add(voiceMailLabel);
        add(voiceMailField);
        add(voiceCost);
        add(totalLabel);
        add(totalCost);
    }
    private void buildMenu(){
        menuBar = new JMenuBar();
        buildModelMenu();
        buildMinuteMenu();
        buildExtraMenu();
        setJMenuBar(menuBar);
    }
    private void buildModelMenu(){
        modelMenu = new JMenu("Model");
        model100Item = new JRadioButtonMenuItem("Model 100", true);
        model110Item = new JRadioButtonMenuItem("Model 110");
        model200Item = new JRadioButtonMenuItem("Model 200");
        ButtonGroup group = new ButtonGroup();
        group.add(model100Item);
        group.add(model110Item);
        group.add(model200Item);
        model100Item.addItemListener(new ModelListener());
        model110Item.addItemListener(new ModelListener());
        model200Item.addItemListener(new ModelListener());
        modelMenu.add(model100Item);
        modelMenu.add(model110Item);
        modelMenu.add(model200Item);
        menuBar.add(modelMenu);
    }
    private void buildMinuteMenu(){
        minuteMenu = new JMenu("Minutes Package");
        minute300Item = new JRadioButtonMenuItem("300 minutes");
        minute800Item = new JRadioButtonMenuItem("800 minutes", true);
        minute1500Item = new JRadioButtonMenuItem("1500 minutes");
        ButtonGroup group = new ButtonGroup();
        group.add(minute300Item);
        group.add(minute800Item);
        group.add(minute1500Item);
        minute300Item.addItemListener(new MinuteListener());
        minute800Item.addItemListener(new MinuteListener());
        minute1500Item.addItemListener(new MinuteListener());
        minuteMenu.add(minute300Item);
        minuteMenu.add(minute800Item);
        minuteMenu.add(minute1500Item);
        menuBar.add(minuteMenu);
    }
    private void buildExtraMenu(){
        extraMenu = new JMenu("Additional Services");
        voiceMailItem = new JCheckBoxMenuItem("Voice Mail", true);
        textMessageItem = new JCheckBoxMenuItem("Text messaging");
        textFinalCost = 0;
        voiceFinalCost = VOICEPRICE;
        voiceMailItem.addActionListener(new ExtraListener());
        textMessageItem.addActionListener(new ExtraListener());
        extraMenu.add(voiceMailItem);
        extraMenu.add(textMessageItem);
        menuBar.add(extraMenu);
    }
    private class ModelListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(model100Item.isSelected()){
                modelFinalCost = MODEL100PRICE;
                selectedModelField.setText("Model 100");
            }else if(model110Item.isSelected()){
                modelFinalCost = MODEL110PRICE;
                selectedModelField.setText("Model 110");
            }else if(model200Item.isSelected()){
                modelFinalCost = MODEL200PRICE;
                selectedModelField.setText("Model 200");
            }
            modelCost.setText(DOLLAR.format(modelFinalCost));
            totalCost.setText(DOLLAR.format(modelFinalCost+minuteFinalCost+textFinalCost+voiceFinalCost));
        }
    }
    private class MinuteListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(minute300Item.isSelected()){
                selectedMinuteField.setText("300 min/month");
                minuteFinalCost = MINUTE300PRICE;
            }else if(minute800Item.isSelected()){
                selectedMinuteField.setText("800 min/month");
                minuteFinalCost = MINUTE800PRICE;
            }else if(minute1500Item.isSelected()){
                selectedMinuteField.setText("1500 min/month");
                minuteFinalCost = MINUTE1500PRICE;
            }
            minuteCost.setText(DOLLAR.format(minuteFinalCost));
            totalCost.setText(DOLLAR.format(modelFinalCost+minuteFinalCost+textFinalCost+voiceFinalCost));
        }
    }
    private class ExtraListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==voiceMailItem){
                if(voiceMailItem.isSelected()){
                    voiceFinalCost = VOICEPRICE;
                    voiceMailField.setText("Enabled");
                }else{
                    voiceFinalCost = 0;
                    voiceMailField.setText("Disabled");
                }
                voiceCost.setText(DOLLAR.format(voiceFinalCost));
            }
            if(e.getSource()==textMessageItem){
                if(textMessageItem.isSelected()){
                    textFinalCost = TEXTPRICE;
                    textMessageField.setText("Enabled");
                }else{
                    textFinalCost = 0;
                    textMessageField.setText("Disabled");
                    
                }
                textCost.setText(DOLLAR.format(textFinalCost));
            }
            totalCost.setText(DOLLAR.format(modelFinalCost+minuteFinalCost+textFinalCost+voiceFinalCost));
        }
    }
}
