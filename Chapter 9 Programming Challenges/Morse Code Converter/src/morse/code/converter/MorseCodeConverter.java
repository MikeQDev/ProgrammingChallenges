package morse.code.converter;

import javax.swing.JOptionPane;

public class MorseCodeConverter {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter data to be converted "
                                                    + "to morse code.");
        Convert c = new Convert(input);
        System.exit(0);
    }

}
