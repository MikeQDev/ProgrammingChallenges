package penniesforpay;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PenniesForPay {
    
    public static void main(String[] args) {
        DecimalFormat dollarFormat = new DecimalFormat("$#,####,##0.00");
        Scanner keyboard = new Scanner(System.in);
        int days;
        double pay=.01, totalPay=0;
        
        do{
            System.out.print("Enter amount of days worked: ");
            days = keyboard.nextInt();
        }while(days<=0);
        
        for(int i=1; i<=days; i++, pay+=pay){
            System.out.println("Day "+i+": "+pay);
            totalPay+=pay;
        }
        System.out.println("Total: "+dollarFormat.format(totalPay));
    }

}
