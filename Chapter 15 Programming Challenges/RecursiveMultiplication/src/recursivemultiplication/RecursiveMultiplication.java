package recursivemultiplication;

import java.util.*;

public class RecursiveMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input1, input2;
        int num1, num2;
        
        System.out.print("Enter first number: ");
        input1 = s.nextLine();
        System.out.print("Enter second number: ");
        input2 = s.nextLine();
        
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);
        
        System.out.println(multiply(num1,num2));
    }
    public static int multiply(int x, int y){
        if(y>0)
            return x + multiply(x, y-1);
        else
            return 0;
    }
}
