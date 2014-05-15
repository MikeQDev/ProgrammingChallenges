package essay.pkgclass.pkg104;

class Essay extends GradedActivity{
    private int grammar, spelling, correctLength, content;
    public void setGrammar(int g){
        grammar = g;
    }
    public void setSpelling(int s){
        spelling = s;
    }
    public void setCorrectLength(int l){
        correctLength = l;
    }
    public void setContent(int c){
        content = c;
    }
    public int getGrammar(){
        return grammar;
    }
    public int getSpelling(){
        return spelling;
    }
    public int getCorrectLength(){
        return correctLength;
    }
    public int getContent(){
        return content;
    }
}
