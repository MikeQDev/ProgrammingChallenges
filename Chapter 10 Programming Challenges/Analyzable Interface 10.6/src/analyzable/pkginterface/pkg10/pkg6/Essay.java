package analyzable.pkginterface.pkg10.pkg6;

class Essay extends GradedActivity{
    private int grammar, spelling, correctLength, content;
    public Essay(int g, int s, int cL, int ct){
        grammar = g;
        spelling = s;
        correctLength = cL;
        content = ct;
    }
    public Essay(){
        
    }
    public void doTotal(){
        super.setScore(grammar+spelling+correctLength+content);
    }
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
