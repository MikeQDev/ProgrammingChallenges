package driverslicenseexam;

class DriverExam {
    private int totalCorrect, totalIncorrect;
    private int[] questionsMissed={1,0};
    private char[] answers = {'B','D','A','A','C','A','B','A','C',
                                 'D','B','C','D','A','D','C', 'C',
                                 'B','D','A'};
    public char getAnswer(int i){
        char answer;
        answer = answers[i];
        return answer;
    }
    public boolean passed(){
        boolean status=false;
        if(totalCorrect>=15){
            status = true;
        }
        return status;
    }
    public void correct(){
        totalCorrect++;
    }
    public void incorrect(){
        totalIncorrect++;
    }
    public int totalCorrect(){
        return totalCorrect;
    }
    public int totalIncorrect(){
        return totalIncorrect;
    }
    public int questionsMissed(int m){
        return questionsMissed[m];
    }
}
