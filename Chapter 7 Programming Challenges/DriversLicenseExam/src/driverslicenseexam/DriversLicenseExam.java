package driverslicenseexam;

import java.util.Scanner;

public class DriversLicenseExam {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DriverExam d = new DriverExam();
        char uI='B';
        int total=0, wrong=0;
        
        for(int index=0; index<20; index++){
            do{
                System.out.print("Enter your answer for question "+(index+1)+" ("+d.getAnswer(index)+"): ");
                String input = keyboard.nextLine().toUpperCase();
                uI=input.charAt(0);
            }while(uI!='A'&&uI!='B'&&uI!='C'&&uI!='D');
            if(uI==d.getAnswer(index)){
                d.correct();
            }else{
                d.incorrect();
            }
        }
        
        if(d.passed()==true){
            System.out.println("Pass/fail: Pass");
        }else{
            System.out.println("Pass/fail: Fail");
        }
        System.out.println("Total correct: "+d.totalCorrect());
        System.out.println("Total incorrect: "+d.totalIncorrect());
        
    }
}