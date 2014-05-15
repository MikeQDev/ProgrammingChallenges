package freezingandboilingpointsproject;

import java.util.Scanner;

public class FreezingAndBoilingPointsProject {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp;
        System.out.print("Enter a temperature: ");
        temp = keyboard.nextInt();
        
        Temp x = new Temp(temp);
        
        System.out.println("Freezes\t\t\tBoils");
        System.out.println("------------------------------------------");
        if(x.isEthylFreezing()){
            System.out.println("Ethyl Alcohol");
        }else if(x.isEthylBoiling()){
            System.out.println("\t\t\tEthyl Alcohol");
        }
        if(x.isOxygenFreezing()){
            System.out.println("Oxygen");
        }else if(x.isOxygenBoiling()){
            System.out.println("\t\t\tOxygen");
        }
        if(x.isWaterFreezing()){
            System.out.println("Water");
        }else if(x.isWaterBoiling()){
            System.out.println("\t\t\tWater");
        }
    }
}
