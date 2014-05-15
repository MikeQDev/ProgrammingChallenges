package isprime;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num=0;
        
        while(num!=-1){
            System.out.print("Enter a number (-1 to quit): ");
            num=keyboard.nextInt();
            if(isPrime(num)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime.");
            }
        }
    }
    public static boolean isPrime(int num){
        boolean status=true;
        if(num%2==0)
            return status=false;
        if(num%3==0)
            return status=false;
        return status;
    }
}
