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
    private int playerTurn = 0;
    ArrayList<Player> players = new ArrayList<Player>();
    Player player = new Player(1, null, "X", 0, 0);
    
    public GMHeadmaster(int nbPlayers, int size, boolean playertwo ) {
        Player newPlayer;
        player.setName("name");
        
        // Initiating window
        Window window;
        // pour plus tard : faire un objet plutot que plusieurs JLabel en vrac comme ça
        JLabel P1Label = new JLabel(player.getName());
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

                        clic(button);
                    }
                 };
                 button.setActionCommand("FirstButton");
                 button.addActionListener(actionListener);
                 
            }
        }
        window = new Window(size,P1Label, score,P2Label,gameplanel);
        
        // Initiating game
        nbPlayers--;
        players.add(player);
        if (playertwo) {
            // pour remplir le champ name il faut mettre 
            newPlayer = new Player(2, null, "O", 0, 0);
        } else {
            newPlayer = new Player(2, "Player2", "O", 0, 0);
        }
        players.add(newPlayer);
    }

    public void addCase(Case button) {
        gmBoardManager.addCase(button.GetGMCase());
    }

    public void clic(Case button) {
        // Déterminer à qui le tour
        playerTurn = Math.floorMod(playerTurn, 2);
        
        // récupérer l'objet Player qui fait l'action
        Player playing = players.get(playerTurn);
        

        // actions on button
        String symbol = playing.getSymbol();
        button.setText(symbol);
        button.setEnabled(false);

        
        // les points sont la somme des X et Y de toutes les case occupées par le joueur
        // pour l'instant ça marche pas
        playing.setPoints(playing.getPoints()+button.GetX()+button.GetY());

        // checking vitcory
        if (playing.checkVictory())  {
            endGame();
        }
        
    
        playerTurn++;
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