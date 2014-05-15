package string.reverser;

import java.util.*;

public class StringReverser {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again;
        
        do{
            System.out.print("Enter a string to be reversed: ");
            String toReverse = s.nextLine();
            reverse(toReverse, toReverse.length());
            
            System.out.print("Reverse another string? (Y/N): ");
            again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static void reverse(String s, int len){
        if(len>0){
            System.out.print(s.charAt(len-1));
            reverse(s, len-1);
        }else{
            System.out.println();
        }
    }
}
