package sum.of.digits;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums;
        String[] n;
        int total=0;
        
        System.out.print("Enter a series of one digits numbers seperated by nothing: ");
        nums = s.nextLine();
        
        n = nums.split("");
        
        for(int i = 1; i<n.length; i++){
            total+=Integer.parseInt(n[i]);
        }
        
        System.out.println("The total of the entered digits is: "+total);
        
    }

}
