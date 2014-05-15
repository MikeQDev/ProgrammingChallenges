package timecalculator;

import java.util.Scanner;

public class TimeCalculator {
    
    public static void main(String[] args) {
        int seconds;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter a number of seconds: ");
        seconds=keyboard.nextInt();
        
        int minutes=seconds/60, hours=seconds/3600, days=seconds/86400;
        
        if(seconds>=86400)
            System.out.println("There is "+days+" days in "+seconds+" seconds.");
        else if(seconds>=3600)
            System.out.println("There are "+hours+" hours in "+seconds+" seconds.");
        else if(seconds>=60)
            System.out.println("There are "+minutes+" minutes in "+seconds+" seconds.");
        else
            System.out.println(seconds+" seconds.");
        
    }

}
