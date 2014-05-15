package analyzable.pkginterface.pkg10.pkg6;

import java.text.DecimalFormat;

class CourseGrades implements Analyzable{
    DecimalFormat f = new DecimalFormat("###.##");
    private double average;
    
    private GradedActivity[] grades = new GradedActivity[5];
    
    public void setLab(GradedActivity l){
        grades[0] = l;
    }
    public void setPassFailExam(PassFailExam p){
        grades[1] = p;
    }
    public void setEssay(Essay e){
        grades[2] = e;
        e.doTotal();
    }
    public void setFinalExam(FinalExam f){
        grades[3] = f;
    }
    public String toString(){
        String str;
        str = "Lab Activity: "+f.format(grades[0].getScore())+"% ("+grades[0].getGrade()+")\n"
                + "Pass/Fail exam: "+f.format(grades[1].getScore())+"% ("+grades[1].getGrade()+")\n"
                + "Essay: "+f.format(grades[2].getScore())+"% ("+grades[2].getGrade()+")\n"
                + "Final exam: "+f.format(grades[3].getScore())+"% ("+grades[3].getGrade()+")\n"
                + "Average: "+f.format(getAverage())+"% ("+grades[4].getGrade()+")\n"
                + "Highest grade: "+f.format(getHighest().getScore())+"% ("+getHighest().getGrade()+")\n"
                + "Lowest grade: "+f.format(getLowest().getScore())+"% ("+getLowest().getGrade()+")";
        return str;
    }
    public double getAverage(){
        double total=0;
        for(int i=0; i<4; i++){
            total+=grades[i].getScore();
        }
        grades[4] = new GradedActivity(total/4);
        return grades[4].getScore();
    }
    public GradedActivity getHighest(){
        int highest = 0;
        for(int i=0; i<(grades.length-1); i++){
            if(grades[i].getScore() > grades[highest].getScore())
                highest=i;
        }
        return grades[highest];
    }
    public GradedActivity getLowest(){
        int lowest=0;
        for(int i=0; i<(grades.length-1); i++){
            if(grades[i].getScore() < grades[lowest].getScore())
                lowest = i;
        }
        return grades[lowest];
    }
}
