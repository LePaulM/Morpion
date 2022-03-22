package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window {
    int size = 3;


    public Window(int size) {
        this.size = size;

        // Create the frame.
        JFrame frame = new JFrame("Tic-tac-toe");

        // Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components and put them in the frame.
        // Create panel with score
        JLabel P1Label = new JLabel("Player 1");
        P1Label.setSize(150,50);
        JLabel score = new JLabel(" 0 - 0 ");
        score.setSize(50,50);
        JLabel P2Label = new JLabel("Player 2");
        P2Label.setSize(150,50);

        JPanel scorePanel = new JPanel();
        scorePanel.add(P1Label);
        scorePanel.add(score);
        scorePanel.add(P2Label);

        frame.getContentPane().add(scorePanel, BorderLayout.NORTH);
        
        // Add game panel
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(size,size));
        frame.getContentPane().add(gamePanel);

        // Add boxes
        for ( int i=0; i<size; i++) {
            for ( int j=0; j<size; j++) {
                Case button = new Case(i,j);
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){  
                        button.clic();  
                        }  
                    });  
                gamePanel.add(button);
                
            }
        }
        


        // Size the frame.
        frame.setSize(500, 500);

        // Show it.
        frame.setVisible(true);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

}
