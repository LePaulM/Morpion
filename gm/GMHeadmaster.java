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
    private int size;
    private GMBoardManagement gmBoardManager = new GMBoardManagement();
    private int playerTurn = 0;
    ArrayList<Player> players = new ArrayList<Player>();
    
    
    public GMHeadmaster(int nbPlayers, int size, boolean playertwo ) {
        Player player = new Player(1, null, "X", 0, size);
        Player newPlayer;
        player.setName("Player1");
        
        this.size = size;

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
                gmBoardManager.addCase(button.GetGMCase());
                gameplanel.add(button);
                ActionListener actionListener = new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        clic(button);
                    }
                 };
                 button.setActionCommand("FirstButton");
                 button.addActionListener(actionListener);
                 System.out.println(button.GetGMCase());
                 
            }
        }
        window = new Window(size,P1Label,score,P2Label,gameplanel);
        
        System.out.println(gmBoardManager.getGameBoard());

        // Initiating game
        nbPlayers--;
        players.add(player);
        if (playertwo) {
            // pour remplir le champ name il faut mettre qqchose sur la 1ere interface
            newPlayer = new Player(2, null, "O", 0, size);
        } else {
            newPlayer = new Player(2, "Player2", "O", 0, size);
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
        button.clic(symbol);



        // checking vitcory
        checkVictory(playing,button);
        
        playerTurn++;
    }

    public void endGame(Player playing) {
        playing.setScore(playing.getScore()+1);
        System.out.println("Victoire ! Bien joué " + playing.getName() + " !");
    }

    public GMBoardManagement getGMBoardManager() {
        return gmBoardManager;
    }

    public void setGMBoardManager(GMBoardManagement newGMBoardManager) {
        this.gmBoardManager = newGMBoardManager;
    }

    public boolean checkVictory(Player playing, Case button) {
        boolean victory = false;

        // si la case est sur la diagonale 1 on cherche si la diagonale est complete
        if (button.GetX() == button.GetY()) { 
            
            for (int i = 0; i<size;i++) {
                // si on est sur la case cliquée on passe au suivant
                if (button.GetX() == gmBoardManager.getCase(i, i).GetX()) {
                    System.out.println(gmBoardManager.getCase(i, i).GetX());    
                    continue;
                }
                // on vérifie si la case que l'on teste est occupée
                // si non, on arrete là car cela signifie que la diagonale n'est pas complete 
                else  if (gmBoardManager.getCase(i, i).GetIsEmpty()) {
                    System.out.println(gmBoardManager.getCase(i, i).GetX()); 
                    System.out.println("diagonale 1 - la case est vide"); 
                    break;
                } 
                // si on est sur une case non cliquée et occupée on regarde le symbole
                // si le symbole n'est pas le même que celui du joueur on arrete
                else if (gmBoardManager.getCase(i, i).getSymbol() != playing.getSymbol()) {
                    System.out.println(gmBoardManager.getCase(i, i).getSymbol()); 
                    System.out.println(playing.getSymbol()); 
                    System.out.println("diagonale 1 - la diagonale est imprenable"); 
                    break;
                } 
            } 
        } else {
            
        }

        return victory;
    }

}