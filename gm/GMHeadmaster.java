package gm;

import gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GMHeadmaster {
    private int nb_parties = 0;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private int checkP1 = 0;
    private int checkP2 = 0;
    private ArrayList<GMCase> gameBoard = new ArrayList<GMCase>();
    GMBoardManagement gmBoardManagemer = new GMBoardManagement();


    public GMHeadmaster() {

    }

    public void turn() {

    }

    public void checkGameBoard(int player, int x, int y) {
        // Checking victory for player 1
        if (player == 1 ) {
            checkP1 = checkP1 + x + y;
            if (checkP1 % 3 == 0) {
                // Fin de partie
             } else {
                 // Tour suivant
             }
        // Checking victory for player 2
        } else if (player == 2 ) {
            checkP2 = checkP2 + x + y;
            if (checkP2 % 3 == 0) {
                // Fin de partie
             } else {
                 // Tour suivant
             }
        } else {
            System.out.println("Error : player unknown."); ;
        }
    }

    public void endGame() {

    }


    //          ACTIONS ON GAMEBOARD
    /**
     * Add a box to the GM's gameboard
     * @param gmCase
     */
    public void addCase(GMCase gmCase) {
        gameBoard.add(gmCase);
    }

    /**
     * Get box from GMCase object
     * @param gmCase
     * @return GMCase object
     */
    public GMCase getCase(GMCase gmCase) {
        if (gameBoard.contains(gmCase)) {
            return gameBoard.get(gameBoard.indexOf(gmCase));
        } else {
            throw new NullPointerException();
        }
    }

    /**
     * Get box from box index
     * @param gmCase
     * @return GMCase object
     */
    public GMCase getCase(int gmCase) {
        if (gmCase <= gameBoard.size()) {
            return gameBoard.get(gmCase);
        }
         else {
        throw new NullPointerException();
        }
    }

        /**
     * Get box from box coordinates
     * @param gmCase
     * @return GMCase object
     */
    public GMCase getCase(int x,int y) {
        GMCase returnCase = null;
        for (int i=0; i<gameBoard.size(); i++) {
            if (gameBoard.get(i).GetX() == x && gameBoard.get(i).GetY() == y) {
                returnCase =  gameBoard.get(i);
            }
        }
        if(!Objects.isNull(returnCase)) {
            return returnCase;
        } else {
            throw new NullPointerException();
        }
    }
}