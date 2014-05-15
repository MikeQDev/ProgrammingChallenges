package recursive.power.method;

import java.util.*;

public class RecursivePowerMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again = 'Y';
        do{
            int baseNum, expNum;
            System.out.print("Enter base number: ");
            baseNum = Integer.parseInt(s.nextLine());
            do{
                System.out.print("Enter exponent (non-negative): ");
                expNum = Integer.parseInt(s.nextLine());
            }while(expNum<0);
            
            System.out.println(baseNum+"^"+expNum+" = "+raiseNumber(baseNum, expNum));
            
            System.out.print("Calculate again? (Y/N): ");
            again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static long raiseNumber(int base, int exp){
        if(exp>0){
            return base * raiseNumber(base,exp-1);
        }else{
            return 1;
        }
    }
}
