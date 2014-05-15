package cashregisterclass;

import java.util.Scanner;

public class CashRegisterClass {

    public static void main(String[] args) {
        int qty;
        double price;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter quantity of items being purchased: ");
        qty = s.nextInt();
        
        System.out.print("Enter price of an item: ");
        price = s.nextDouble();
        
        RetailItem i = new RetailItem(price);
        CashRegister r = new CashRegister(i,qty);
        
        System.out.println(r);
    }

}
