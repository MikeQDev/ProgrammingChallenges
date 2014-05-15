package card.dealer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class CardGUI extends JFrame{
    private ImageIcon CARD_BACK = new ImageIcon("Backface_Blue.jpg");
    private ImageIcon RED_JOKER = new ImageIcon("Joker_Red.jpg");
    private ImageIcon BLACK_JOKER = new ImageIcon("Joker_Black.jpg");
    private ArrayList<ImageIcon> cards;
    private JLabel cardDown, cardUp;
    private JButton dealButton, removeJokers;
    private JLabel cardsRemaining;
    private JPanel buttonPanel;
    public CardGUI() {
        setTitle("Card dealer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeCards();
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        buttonPanel = new JPanel();
        removeJokers = new JButton("Remove jokers");
        cardsRemaining = new JLabel("Cards remaining: "+cards.size());
        cardDown = new JLabel(CARD_BACK);
        cardDown.setPreferredSize(new Dimension(165,231));
        cardUp = new JLabel();
        cardUp.setPreferredSize(new Dimension(165,231));
        dealButton = new JButton("Deal a card");
        dealButton.addActionListener(new DealListener());
        dealButton.setMnemonic(KeyEvent.VK_D);
        removeJokers.addActionListener(new JokerRemoveListener());
        buttonPanel.add(dealButton);
        buttonPanel.add(cardsRemaining);
        buttonPanel.add(removeJokers);
        add(cardDown, BorderLayout.WEST);
        add(cardUp, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private void makeCards(){
        cards = new ArrayList();
        cards.add(new ImageIcon("2_Clubs.jpg"));
        cards.add(new ImageIcon("2_Diamonds.jpg"));
        cards.add(new ImageIcon("2_Hearts.jpg"));
        cards.add(new ImageIcon("2_Spades.jpg"));
        cards.add(new ImageIcon("3_Clubs.jpg"));
        cards.add(new ImageIcon("3_Diamonds.jpg"));
        cards.add(new ImageIcon("3_Hearts.jpg"));
        cards.add(new ImageIcon("3_Spades.jpg"));
        cards.add(new ImageIcon("4_Clubs.jpg"));
        cards.add(new ImageIcon("4_Diamonds.jpg"));
        cards.add(new ImageIcon("4_Hearts.jpg"));
        cards.add(new ImageIcon("4_Spades.jpg"));
        cards.add(new ImageIcon("5_Clubs.jpg"));
        cards.add(new ImageIcon("5_Diamonds.jpg"));
        cards.add(new ImageIcon("5_Hearts.jpg"));
        cards.add(new ImageIcon("5_Spades.jpg"));
        cards.add(new ImageIcon("6_Clubs.jpg"));
        cards.add(new ImageIcon("6_Diamonds.jpg"));
        cards.add(new ImageIcon("6_Hearts.jpg"));
        cards.add(new ImageIcon("6_Spades.jpg"));
        cards.add(new ImageIcon("7_Clubs.jpg"));
        cards.add(new ImageIcon("7_Diamonds.jpg"));
        cards.add(new ImageIcon("7_Hearts.jpg"));
        cards.add(new ImageIcon("7_Spades.jpg"));
        cards.add(new ImageIcon("8_Clubs.jpg"));
        cards.add(new ImageIcon("8_Diamonds.jpg"));
        cards.add(new ImageIcon("8_Hearts.jpg"));
        cards.add(new ImageIcon("8_Spades.jpg"));
        cards.add(new ImageIcon("9_Clubs.jpg"));
        cards.add(new ImageIcon("9_Diamonds.jpg"));
        cards.add(new ImageIcon("9_Hearts.jpg"));
        cards.add(new ImageIcon("9_Spades.jpg"));
        cards.add(new ImageIcon("10_Clubs.jpg"));
        cards.add(new ImageIcon("10_Diamonds.jpg"));
        cards.add(new ImageIcon("10_Hearts.jpg"));
        cards.add(new ImageIcon("10_Spades.jpg"));
        cards.add(new ImageIcon("Ace_Clubs.jpg"));
        cards.add(new ImageIcon("Ace_Diamonds.jpg"));
        cards.add(new ImageIcon("Ace_Hearts.jpg"));
        cards.add(new ImageIcon("Ace_Spades.jpg"));
        cards.add(new ImageIcon("Jack_Clubs.jpg"));
        cards.add(new ImageIcon("Jack_Diamonds.jpg"));
        cards.add(new ImageIcon("Jack_Hearts.jpg"));
        cards.add(new ImageIcon("Jack_Spades.jpg"));
        cards.add(BLACK_JOKER);
        cards.add(RED_JOKER);
        cards.add(new ImageIcon("King_Clubs.jpg"));
        cards.add(new ImageIcon("King_Diamonds.jpg"));
        cards.add(new ImageIcon("King_Hearts.jpg"));
        cards.add(new ImageIcon("King_Spades.jpg"));
        cards.add(new ImageIcon("Queen_Clubs.jpg"));
        cards.add(new ImageIcon("Queen_Diamonds.jpg"));
        cards.add(new ImageIcon("Queen_Hearts.jpg"));
        cards.add(new ImageIcon("Queen_Spades.jpg"));
    }
    private class DealListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                Random randGen = new Random();
                int rand = randGen.nextInt(cards.size());
                cardUp.setIcon(cards.get(rand));
                cards.remove(rand);
                cardsRemaining.setText("Cards remaining: "+cards.size());
            if(cards.size()==0){
                cardDown.setIcon(null);
                dealButton.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Out of cards");
            }
            if(!cards.contains(RED_JOKER)&&!cards.contains(BLACK_JOKER))
                removeJokers.setEnabled(false);
            }catch(IndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    private class JokerRemoveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cards.remove(RED_JOKER);
            cards.remove(BLACK_JOKER);
            cardsRemaining.setText("Cards remaining: "+cards.size());
            JOptionPane.showMessageDialog(null,"Removed all jokers");
            removeJokers.setEnabled(false);
        }
    }
}