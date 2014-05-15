package word.separator;

import javax.swing.JOptionPane;

public class WordSeparator {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a sentence with NO spaces. "
                + "Capitalize the first letter of each word.");
        StringBuilder b = new StringBuilder(input);
        Separate s = new Separate(b);
        System.exit(0);
        
        
    }

}
