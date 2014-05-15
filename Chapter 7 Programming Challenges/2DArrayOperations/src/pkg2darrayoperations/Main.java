package pkg2darrayoperations;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        int total, highestInRow, lowestInRow;
        double getAverage;
        TestData t = new TestData();
        
        total = t.getTotal();
        System.out.println("Total: "+total);
        
        getAverage = t.getAverage();
        System.out.println("Average: "+getAverage);
        
        String input = JOptionPane.showInputDialog("Enter row to total (0-1).");
        int in = Integer.parseInt(input);
        t.getRowTotal(in);
        input = JOptionPane.showInputDialog("Enter column to total.");
        in = Integer.parseInt(input);
        t.getColTotal(in);
        input = JOptionPane.showInputDialog("Enter a row to get highest value (0-1).");
        in = Integer.parseInt(input);
        highestInRow = t.getHighestRow(in);
        System.out.println("Row "+in+" highest value: "+highestInRow);
        input = JOptionPane.showInputDialog("Enter a row to get lowest value (0-1).");
        in = Integer.parseInt(input);       
        lowestInRow = t.getLowestRow(in);
        System.out.println("Row "+in+" lowest value: "+lowestInRow);
        System.exit(0);
    }

}
