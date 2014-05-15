package retailitem.exception;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RetailItemException {

    public static void main(String[] args) throws NegativePrice {
        String input;
        DecimalFormat f = new DecimalFormat("$###,###,##0.00");
        
        try{
            input = JOptionPane.showInputDialog("Enter retail price");
            RetailItem r = new RetailItem(Double.parseDouble(input));
            input = JOptionPane.showInputDialog("Enter units on hand");
            r.setUnitsOnHand(Integer.parseInt(input));
            System.out.println("Price: "+f.format(r.getPrice()));
            System.out.println("Units on hand: "+r.getUnitsOnHand());
        }catch(NegativePrice|NegativeUnits e){
            System.out.println(e.getMessage());
        }
        
        System.exit(0);        
    }

}
