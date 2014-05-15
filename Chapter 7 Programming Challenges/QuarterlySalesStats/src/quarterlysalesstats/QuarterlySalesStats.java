package quarterlysalesstats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuarterlySalesStats {
    
    public static void main(String[] args) {
        final int DIVS=6, QTRS=4;
        Sales[][] s = new Sales[DIVS][QTRS];
        
        
        setSales(s);
        System.out.println("---");
        displaySales(s);
        System.out.println("---");
        divisionIncDec(s);
        System.out.println("---");
        totalSales(s);
        System.out.println("---");
        compIncDec(s);
        System.out.println("---");
        avgSalesQtr(s);
        System.out.println("---");
        highestQtr(s);
        
    }
    public static void compIncDec(Sales[][] array){
        double q1=0, q2=0, q3=0, q4=0;
        for(int row=0; row<6; row++){
            q1+=array[row][0].getValue();
            q2+=array[row][1].getValue();
            q3+=array[row][2].getValue();
            q4+=array[row][3].getValue();
        }
        System.out.println("Quarter 2 total change: "+(q2-q1));
        System.out.println("Quarter 3 total change: "+(q3-q2));
        System.out.println("Quarter 4 total change: "+(q4-q3));
    }
    public static void highestQtr(Sales[][] array){
        double highestQ1=array[0][0].getValue(), highestQ2=array[0][1].getValue(), highestQ3=array[0][2].getValue(), highestQ4=array[0][3].getValue();
        for(int row=0; row<6; row++){
            if(array[row][0].getValue()>highestQ1){
                highestQ1=array[row][0].getValue();
            }
            if(array[row][1].getValue()>highestQ2){
                highestQ2=array[row][1].getValue();
            }
            if(array[row][2].getValue()>highestQ3){
                highestQ3=array[row][2].getValue();
            }
            if(array[row][3].getValue()>highestQ4){
                highestQ4=array[row][3].getValue();
            }
        }
        System.out.println(highestQ1);
        System.out.println(highestQ2);
        System.out.println(highestQ3);
        System.out.println(highestQ4);
    }
    public static void avgSalesQtr(Sales[][] array){
        double q1=0, q2=0, q3=0, q4=0;
        for(int row=0; row<6; row++){
            q1+=array[row][0].getValue();
            q2+=array[row][1].getValue();
            q3+=array[row][2].getValue();
            q4+=array[row][3].getValue();
        }
        System.out.println("Quarter 1 average: "+(q1/4));
        System.out.println("Quarter 2 average: "+(q2/4));
        System.out.println("Quarter 3 average: "+(q3/4));
        System.out.println("Quarter 4 average: "+(q4/4));
        
    }
    public static void setSales(Sales[][] array){
        Scanner keyboard = new Scanner(System.in);
        final int DIVS=6, QTRS=4;
        for(int div=0; div<DIVS; div++){
            for(int qtr=0; qtr<QTRS; qtr++){
                array[div][qtr]=new Sales();
                System.out.print("Enter sales for divion "+(div+1)
                        +"'s quarter "+(qtr+1)+": ");
                double sales=keyboard.nextDouble();
                array[div][qtr].setValue(sales);
            }
        }
    }
    public static void totalSales(Sales[][] array){
        for(int col=0; col<4; col++){
            double total=0;
            for(int row=0; row<6; row++){
                total+=array[row][col].getValue();
            }
            System.out.println("Total sales for quarter "+(col+1)+": "+total);
        }
    }
    public static void displaySales(Sales[][] array){
        DecimalFormat formatter = new DecimalFormat("$###,###,###,##0.00");
        for(int row=0; row<6; row++){
            for(int col=0; col<4; col++){
                System.out.println("Division "+(row+1)+"'s quarter "+(col+1)+" sales: "+formatter.format(array[row][col].getValue()));
            }
        }
    }
    public static void divisionIncDec(Sales[][] array){
        double incDec;
        DecimalFormat formatter = new DecimalFormat("$###,###,###,##0.00");
        for(int row=0; row<6; row++){
            for(int col=1; col<4; col++){
                incDec = array[row][col].getValue()-array[row][col-1].getValue();
                System.out.println("Divion "+(row+1)+"'s quarter "+(col+1)+" change: "+formatter.format(incDec));
            }
        }
    }
}
