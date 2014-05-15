package population;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Population {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter=new DecimalFormat("##.##");
        int days;
        double increase, starting;
        do{        
            System.out.print("Enter starting number of organisms (Minimum 2): ");
            starting=keyboard.nextDouble();
        }while(starting<2);
        System.out.print("Enter daily population increase (as decimal percentage): ");
        increase=keyboard.nextDouble();
        do{
            System.out.print("Enter amount of days they multiply (Minimum 1): ");
            days=keyboard.nextInt();
        }while(days<1);
        
        
        for(int i=1; i<=days; i++){
            
            System.out.println("Day "+i+": "+formatter.format(starting)+" organisms.");
            starting=(increase*starting)+starting;
        }
    }
}