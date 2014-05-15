package fatgramcalc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FatGramCalc {
    
    public static void main(String[] args) {
        int calories, fatGrams;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter amount of calories in a food: ");
        calories=keyboard.nextInt();
        System.out.print("Enter amount of grams of fat in a food: ");
        fatGrams=keyboard.nextInt();
        
        double calFromFat=fatGrams*9, calTotal=(calFromFat/calories);
        
        if(calTotal<.3){
            System.out.println("This food is low in fat.");
        }
    }

}
