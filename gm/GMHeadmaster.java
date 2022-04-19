package gm;

import gui.*;
import gui.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GMHeadmaster {

    private int nb_parties = 0;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private GMBoardManagement gmBoardManager = new GMBoardManagement();
    private int playerTurn = 1;
    ArrayList<Player> players = new ArrayList<Player>();
    Player player = new Player(0, null, "X", 0, 0);

    public GMHeadmaster(int nbPlayers, int size ) {
        nbPlayers--;
        
        Window window;
        // pour plus tard : faire un objet plutot que plusieurs JLabel en vrac comme ça
        JLabel P1Label = new JLabel("Player 1");
        JLabel P2Label = new JLabel("Player 2");
        JLabel score = new JLabel(scoreP1+" - "+scoreP2);
        JPanel gameplanel = new JPanel();
        for (int i = 0; i<size; i++) {
            for (int j = 0; j <size; j++) {
                Case button = new Case(i,j);
                addCase(button);
                gameplanel.add(button);
                ActionListener actionListener = new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        clic(button.GetX(),button.GetY());
                    }
                 };
                 button.setActionCommand("FirstButton");
                 button.addActionListener(actionListener);
                 
            }
        }
        window = new Window(size,P1Label, score,P2Label,gameplanel);
    }

    public void addCase(Case button) {
        gmBoardManager.addCase(button.GetGMCase());
    }

    public void turn() {

        this.playerTurn = player.id;

    }

    public void clic(int x, int y) {

        System.out.println(gmBoardManager.getCase(x, y).toString());

        turn();
    }

    public void checkGameBoard(Player player, int x, int y) {
        // Checking victory for player 1
        if (player.getId() == 1 ) {
            player.setPoints(player.getPoints() + x + y);
            if (player.getPoints() % 3 == 0) {
                // Fin de partie
                this.endGame();
             } else {
                 // Tour suivant
             }
        // Checking victory for player 2
        } else if (player.getId() == 2 ) {
            player.setPoints(player.getPoints() + x + y);
            if (player.getPoints() % 3 == 0) {
                // Fin de partie
                this.endGame();
             } else {
                 // Tour suivant
             }
        } else {
            System.out.println("Error : player unknown."); ;
        }
    }

    public void endGame() {
        System.out.println("Victoire");
    }

    public GMBoardManagement getGMBoardManager() {
        return gmBoardManager;
    }

    public void setGMBoardManager(GMBoardManagement newGMBoardManager) {
        this.gmBoardManager = newGMBoardManager;
    }

}