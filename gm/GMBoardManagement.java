package gm;

import java.util.*;

public class GMBoardManagement {
    private ArrayList<GMCase> gameBoard = new ArrayList<GMCase>();

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
     * Get box from array index
     * @param gmCasePos
     * @return GMCase object
     */
    public GMCase getCase(int gmCasePos) {
        if (gmCasePos <= gameBoard.size()) {
            return gameBoard.get(gmCasePos);
        }
         else {
        throw new NullPointerException();
        }
    }

        /**
     * Get box from box coordinates
     * @param int x,y
     * @return GMCase object
     */
    public GMCase getCase(int x,int y) {
        System.out.println(x);
        GMCase returnCase = null;
        for (int i=0; i<gameBoard.size(); i++) {
            if (gameBoard.get(i).GetX() == x && gameBoard.get(i).GetY() == y) {
                returnCase =  gameBoard.get(i);
            }
        }
        System.out.println(returnCase.toString());
        if(!Objects.isNull(returnCase)) {
            return returnCase;
        } else {
            throw new NullPointerException();
        }
    }

    public ArrayList<GMCase> getGameBoard() {
        return this.gameBoard;
    }

    public void setGameBoard(ArrayList<GMCase> newGameBoard) {
        this.gameBoard = newGameBoard;
    }

    public void createBoard(int size) {
        
    }
}
