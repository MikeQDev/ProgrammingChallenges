package softwaresales;

import java.util.Scanner;

public class SoftwareSales {
    
    public static void main(String[] args) {
        double quantity, price=99;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter amount of packages purchased: ");
        quantity=keyboard.nextInt();
        
        double total=quantity*price, discount;
        
        if(quantity>=100){            
            discount=.5;
            System.out.println("Discounted amount: $"+total*discount+", total price: $"+(total-(total*discount)));
        }else if(quantity>=50){
            discount=.4;
            System.out.println("Discounted amount: $"+total*discount+", total price: $"+(total-(total*discount)));
        }else if(quantity>=20){
            discount=.3;
            System.out.println("Discounted amount: $"+total*discount+", total price: $"+(total-(total*discount)));
        }else if(quantity >=10){
            discount=.2;
            System.out.println("Discounted amount: $"+total*discount+", total price: $"+(total-(total*discount)));
        }else{
            System.out.println("No discount, total price: $"+total);
        }
        
    }
}