package internetserviceprovider;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InternetServiceProvider {
    
    public static void main(String[] args) {
        String input;
        char choice, choicex, choicey;
        int hours;
        Scanner keyboard=new Scanner(System.in);
        DecimalFormat formatter=new DecimalFormat("$##.00");
        
        System.out.print("Enter a choice: ");
        input=keyboard.nextLine();
        System.out.print("Enter amount of hours used: ");
        hours=keyboard.nextInt();     
        
        input=input.toUpperCase();
        choice=input.charAt(0);        
        
        double aRegular=9.95, bRegular=13.95, cRegular=19.95,
                costA=aRegular+(((hours-10)*2)),
                costB=bRegular+(((hours-20)*1));
        
        switch(choice){
            case 'A':
                if(hours>10){
                System.out.println("Your total is: "+formatter.format(costA));
                System.out.println("By switching to package B,"
                        + " you would save "+(formatter.format(costA-costB))+".");
                System.out.println("By switching to package C,"
                        + " you would save "+(formatter.format(costA-cRegular))+".");
                }else{
                    System.out.println("Your total is "+formatter.format(aRegular));
                }
                break;
            case 'B':
                if(hours>20){
                    System.out.println("Your total is: "+formatter.format(costB));
                    System.out.println("By switching to package C,"
                            + " you would save "+formatter.format(costB-cRegular)+".");
                }else{
                    System.out.println("Your total is: "+formatter.format(bRegular));
                }
                break;
            case 'C':
                System.out.println("Your total is: "+formatter.format(cRegular));
                break;
            default:
                System.out.println("Please enter an appropiate package choice.");
        }
    }
}