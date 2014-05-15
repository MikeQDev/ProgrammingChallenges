package testscoresproject;

class TestScores {
    private int score1, score2, score3;
    public TestScores(int s1, int s2, int s3){
        score1=s1;
        score2=s2;
        score3=s3;
    }
    public TestScores(){
        score1=0;
        score2=0;
        score3=0;
    }
    public void setScore1(int s){
        score1=s;
    }
    public void setScore2(int s){
        score2=s;
    }
    public void setScore3(int s){
        score3=s;
    }
    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }
    public int getScore3(){
        return score3;
    }
    public int getAverage(){
        return (score1+score2+score3)/3;
    }
}
