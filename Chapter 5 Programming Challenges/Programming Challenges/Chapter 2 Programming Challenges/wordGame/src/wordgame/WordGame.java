package wordgame;

import java.util.Scanner;

public class WordGame {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        System.out.print("Enter the name of a city: ");
        String skip = input.nextLine();
        String city=input.nextLine();
        System.out.print("Enter the name of a college: ");
        String college=input.nextLine();
        System.out.print("Enter a profession: ");
        String profession=input.nextLine();
        System.out.print("Enter a type of animal: ");
        String animalType=input.nextLine();
        System.out.print("Enter a pet's name: ");
        String petName=input.nextLine();
        
        System.out.println("\nThere once was a person named "+name+" who lived in "+city+
                ". At the age of "+age+",\n"+name+" went to college at "+college+". "+name+
                " graduated and went to work as a\n"+profession+". Then, "+name+
                " adopted a(n) "+animalType+" named "+petName+". They both lived"
                + "\nhappily ever after!");
    }

}
