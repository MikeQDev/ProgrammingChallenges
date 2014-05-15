package latintranslator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TranslationGUI extends JFrame{
    private JButton sinisterButton, dexterButton, mediumButton;
    private JLabel descLabel;
    public TranslationGUI() {
        setTitle("Latin Translator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));
        
        descLabel = new JLabel("Select a word to see its english translation");
        sinisterButton = new JButton("Sinister");
        dexterButton = new JButton("Dexter");
        mediumButton = new JButton("Medium");
        
        sinisterButton.addActionListener(new ButtonListen());
        dexterButton.addActionListener(new ButtonListen());
        mediumButton.addActionListener(new ButtonListen());
        
        add(descLabel, BorderLayout.NORTH);        
        add(sinisterButton, BorderLayout.WEST);
        add(mediumButton, BorderLayout.CENTER);
        add(dexterButton, BorderLayout.EAST);
        
        pack();
        setVisible(true);
    }
    private class ButtonListen implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==sinisterButton)
                JOptionPane.showMessageDialog(null,"Sinister's english translation: left");
            else if(e.getSource()==mediumButton)
                JOptionPane.showMessageDialog(null, "Medium's english translation: center");
            else
                JOptionPane.showMessageDialog(null, "Dexter's english translation: right");
        }
    }
    public static void main(String[] args){
        new TranslationGUI();
    }
}
