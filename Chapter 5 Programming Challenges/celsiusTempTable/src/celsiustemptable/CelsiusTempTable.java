package celsiustemptable;

import java.text.DecimalFormat;

public class CelsiusTempTable {

    public static void main(String[] args) {
        double celsius;
        DecimalFormat formatter=new DecimalFormat("##.##");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("------------------------");
        for(int i=0; i<=20; i++){
            celsius = celsius(i);
            System.out.println(i+"\t\t"+formatter.format(celsius));
        }
    }
    public static double celsius(double fahr){
        double celsius=(.5556)*(fahr-32);
        return celsius;
    }

}
