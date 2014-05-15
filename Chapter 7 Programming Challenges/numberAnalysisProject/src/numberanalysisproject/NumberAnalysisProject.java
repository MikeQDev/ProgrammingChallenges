package numberanalysisproject;

import java.io.*;

public class NumberAnalysisProject {
    
    public static void main(String[] args) throws IOException{
        NumberAnalysis n = new NumberAnalysis("numbers.txt");
        
        n.getTotal();
        n.getAverage();
        n.getHighest();
        n.getLowest();
    }

}
