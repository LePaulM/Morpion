package gui;
import gm.*;

import javax.swing.*;

public class Case extends JButton {
    private int x,y = 0;
    private GMCase gmCase;

    public Case() {}

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.gmCase = new GMCase(x,y);
    }

    public void clic() {
        
        this.setEnabled(false);
        // this.setText("X");
        System.out.println(this.toString());
    }


    public String toString() {
        return "case n° : " + this.getX() + ", " + this.getY();
    }

    public int GetX() {
        return this.x;
    }

    public int GetY() {
        return this.y;
    }


    public void SetX(int x) {
        this.x = x;
    }

    public void SetY(int y) {
        this.y = y;
    }

    public void SetCoordinates(int x, int y) {
        this.SetX(x);
        this.SetY(y);
    }

    public GMCase GetGMCase() {
        return this.gmCase;
    }
}
