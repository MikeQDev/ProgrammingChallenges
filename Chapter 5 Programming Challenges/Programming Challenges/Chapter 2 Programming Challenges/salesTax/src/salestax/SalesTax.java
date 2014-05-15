package salestax;

import java.util.Scanner;

public class SalesTax {
    
    public static void main(String[] args) {
        double stateTax=.04,countryTax=.02;
        Scanner input=new Scanner(System.in);        
        System.out.print("Enter a price: $");
        double answer=input.nextDouble();
        double totalState=answer*stateTax,totalCountry=answer*countryTax,total=answer+totalState+totalCountry;
        
        System.out.println("State tax: $"+totalState+"\n"
                + "Country tax: $"+totalCountry+"\n"
                + "Total: $"+total);
    }

}
