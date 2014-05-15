package essay.pkgclass.pkg104;

import java.util.Scanner;

public class EssayClass104 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Essay e = new Essay();
        int totalScore, grammar, spelling, correctLength, content;
        
        System.out.println("This application lets you grade an essay based on grammar (30 pts),\n"
                +"spelling (20 pts), correct length (20 pts), and content (30 pts).");
        
        do{
            System.out.print("Enter grammar score (max 30): ");
            grammar = s.nextInt();
        }while(grammar>30||grammar<0);
        do{
            System.out.print("Enter spelling score (max 20): ");
            spelling = s.nextInt();
        }while(spelling>20||spelling<0);
        do{
            System.out.print("Enter correct length score (max 20): ");
            correctLength = s.nextInt();
        }while(correctLength>20||correctLength<0);
        do{
            System.out.print("Enter content score (max 30): ");
            content = s.nextInt();
        }while(content>30||content<0);
        
        e.setContent(content);
        e.setGrammar(grammar);
        e.setSpelling(spelling);
        e.setCorrectLength(correctLength);
        
        totalScore = e.getContent()+e.getCorrectLength()+e.getGrammar()+e.getSpelling();
        
        e.setScore(totalScore);
        
        System.out.println("---");
        
        System.out.println("Total score: "+e.getScore()+"%");
        
        System.out.println("Essay grade: "+e.getGrade());
    }
}
