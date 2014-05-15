package budgetanalysis;

import java.util.Scanner;

public class BudgetAnalysis {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int quit=-1337, budget, costs=0, totalCosts=0;
        
        System.out.print("Enter your monthly budget: $");
        budget = keyboard.nextInt();
        
        System.out.println("Money spent this month (type -1337 to quit): ");
        System.out.println("-------------------------------------------");
        
        for(int i=1; costs!=quit; i++){
            System.out.print("Enter cost #"+i+": ");
            costs = keyboard.nextInt();
            if(costs==quit){
            }else{
                totalCosts+=costs;
            }
        }
        
        System.out.println("Total costs: $"+totalCosts);
        
        if(totalCosts<budget){
            System.out.println("You are $"+(budget-totalCosts)+"u nder your budget.");
        }else if(totalCosts>budget){
            System.out.println("You are $"+(totalCosts-budget)+" over your budget.");
        }else{
            System.out.println("You are right on budget.");
        }
    }

}
