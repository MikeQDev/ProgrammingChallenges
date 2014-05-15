package evenoddcounter;

import java.util.Random;

public class EvenOddCounter {

    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=1; i<=100; i++){
            int num = rand.nextInt();
            if(isEven(num)){
                System.out.println(num+" (Even)");
            }else{
                System.out.println(num+" (Odd)");
            }
        }
    }
    public static boolean isEven(int num){
        boolean status;
        if((num%2)==0){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
}
