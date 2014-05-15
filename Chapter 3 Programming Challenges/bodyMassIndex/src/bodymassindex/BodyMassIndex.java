package bodymassindex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {
    
    public static void main(String[] args) {
        double weight, height;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        weight=keyboard.nextDouble();
        System.out.print("Enter your height in inches: ");
        height=keyboard.nextDouble();
        
        double BMItot = weight*703/(height*height);
        DecimalFormat BMI = new DecimalFormat("##.#");
        System.out.printf(BMI.format(BMItot)+"\n");
    }

}
