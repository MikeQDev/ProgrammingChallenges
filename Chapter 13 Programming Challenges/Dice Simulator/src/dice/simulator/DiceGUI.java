package dice.simulator;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class DiceGUI extends JFrame{
    private ImageIcon[] dice = {new ImageIcon("1.gif"), new ImageIcon("2.gif"), new ImageIcon("3.gif"),
                                new ImageIcon("4.gif"), new ImageIcon("5.gif"), new ImageIcon("6.gif")};
    private JButton rollButton;
    private JLabel die1, die2;
    public DiceGUI() {
        setTitle("Dice simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        die1 = new JLabel(dice[0]);
        die2 = new JLabel(dice[0]);
        rollButton = new JButton("Roll dice");
        rollButton.addActionListener(new RollListen());
        add(die1, BorderLayout.WEST);
        add(die2, BorderLayout.EAST);
        add(rollButton, BorderLayout.SOUTH);
    }
    private class RollListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Random randomItem = new Random();
            int rand = randomItem.nextInt(6);
            int rand2 = randomItem.nextInt(6);
            die1.setIcon(dice[rand]);
            die2.setIcon(dice[rand2]);
            JOptionPane.showMessageDialog(null,"You rolled "+(rand+1)+" and "+(rand2+1)+(" ("+(rand+rand2+2)+")"));
        }
    }
}
