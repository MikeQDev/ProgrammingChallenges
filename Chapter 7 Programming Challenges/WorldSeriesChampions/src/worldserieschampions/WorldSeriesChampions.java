package worldserieschampions;

import java.io.*;
import javax.swing.JOptionPane;

public class WorldSeriesChampions {
    
    public static void main(String[] args) throws IOException {
        WinningList w = new WinningList();
        
        String input = JOptionPane.showInputDialog("Enter a team name");
        
        w.search(input);
        
    }

}
