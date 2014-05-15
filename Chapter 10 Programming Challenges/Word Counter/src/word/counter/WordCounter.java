package word.counter;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class WordCounter {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter text to count words.");
        JOptionPane.showMessageDialog(null, "Your string had "+countWords(input)+ " words.");
        System.exit(0);
    }
    public static int countWords(String s){
        int countedWords=0;
        StringTokenizer sT = new StringTokenizer(s);
        while(sT.hasMoreTokens()){
            countedWords++;
            sT.nextToken();
        }
        return countedWords;
    }

}
