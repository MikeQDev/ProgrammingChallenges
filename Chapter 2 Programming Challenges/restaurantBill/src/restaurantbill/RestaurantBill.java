package restaurantbill;

import java.util.Scanner;

public class RestaurantBill {
    
    public static void main(String[] args) {
        double tax=.0675, tip=.15, mealCost;
        Scanner input=new Scanner(System.in);
                
        System.out.print("Enter the cost of your meal: $");
        mealCost = input.nextDouble();
        
        double totalTax=mealCost*tax, totalTip=mealCost*tip, 
                totalCost=mealCost+totalTax+totalTip;
        
        
        System.out.println("Meal cost: $"+mealCost+"\nTax amount: $"
                +totalTax+"\nTip amount: $"+totalTip+"\nTotal cost: $"+totalCost);
    }

}
