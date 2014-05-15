package paintjobestimator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        double gallons, hours, paintCost, laborCost;
        gallons = gallons();
        hours = hours(gallons);
        paintCost=paintCost(gallons);
        laborCost=laborCost(hours);
        totalCost(paintCost, laborCost);
    }
    public static double gallons(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter amount of sq. feet to be painted: ");
        double feet = keyboard.nextDouble();
        double gallons=feet/115;
        return gallons;
    }
    public static double hours(double gallons){
        return gallons*8;
    }
    public static double paintCost(double gallons){
        double price, paintCost;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter cost of paint per gallon($): ");
        price=keyboard.nextDouble();
        return paintCost=gallons*price;
    }
    public static double laborCost(double hours){
        return hours*18;
    }
    public static void totalCost(double paintCost, double laborCost){
        DecimalFormat formatter = new DecimalFormat("$#,###,###.00");
        double total=laborCost+paintCost;
        System.out.println("The total cost of the job will be "+formatter.format(total));
    }

}
