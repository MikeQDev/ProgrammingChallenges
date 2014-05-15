package charactercounter;

import java.util.*;

public class CharacterCounter {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again = 'Y';
        
        do{
           System.out.print("Enter a string: ");
           String theString = s.nextLine();
           System.out.print("Enter a character to count: ");
           char toCount = s.nextLine().charAt(0);
           
           System.out.println("\'"+toCount+"\' was counted in string \""+theString+"\" "
                                +countCharacters(theString, 0, theString.length()-1, toCount, 0)+" time(s).");
           
           System.out.print("Search again? (Y/N): ");
           again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static int countCharacters(String str, int pos, int lastPos, char search, int totalPoints){
        if(pos<=lastPos){
            if(str.charAt(pos)==search)
                return countCharacters(str, pos+1, lastPos, search, totalPoints+1);
            else
                return countCharacters(str, pos+1, lastPos, search, totalPoints);
        }else{
            return totalPoints;
        }
    }
}
