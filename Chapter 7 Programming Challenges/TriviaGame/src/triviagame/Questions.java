package triviagame;

import java.util.Scanner;

class Questions {
    private String question;
    private int[] ans = new int[4];
    private int correctAns, userAns;
    public void setAnswers(int a1, int a2, int a3, int a4, int c){
        ans[0]=a1;
        ans[1]=a2;
        ans[2]=a3;
        ans[3]=a4;
        correctAns=c;
    }
    public void showAnswerChoices(){
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
        System.out.println();
    }
    public void setQuestion(String q){
        question = q;
    }
    public void getQuestion(){
        System.out.println(question);
    }
    public void askUser(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Your answer: ");
        userAns = keyboard.nextInt();
    }
    public boolean isCorrect(){
        boolean correct=false;;
        if(userAns==correctAns){
            correct=true;
        }
        return correct;
    }
}
