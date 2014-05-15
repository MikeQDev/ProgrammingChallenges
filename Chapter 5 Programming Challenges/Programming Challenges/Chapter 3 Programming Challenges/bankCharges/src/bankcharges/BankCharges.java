package bankcharges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankCharges {
    
    public static void main(String[] args) {
        int checks, baseFee=10;
        double less20=.1, less39=.08, less59=.06, more60=.04, cost;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter amount of checks written for the month: ");
        checks=keyboard.nextInt();
        
        DecimalFormat formatter=new DecimalFormat("$##.00");
        
        if(checks>=60){
            cost=10+(checks*more60);
            System.out.println("The total cost is: "+formatter.format(cost)+".");
        }else if(checks>=40){
            cost=10+(checks*less59);
            System.out.println("The total cost is: "+formatter.format(cost)+".");
        }else if(checks>=20){
            cost=10+(checks*less39);
            System.out.println("The total cost is: "+formatter.format(cost)+".");
        }else{
            cost=10+(checks*less20);
            System.out.println("The total cost is: "+formatter.format(cost)+".");
        }
        
        
    }

}
