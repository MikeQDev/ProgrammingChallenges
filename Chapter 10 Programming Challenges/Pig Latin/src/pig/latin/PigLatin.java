package pig.latin;

import javax.swing.JOptionPane;

public class PigLatin {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a phrase to convert to "
                                             + "pig latin.");
        Translate p = new Translate(input);
        
        System.exit(0);
    }

}
