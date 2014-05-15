package vowels.and.consonants;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        Counter c = new Counter(getString());
        char choice;
        do{
            choice = getChoice();
            if(choice=='a'){
                System.out.println("Vowels: "+c.getVowels());
            }
            if(choice=='b'){
                System.out.println("Consonants: "+c.getConsonants());
            }
            if(choice=='c'){
                System.out.println("Vowels: "+c.getVowels());
                System.out.println("Consonants: "+c.getConsonants());
            }
            if(choice=='d'){
                c = new Counter(getString());
            }
            if(choice=='e'){
                System.out.println("Exiting program..");
                System.exit(0);
            }
        }while(choice!='e');
    }
    public static char getChoice(){
        char choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a choice: ");
        do{
        System.out.println("a. Count the number of vowels in the string");
        System.out.println("b. Count the number of consonants in the string");
        System.out.println("c. Count both the vowels and consonants in the string.");
        System.out.println("d. Enter another string");
        System.out.println("e. Exit the program");
        choice = s.nextLine().toLowerCase().charAt(0);
        }while(choice!='a'&&choice!='b'&&choice!='c'&&choice!='d'&&choice!='e');
        return choice;
    }
    public static String getString(){
        String str = JOptionPane.showInputDialog("Enter a string to count.");
        return str;
    }
}
