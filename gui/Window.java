package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gm.*;

public class Window {
    private int size = 3;

    private JFrame frame;
    private JPanel scorePanel;


    public Window(int size,JLabel P1Label, JLabel score, JLabel P2Label, JPanel gamePanel) {
        this.size = size;

        // Create the frame.
        frame = new JFrame("Tic-tac-toe");

        // Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components and put them in the frame.
        // Create panel with score
        
        P1Label.setSize(150,50);
        
        score.setSize(50,50);
        P2Label.setSize(150,50);

        scorePanel = new JPanel();
        scorePanel.add(P1Label);
        scorePanel.add(score);
        scorePanel.add(P2Label);

        frame.getContentPane().add(scorePanel, BorderLayout.NORTH);
        
        // Add game panel
        gamePanel.setLayout(new GridLayout(size,size));
        frame.getContentPane().add(gamePanel);

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
