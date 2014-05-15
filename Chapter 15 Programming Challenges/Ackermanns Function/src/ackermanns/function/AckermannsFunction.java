package ackermanns.function;

public class AckermannsFunction {

    public static void main(String[] args) {
        for(int row=0; row<=3; row++){
            for(int col=0; col<=3; col++){
                System.out.println("Num1: "+row+", Num2: "+col+" = "+ackermann(row,col));
            }
        }
        
    }
    public static int ackermann(int x, int y){
        if(x==0)
            return y+1;
        else if(y==0)
            return x-1;
        else
            return ackermann(x-1, ackermann(x, y-1));
    }
}
