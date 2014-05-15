package salesanalysis;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesAnalysis {

    public static void main(String[] args) throws IOException{
        DecimalFormat dollar = new DecimalFormat("$###,###,###.00");
        File f = new File("SalesData.txt");
        Scanner fInput = new Scanner(f);
        double totalWeek1=0, totalWeek2=0, totalWeek3=0,
                averageWeek1, averageWeek2, averageWeek3,
                total, averageWeekly;
        String[] week1=null;
        String[] week2=null;
        String[] week3=null;
        while(fInput.hasNext()){
            week1 = fInput.nextLine().split(",");
            week2 = fInput.nextLine().split(",");
            week3 = fInput.nextLine().split(",");
        }
        for(String a : week1){
            totalWeek1+=Double.parseDouble(a);
        }
        for(String b : week2){
            totalWeek2+=Double.parseDouble(b);
        }
        for(String c : week3){
            totalWeek3+=Double.parseDouble(c);
        }
        double[] totals = {totalWeek1, totalWeek2, totalWeek3};
        averageWeek1=totalWeek1/week1.length;
        averageWeek2=totalWeek2/week2.length;
        averageWeek3=totalWeek3/week3.length;
        total=totalWeek1+totalWeek2+totalWeek3;
        averageWeekly=total/3;
        System.out.println("Week 1 total sales: "+dollar.format(totalWeek1)+
                "\nWeek 2 total sales: "+dollar.format(totalWeek2)+
                "\nWeek 3 total sales: "+dollar.format(totalWeek3));
        System.out.println("Week 1 average daily sales: "+dollar.format(averageWeek1));
        System.out.println("Week 2 average daily sales: "+dollar.format(averageWeek2));
        System.out.println("Week 3 average daily sales: "+dollar.format(averageWeek3));
        System.out.println("Total sales: "+dollar.format(total));
        System.out.println("Average weekly sales: "+dollar.format(averageWeekly));
        System.out.println("Highest sales week: "+highest(totals));
        System.out.println("Lowest sales week: "+lowest(totals));
    }
    public static String highest(double[] array){
        int high=0;
        double highest = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>highest){
                highest=array[i];
                high = i;
            }
        }
        if(high==0)
            return "Week 1";
        else if(high==1)
            return "Week 2";
        else
            return "Week 2";
    }
    public static String lowest(double[] array){
        int low=0;
        double lowest = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<lowest){
                low=i;
            }
        }
        if(low==0)
            return "Week 1";
        else if(low==1)
            return "Week 2";
        else
            return "Week 3";
    }
}