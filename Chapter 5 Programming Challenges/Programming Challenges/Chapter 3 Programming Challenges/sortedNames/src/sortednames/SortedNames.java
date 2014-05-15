package sortednames;

import java.util.Scanner;

public class SortedNames {
    
    public static void main(String[] args) {
        String name1, name2, name3;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the name of person 1: ");
        name1=keyboard.nextLine();
        System.out.print("Enter the name of person 2: ");
        name2=keyboard.nextLine();
        System.out.print("Enter the name of person 3: ");
        name3=keyboard.nextLine();
        
        if(name1.compareTo(name2)<=0&&name1.compareTo(name3)<=0){
            if(name2.compareTo(name3)<0){
                System.out.println(name1+"\n"+name2+"\n"+name3);
            }else{
                System.out.println(name1+"\n"+name3+"\n"+name2);
            }
        }
        else if(name2.compareTo(name1)<=0&&name2.compareTo(name3)<=0){
            if(name1.compareTo(name3)<0){
                System.out.println(name2+"\n"+name1+"\n"+name3);
            }else{
                System.out.println(name2+"\n"+name3+"\n"+name1);
            }
        }
        else if(name3.compareTo(name1)<=0&&name3.compareTo(name2)<=0){
            if(name1.compareTo(name2)<0){
                System.out.println(name3+"\n"+name1+"\n"+name2);
            }else{
                System.out.println(name3+"\n"+name2+"\n"+name1);
            }
        }
    }
}