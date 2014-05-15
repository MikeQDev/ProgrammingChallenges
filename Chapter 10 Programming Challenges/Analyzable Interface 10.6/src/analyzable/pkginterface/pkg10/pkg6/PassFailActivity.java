package analyzable.pkginterface.pkg10.pkg6;

public class PassFailActivity extends GradedActivity
{
   private double minPassingScore;
   
   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }
   
   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'P';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}