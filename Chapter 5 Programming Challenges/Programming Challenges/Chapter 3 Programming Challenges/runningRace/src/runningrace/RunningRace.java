package runningrace;

import java.util.Scanner;

public class RunningRace {
    
    public static void main(String[] args) {
        String name1, name2, name3;
        int time1, time2, time3;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter the name of runner 1: ");
        name1=keyboard.nextLine();
        System.out.print("Enter the time (in minutes) of runner 1: ");
        time1=keyboard.nextInt();
        
        System.out.print("Enter the name of runner 2: ");
        name2=keyboard.nextLine();
        name2=keyboard.nextLine();
        
        System.out.print("Enter the time (in minutes) of runner 2: ");
        time2=keyboard.nextInt();
        
        System.out.print("Enter the name of runner 3: ");
        name3=keyboard.nextLine();
        name3=keyboard.nextLine();
        System.out.print("Enter the time (in minutes) of runner 3: ");
        time3=keyboard.nextInt();
        
        if(time1<time2 && time1<time3){
            if(time2<time3){
                System.out.println(name1+"\n"+name2+"\n"+name3);
            }else{
                System.out.println(name1+"\n"+name3+"\n"+name2);
            }
        }
        if(time2<time1 && time2<time3){
            if(time1<time3){
                System.out.println(name2+"\n"+name1+"\n"+name3);
            }else{
                System.out.println(name2+"\n"+name3+"\n"+name1);
            }
        }
        if(time3<time1 && time3<time2){
            if(time1<time2){
                System.out.println(time3+"\n"+name1+"\n"+name2);
            }else{
                System.out.println(time3+"\n"+name2+"\n"+name1);
            }
        }
    }
}
