package magicdates;

import java.util.Scanner;

public class MagicDates {
    
    public static void main(String[] args) {
        int month, day, year;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a month in numeric format: ");
        month = keyboard.nextInt();
        System.out.print("Enter a day in numerical format: ");
        day = keyboard.nextInt();
        System.out.print("Enter a year: 19");
        year = keyboard.nextInt();
        
        int monthDay=month*day;
        
        if(monthDay==year){
            System.out.println("The date is magic.");
        }else{
            System.out.println("The date is not magic.");
        }
        
    }

}
