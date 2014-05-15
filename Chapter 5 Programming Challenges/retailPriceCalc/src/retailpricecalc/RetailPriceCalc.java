package retailpricecalc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RetailPriceCalc {

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("$#,###,###.00");
        double wholeSalePrice, percent, retail;
        wholeSalePrice = getPrice();
        percent = getPercent();
        retail = toRetail(wholeSalePrice, percent);
        System.out.println("Retail price is "+formatter.format(retail));
        
    }
    public static double getPrice(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter wholesale: $");
        double wholeSale=keyboard.nextDouble();
        return wholeSale;
    }
    public static double getPercent(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a percentage (%): ");
        double percentage=keyboard.nextDouble();
        double percent=percentage/100;
        return percent;
    }
    public static double toRetail(double wholeSale, double percent){
        double retailPrice;
        return retailPrice=wholeSale+(wholeSale*percent);
    }
}
