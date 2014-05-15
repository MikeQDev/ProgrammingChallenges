package shippingcharges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ShippingCharges {
    
    public static void main(String[] args) {
        int weight;
        double twoLess=1.1, over2Less6=2.2, over6Less10=3.7, over10=3.8;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter a package weight (in lbs): ");
        weight=keyboard.nextInt();
        
        DecimalFormat formatter=new DecimalFormat("$#0.00");
        
        if(weight>10){
            System.out.println("The shipping charge would be "+formatter.format(over10));
        }else if(weight>6){
            System.out.println("The shipping charge would be "+formatter.format(over6Less10));
        }else if(weight>2){
            System.out.println("The shipping charge would be "+formatter.format(over2Less6));
        }else{
            System.out.println("The shipping charge would be "+formatter.format(twoLess));
        }
    }

}
