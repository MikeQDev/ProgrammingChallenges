package fallingdistance;

import java.text.DecimalFormat;

public class FallingDistance {

    public static void main(String[] args) {
        double distance;
        DecimalFormat formatter = new DecimalFormat("#,###.##");
        for(int t=1; t<=10; t++){
            distance=fallingDistance(t);
            System.out.println(t+" seconds is "+formatter.format(distance)+" meters.");
        }
    }
    public static double fallingDistance(int t){
        double g=9.8, distance;
        distance=(.5)*(9.8)*(t*t);
        return distance;
    }
}