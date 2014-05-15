package bookclubpoints;

import java.util.Scanner;

public class BookClubPoints {
    
    public static void main(String[] args) {
        int booksPurchased;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter amount of books purchased this month: ");
        booksPurchased=keyboard.nextInt();
        
        if(booksPurchased>=4){
            System.out.println("You earned 60 points this month.");
        }else if(booksPurchased==3){
            System.out.println("You earned 30 points this month.");
        }else if(booksPurchased==2){
            System.out.println("You earned 15 points this month.");
        }else if(booksPurchased==1){
            System.out.println("You earned 5 points this month.");
        }else{
            System.out.println("You earned 0 points this month.");
        }
        
    }

}
