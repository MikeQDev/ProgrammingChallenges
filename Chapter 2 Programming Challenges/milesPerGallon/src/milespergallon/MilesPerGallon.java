package milespergallon;

import java.util.Scanner;

public class MilesPerGallon {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of miles driven: ");
        double miles=input.nextDouble();
        
        System.out.print("Enter the amount of gallons used: ");
        double gallons=input.nextDouble();
        
        double mpg=miles/gallons;
        System.out.println("You get "+mpg+" miles per gallon.");        
    }

}
