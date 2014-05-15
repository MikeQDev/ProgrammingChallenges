package populationdataproject;

import java.io.*;
import java.util.Scanner;

public class PopulationDataProject {
    
    public static void main(String[] args) throws IOException{
        PopulationData p = new PopulationData();
        p.averageChange();
        p.greatestIncrease();
        p.smallestIncrease();
    }
}
