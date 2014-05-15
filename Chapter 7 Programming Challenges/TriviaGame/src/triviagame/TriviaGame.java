package triviagame;

public class TriviaGame {
    
    public static void main(String[] args) {
        int correctP1=0, correctP2=0;
        Questions[] q = new Questions[10];
        declare(q);
        
        q[0].setQuestion("60 - 14 = ");
        q[0].getQuestion();
        q[0].setAnswers(56,58,48,46,46);
        q[0].showAnswerChoices();
        q[0].askUser();
        if(q[0].isCorrect()){
            correctP1++;
        }
        System.out.println();
        
        q[1].setQuestion("7 + 17 = ");
        q[1].getQuestion();
        q[1].setAnswers(22,24,28,32,24);
        q[1].showAnswerChoices();
        q[1].askUser();
        if(q[1].isCorrect()){
            correctP1++;
        }
        System.out.println();
        
        q[2].setQuestion("6 * 14 = ");
        q[2].getQuestion();
        q[2].setAnswers(68,84,94,76,84);
        q[2].showAnswerChoices();
        q[2].askUser();
        if(q[2].isCorrect()){
            correctP1++;
        }
        System.out.println();
        
        q[3].setQuestion("36 / 2 = ");
        q[3].getQuestion();
        q[3].setAnswers(16,14,20,18,18);
        q[3].showAnswerChoices();
        q[3].askUser();
        if(q[3].isCorrect()){
            correctP1++;
        }
        System.out.println();
        
        
        q[4].setQuestion("4 * 16 = ");
        q[4].getQuestion();
        q[4].setAnswers(72,64,82,76,64);
        q[4].showAnswerChoices();
        q[4].askUser();
        if(q[4].isCorrect()){
            correctP1++;
        }
        System.out.println();
        
        System.out.println("Player 2's turn\n");
        
        q[5].setQuestion("35 * 2 = ");
        q[5].getQuestion();
        q[5].setAnswers(90,60,70,80,70);
        q[5].showAnswerChoices();
        q[5].askUser();
        if(q[5].isCorrect()){
            correctP2++;
        }
        System.out.println();
        
        q[6].setQuestion("50 + 27 = ");
        q[6].getQuestion();
        q[6].setAnswers(67,77,87,57,77);
        q[6].showAnswerChoices();
        q[6].askUser();
        if(q[6].isCorrect()){
            correctP2++;
        }
        System.out.println();
        
        q[7].setQuestion("64 / 8 = ");
        q[7].getQuestion();
        q[7].setAnswers(8,4,16,32,8);
        q[7].showAnswerChoices();
        q[7].askUser();
        if(q[7].isCorrect()){
            correctP2++;
        }
        System.out.println();
        
        q[8].setQuestion("26 * 3 = ");
        q[8].getQuestion();
        q[8].setAnswers(84,78,66,88,78);
        q[8].showAnswerChoices();
        q[8].askUser();
        if(q[8].isCorrect()){
            correctP2++;
        }
        System.out.println();
        
        q[9].setQuestion("52 / 2 = ");
        q[9].getQuestion();
        q[9].setAnswers(26,24,28,30,26);
        q[9].showAnswerChoices();
        q[9].askUser();
        if(q[9].isCorrect()){
            correctP2++;
        }
        System.out.println();
        
        
        
        
        
        System.out.println("Player 1 correct: "+correctP1);
        System.out.println("Player 2 correct: "+correctP2);
        
    }
    public static void declare(Questions[] array){
        for(int i=0; i<array.length; i++){
            array[i]=new Questions();            
        }
    }
}

