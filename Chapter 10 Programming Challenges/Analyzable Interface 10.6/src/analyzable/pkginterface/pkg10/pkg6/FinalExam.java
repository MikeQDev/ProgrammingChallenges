package analyzable.pkginterface.pkg10.pkg6;

public class FinalExam extends GradedActivity
{
   private int numQuestions;
   private double pointsEach;
   private int numMissed;
   public FinalExam(int questions, int missed)
   {
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
