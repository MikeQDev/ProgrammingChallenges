package celsiustofahrenheit;

import java.text.DecimalFormat;

public class CelsiusToFahrenheit {
    
    public static void main(String[] args) {
        DecimalFormat formatter=new DecimalFormat(".0");
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("--------------------------");
        for(int C=0; C<=20; C++){
            double fahrenheit=(1.8*C)+32;
            System.out.println(C+"\t\t  "+formatter.format(fahrenheit));
        }
    }

}
