package course.grades.pkg105;

public class GradedActivity
{
   private double score;
   public GradedActivity(){
       
   }
   public GradedActivity(double s){
       score = s;
   }
   public void setScore(double s)
   {
      score = s;
   }
   public double getScore()
   {
      return score;
   }
   public char getGrade()
   {
      char letterGrade;

      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}