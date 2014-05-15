package palindrome.detector;

import java.util.*;

public class PalindromeDetector {
    private static boolean status = true;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again='Y';
        do{
            System.out.print("Enter text to see if it's a palindrome: ");
            String inputString = s.nextLine();
            
            if(isPalindrome(inputString, 0, inputString.length()-1))
                System.out.println(inputString+" is a palindrome.");
            else
                System.out.println(inputString+" is not a palindrome.");
            
            System.out.print("Try another string? (Y/N): ");
            again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static boolean isPalindrome(String s, int pos, int maxSize){
        if(pos<maxSize){
            if(s.charAt(pos)==s.charAt(maxSize)){
                status=true;
                return isPalindrome(s, pos+1, maxSize-1);
            }else{
                return false;
            }
        }else{
            return status;
        }
    }
}
