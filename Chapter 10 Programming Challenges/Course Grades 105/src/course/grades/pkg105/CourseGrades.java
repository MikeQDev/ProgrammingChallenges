package course.grades.pkg105;

import java.text.DecimalFormat;

class CourseGrades {
    DecimalFormat f = new DecimalFormat("###.##");
    
    private GradedActivity[] grades = new GradedActivity[4];
    
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
                + "Final exam: "+f.format(grades[3].getScore())+"% ("+grades[3].getGrade()+")";
        return str;
    }
}
