package squaredisplay;

import java.util.Scanner;

public class SquareDisplay {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        
        do{
            System.out.print("Enter a number no greater than 15: ");
            number=keyboard.nextInt();
        }while(number>15||number<1);
        
        for(int x=1; x<=number; x++){
            for(int i=1;i<=number; i++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

}