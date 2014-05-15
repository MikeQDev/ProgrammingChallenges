package tic.tac.toe.simulator;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class GameGUI extends JFrame{
    private int gameField[][] = new int[3][3];
    private JPanel gamePanel, buttonPanel;
    private JButton exitButton, newButton;
    private JLabel labels[][] = new JLabel[3][3];
    private int xAmount, oAmount;
    public GameGUI() {
        setTitle("Tic Tac Toe Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildGameBoard();
        
        pack();
        setVisible(true);
    }
    private void buildGameBoard(){
        buildGamePanel();
        buildButtonPanel();
    }
    private void buildGamePanel(){
        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3,3));
        gamePanel.setPreferredSize(new Dimension(300,300));
        addLabels();
        add(gamePanel);
    }
    private void buildButtonPanel(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,6,4));
        newButton = new JButton("New game");
        exitButton = new JButton("Exit");
        
        newButton.setMnemonic(KeyEvent.VK_N);
        exitButton.addActionListener(new ExitListener());
        newButton.addActionListener(new NewGameListener());
        
        buttonPanel.add(newButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private class NewGameListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int rowCount = labels.length;
            int colCount = labels[1].length;
            do{
                xAmount = 0;
                oAmount = 0;
                for(int rows=0; rows<rowCount; rows++){
                    
                    for(int cols=0; cols<colCount; cols++){
                        Random randGen = new Random();
                        int rand = randGen.nextInt(2);
                        char letter;
                        if(rand==0){
                            oAmount++;
                            letter = 'O';
                        }else{
                            xAmount++;
                            letter = 'X';
                        }
                        labels[rows][cols].setText("");
                        labels[rows][cols].setForeground(Color.BLACK);
                        labels[rows][cols].setText(Character.toString(letter));
                    }
                }
            }while(xAmount>5||oAmount>5);
            findWinner();
        }
    }
    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    private void addLabels(){
        gamePanel.add(labels[0][0] = new JLabel("T",SwingConstants.CENTER));
        labels[0][0].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[0][1] = new JLabel("I",SwingConstants.CENTER));
        labels[0][1].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[0][2] = new JLabel("C",SwingConstants.CENTER));
        labels[0][2].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[1][0] = new JLabel("T",SwingConstants.CENTER));
        labels[1][0].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[1][1] = new JLabel("A",SwingConstants.CENTER));
        labels[1][1].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[1][2] = new JLabel("C",SwingConstants.CENTER));
        labels[1][2].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[2][0] = new JLabel("T",SwingConstants.CENTER));
        labels[2][0].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[2][1] = new JLabel("O",SwingConstants.CENTER));
        labels[2][1].setFont(new Font("Serif", Font.BOLD, 48));
        gamePanel.add(labels[2][2] = new JLabel("E",SwingConstants.CENTER));
        labels[2][2].setFont(new Font("Serif", Font.BOLD, 48));
    }
    private void findWinner(){
        int xWin = 0;
        int oWin = 0;
        if(labels[0][0].getText().equalsIgnoreCase("X")&&labels[0][1].getText().equalsIgnoreCase("X")&&labels[0][2].getText().equalsIgnoreCase("X")){
            labels[0][0].setForeground(Color.RED);
            labels[0][1].setForeground(Color.RED);
            labels[0][2].setForeground(Color.RED);
            xWin++;
        }
        if(labels[1][0].getText().equalsIgnoreCase("X")&&labels[1][1].getText().equalsIgnoreCase("X")&&labels[1][2].getText().equalsIgnoreCase("X")){
            labels[1][0].setForeground(Color.RED);
            labels[1][1].setForeground(Color.RED);
            labels[1][2].setForeground(Color.RED);
            xWin++;
        }
        if(labels[2][0].getText().equalsIgnoreCase("X")&&labels[2][1].getText().equalsIgnoreCase("X")&&labels[2][2].getText().equalsIgnoreCase("X")){
            labels[2][0].setForeground(Color.RED);
            labels[2][1].setForeground(Color.RED);
            labels[2][2].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][0].getText().equalsIgnoreCase("X")&&labels[1][0].getText().equalsIgnoreCase("X")&&labels[2][0].getText().equalsIgnoreCase("X")){
            labels[0][0].setForeground(Color.RED);
            labels[1][0].setForeground(Color.RED);
            labels[2][0].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][1].getText().equalsIgnoreCase("X")&&labels[1][1].getText().equalsIgnoreCase("X")&&labels[2][1].getText().equalsIgnoreCase("X")){
            labels[0][1].setForeground(Color.RED);
            labels[1][1].setForeground(Color.RED);
            labels[2][1].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][2].getText().equalsIgnoreCase("X")&&labels[1][2].getText().equalsIgnoreCase("X")&&labels[2][2].getText().equalsIgnoreCase("X")){
            labels[0][2].setForeground(Color.RED);
            labels[1][2].setForeground(Color.RED);
            labels[2][2].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][0].getText().equalsIgnoreCase("X")&&labels[1][1].getText().equalsIgnoreCase("X")&&labels[2][2].getText().equalsIgnoreCase("X")){
            labels[0][0].setForeground(Color.RED);
            labels[1][1].setForeground(Color.RED);
            labels[2][2].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][2].getText().equalsIgnoreCase("X")&&labels[1][1].getText().equalsIgnoreCase("X")&&labels[2][0].getText().equalsIgnoreCase("X")){
            labels[0][2].setForeground(Color.RED);
            labels[1][1].setForeground(Color.RED);
            labels[2][0].setForeground(Color.RED);
            xWin++;
        }
        if(labels[0][0].getText().equalsIgnoreCase("O")&&labels[0][1].getText().equalsIgnoreCase("O")&&labels[0][2].getText().equalsIgnoreCase("O")){
            labels[0][0].setForeground(Color.BLUE);
            labels[0][1].setForeground(Color.BLUE);
            labels[0][2].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[1][0].getText().equalsIgnoreCase("O")&&labels[1][1].getText().equalsIgnoreCase("O")&&labels[1][2].getText().equalsIgnoreCase("O")){
            labels[1][0].setForeground(Color.BLUE);
            labels[1][1].setForeground(Color.BLUE);
            labels[1][2].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[2][0].getText().equalsIgnoreCase("O")&&labels[2][1].getText().equalsIgnoreCase("O")&&labels[2][2].getText().equalsIgnoreCase("O")){
            labels[2][0].setForeground(Color.BLUE);
            labels[2][1].setForeground(Color.BLUE);
            labels[2][2].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[0][0].getText().equalsIgnoreCase("O")&&labels[1][0].getText().equalsIgnoreCase("O")&&labels[2][0].getText().equalsIgnoreCase("O")){
            labels[0][0].setForeground(Color.BLUE);
            labels[1][0].setForeground(Color.BLUE);
            labels[2][0].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[0][1].getText().equalsIgnoreCase("O")&&labels[1][1].getText().equalsIgnoreCase("O")&&labels[2][1].getText().equalsIgnoreCase("O")){
            labels[0][1].setForeground(Color.BLUE);
            labels[1][1].setForeground(Color.BLUE);
            labels[2][1].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[0][2].getText().equalsIgnoreCase("O")&&labels[1][2].getText().equalsIgnoreCase("O")&&labels[2][2].getText().equalsIgnoreCase("O")){
            labels[0][2].setForeground(Color.BLUE);
            labels[1][2].setForeground(Color.BLUE);
            labels[2][2].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[0][0].getText().equalsIgnoreCase("O")&&labels[1][1].getText().equalsIgnoreCase("O")&&labels[2][2].getText().equalsIgnoreCase("O")){
            labels[0][0].setForeground(Color.BLUE);
            labels[1][1].setForeground(Color.BLUE);
            labels[2][2].setForeground(Color.BLUE);
            oWin++;
        }
        if(labels[0][2].getText().equalsIgnoreCase("O")&&labels[1][1].getText().equalsIgnoreCase("O")&&labels[2][0].getText().equalsIgnoreCase("O")){
            labels[0][2].setForeground(Color.BLUE);
            labels[1][1].setForeground(Color.BLUE);
            labels[2][0].setForeground(Color.BLUE);
            oWin++;
        }
        if(xWin==0&&oWin==0)
            JOptionPane.showMessageDialog(null,"No winner");
        else if(oWin>xWin)
            JOptionPane.showMessageDialog(null,"O wins");
        else if(xWin>oWin)
            JOptionPane.showMessageDialog(null,"X wins");
        else if(xWin==oWin)
            JOptionPane.showMessageDialog(null,"Tie");
    }
}