package gradebook;

import java.text.DecimalFormat;
import java.util.Scanner;

class Scores {
    private int scores[][]=new int[5][4], lowestScore[] = new int[5];
    private String names[] = new String[5];
    private char letterGrade[] = new char[5];
    
    public void setScores(){
        Scanner keyboard = new Scanner(System.in);
        for(int rows=0; rows<5; rows++){
            for(int cols=0; cols<4; cols++){
                System.out.print("Enter "+names[rows]+"'s score for test "+(cols+1)+": ");
                scores[rows][cols]=keyboard.nextInt();
            }
            keyboard.nextLine();
        }
    }
    public void setNames(){
        Scanner keyboard = new Scanner(System.in);
        for(int i=0; i<names.length; i++){
            System.out.print("Enter a name for student "+(i+1)+": ");
            String name = keyboard.nextLine();
            names[i]=name;
        }
    }
    public void getScores(){
        DecimalFormat formatter = new DecimalFormat("###.##");
        for(int rows=0; rows<5; rows++){
            double total=0;
            for(int col=0; col<4; col++){
                total+=scores[rows][col];
            }
            double average=total/4;
            if(average>=90){
                letterGrade[rows]='A';
            }else if(average>=80){
                letterGrade[rows]='B';
            }else if(average>=70){
                letterGrade[rows]='C';
            }else if(average>=60){
                letterGrade[rows]='D';
            }else{
                letterGrade[rows]='F';
            }
            System.out.println(names[rows]+"'s average score: "+formatter.format(average)+"%"+"("+letterGrade[rows]+")");
        }
    }
    public void setLowestScore(){
        for(int rows=0;rows<5; rows++){
            int lowest=scores[rows][0];
            for(int col=0; col<4; col++){
                if(scores[rows][col] < lowest){
                    lowest=scores[rows][col];
                }
                lowestScore[rows]=lowest;
            }
        }
    }
    public void getLowest(){
        for(int index=0; index<5; index++){
            System.out.println(names[index]+"'s lowest score: "+lowestScore[index]);
        }
    }
}
