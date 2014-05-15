package multiplestocksales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultipleStockSales {

    public static void main(String[] args) {
        DecimalFormat formatter=new DecimalFormat("$#,###,###,###.00");
        double numShares, purchasePricePerSale, purchaseComm,
                sellPricePerShare, sellComm, totalProfit=0, profit;
        int trans;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter amount of total transactions: ");
        trans=keyboard.nextInt();
        
        for(int i=1; i<=trans; i++){
            System.out.print("Enter number of shares for transaction "+i+": ");
            numShares=keyboard.nextDouble();
            System.out.print("Enter purchase price per stock in transaction "+i+ ": $");
            purchasePricePerSale=keyboard.nextDouble();
            System.out.print("Enter purchase commission for transaction "+i+": $");
            purchaseComm=keyboard.nextDouble();
            System.out.print("Enter sell price per share for transaction "+i+": $");
            sellPricePerShare=keyboard.nextDouble();
            System.out.print("Enter sell commission for transaction "+i+": $");
            sellComm=keyboard.nextDouble();
            
            profit=profit(numShares,purchasePricePerSale,purchaseComm,
                sellPricePerShare,sellComm);
            
            System.out.println("Profit: "+formatter.format(profit));
            totalProfit+=profit;
            System.out.println("");
        }
        System.out.println("Total profits: "+formatter.format(totalProfit));
    }
    public static double profit(double numShares, double purchasePricePerSale,
            double purchaseComm, double sellPricePerShare, double sellComm){
        double profit;
        return profit = ((numShares*sellPricePerShare)-sellComm)-
                ((numShares*purchasePricePerSale)+purchaseComm);
    }
}
