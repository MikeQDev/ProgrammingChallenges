package backward.string;

import javax.swing.JOptionPane;

public class BackwardString {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter text you want reversed.");
        JOptionPane.showMessageDialog(null,input+" reversed is "+reverse(input));
        System.exit(0);
    }
    public static StringBuilder reverse(String str){
        StringBuilder s = new StringBuilder(str);
        return s.reverse();
    }
}
