package gui;
import gm.*;

import javax.swing.*;

public class Case extends JButton {
    private boolean isEmpty = true;
    private int x,y = 0;
    private GMCase gmCase;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.addActionListener(this.gmCase = new GMCase(this.x,this.y));
    }
}
