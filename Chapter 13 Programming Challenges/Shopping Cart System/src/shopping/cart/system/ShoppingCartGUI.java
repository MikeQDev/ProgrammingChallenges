package shopping.cart.system;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

class ShoppingCartGUI extends JFrame{
    private final String FILE_NAME = "BookPrices.txt";
    private final double SALES_TAX = .06;
    
    private String[] bookListArray;
    private double[] priceListArray;
    private JList bookList, selectedList;
    private JPanel selectPanel, selectedPanel, buttonPanel;
    private JButton addButton, removeButton, removeAllButton, calcButton;
    private DefaultListModel listModel;
    public ShoppingCartGUI() throws IOException{
        setTitle("Book Buyer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        unpackFile();
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        buildSelectPanel();
        buildSelectedPanel();
        buildButtonPanel();
        calcButton = new JButton("Check out");
        calcButton.addActionListener(new CalcListener());
        add(calcButton, BorderLayout.SOUTH);
    }
    private void buildSelectPanel(){
        selectPanel = new JPanel();
        selectPanel.setBorder(BorderFactory.createTitledBorder("Books for sale"));
        bookList = new JList(bookListArray);
        selectPanel.add(bookList);
        add(selectPanel, BorderLayout.WEST);
    }
    private void buildSelectedPanel(){
        selectedPanel = new JPanel();
        listModel = new DefaultListModel();
        selectedPanel.setBorder(BorderFactory.createTitledBorder("Books in cart"));
        selectedList = new JList(listModel);
        selectedList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane o = new JScrollPane(selectedList);
        o.setPreferredSize(new Dimension(180,127));
        selectedPanel.add(o);
        
        add(selectedPanel, BorderLayout.EAST);
    }
    private void buildButtonPanel(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1));
        removeAllButton = new JButton("Clear cart");
        addButton = new JButton("Add =>");
        removeButton = new JButton("<= Remove");
        addButton.addActionListener(new AddListener());
        removeButton.addActionListener(new RemoveListener());
        removeAllButton.addActionListener(new RemoveListener());
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(removeAllButton);
        add(buttonPanel, BorderLayout.CENTER);
    }
    private class CalcListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat dollar = new DecimalFormat("$#,###,##0.00");
            String[] newArray = new String[listModel.getSize()];
            listModel.copyInto(newArray);
            double total = 0;
            for(String s : newArray){
                for(int index=0; index<bookListArray.length; index++){
                    if(s.equalsIgnoreCase(bookListArray[index])){
                        total+=priceListArray[index];
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Subtotal: "+dollar.format(total)
                                            +"\nTotal (6% tax): "+dollar.format(total+(total*SALES_TAX)));
        }
    }
    private class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int[] selected = bookList.getSelectedIndices();
            String[] toAdd = new String[selected.length];
            for(int i=0; i<toAdd.length; i++)
                listModel.addElement(bookListArray[selected[i]]);
        }
    }
    private class RemoveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==removeButton){
                int selectedItem = selectedList.getSelectedIndex();
                listModel.remove(selectedItem);
            }else if(e.getSource()==removeAllButton){
                listModel.clear();
            }
        }
    }
    private void unpackFile() throws IOException{
        Scanner fileScanner = null;
        StringTokenizer o;
        ArrayList<String> aL = new ArrayList();
        bookList = new JList();
        try{
            fileScanner = new Scanner(new File(FILE_NAME));
        }catch(FileNotFoundException e){
            System.out.println("Error: book price file not found.. Exiting program.");
            System.exit(0);
        }
        while(fileScanner.hasNext()){
            aL.add(fileScanner.nextLine());
        }
        String[] listNames = aL.toArray(new String[aL.size()]);
        bookListArray = new String[aL.size()];
        String[] priceListString = new String[aL.size()];
        priceListArray = new double[aL.size()];
        for(int index=0; index<aL.size(); index++){
            String[] nextOne;
            nextOne = listNames[index].split(", ");
            priceListString[index] = nextOne[1];
            bookListArray[index] = nextOne[0];
        }
        for(int i=0; i<priceListString.length; i++){
            priceListArray[i] = Double.parseDouble(priceListString[i]);
        }
    }
}
