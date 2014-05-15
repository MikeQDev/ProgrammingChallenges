package course.grades.pkg105;

public class PassFailExam extends GradedActivity
{
   private int numQuestions;
   private double pointsEach;
   private int numMissed;
   
   public PassFailExam(){
       
   }
   public PassFailExam(int questions, int missed, 
                       double minPassing)
   {
      super(minPassing);
      double numericScore;
      numQuestions = questions;
      numMissed = missed;
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);
      setScore(numericScore);
   }
   public double getPointsEach()
   {
      return pointsEach;
   }
   public int getNumMissed()
   {
      return numMissed;
   }
}