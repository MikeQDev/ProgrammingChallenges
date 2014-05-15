package presentvalue;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PresentValue {

    public static void main(String[] args) {
        DecimalFormat dollar = new DecimalFormat("$###,###,###.00");
        DecimalFormat percent = new DecimalFormat("%#,###,###.0###");
        Scanner keyboard = new Scanner(System.in);
        double presVal, intRate;
        System.out.print("Enter an interest rate (%): ");
        intRate=keyboard.nextDouble();
        int futureValue=10000, years=10;
        presVal = presentValue(futureValue, intRate/100, years);
        System.out.println("\nIf you want "+dollar.format(futureValue)+
                " in your bank account in "+years+" year(s),\nwith a "+intRate+"% interest rate, you must "
                + "have "+dollar.format(presVal) +" in\nyour account already.");
    }
    public static double presentValue(double fVal, double interest, double years){
        double presVal = fVal/(Math.pow((interest+1), years));
        return presVal;
    }
}