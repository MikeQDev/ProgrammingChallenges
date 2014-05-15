package circuitboardprofit;

import java.util.Scanner;

public class CircuitBoardProfit {
    
    public static void main(String[] args) {
        double profitPercent=.4, price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of a circuit board: $");
        price=input.nextDouble();
        double profit=price*profitPercent;
        
        System.out.println("A circuit board with a retail price of $"+price+" has a $"+profit+" profit.");
    }

}
