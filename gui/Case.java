package gui;
import gm.*;

import javax.swing.*;

public class Case extends JButton {
    private boolean isEmpty = true;
    private int x,y = 0;
    private GMCase gmCase = new GMCase();

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.gmCase.SetCoordinates(x, y);
    }

    public void clic() {
        System.out.println(this.gmCase.GetCoordinates());
        this.setEnabled(false);

    }


    public String toString() {
        return "case n° : " + this.x + ", " + this.y;
    }
}
