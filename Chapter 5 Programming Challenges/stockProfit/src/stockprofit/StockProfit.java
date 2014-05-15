package stockprofit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StockProfit {

    public static void main(String[] args) {
        DecimalFormat formatter=new DecimalFormat("$#,###,###,###.00");
        double numShares, purchasePricePerSale, purchaseComm,
                sellPricePerShare, sellComm, profit;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter number of shares: ");
        numShares=keyboard.nextDouble();
        System.out.print("Enter purchase price per stock: $");
        purchasePricePerSale=keyboard.nextDouble();
        System.out.print("Enter purchase commission: $");
        purchaseComm=keyboard.nextDouble();
        System.out.print("Enter sell price per share: $");
        sellPricePerShare=keyboard.nextDouble();
        System.out.print("Enter sell commission: $");
        sellComm=keyboard.nextDouble();
        
        profit = profit(numShares,purchasePricePerSale,purchaseComm,
                sellPricePerShare,sellComm);
        System.out.println("Profit: "+formatter.format(profit));
        
        
    }
    public static double profit(double numShares, double purchasePricePerSale,
            double purchaseComm, double sellPricePerShare, double sellComm){
        double profit;
        return profit = ((numShares*sellPricePerShare)-sellComm)-
                ((numShares*purchasePricePerSale)+purchaseComm);
    }
}
