package gm;

import gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class GMCase extends GMHeadmaster {
    private boolean isEmpty = true;
    private int x,y = 0;

    public GMCase(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("case n° : " + x + ", " + y);
    }

    public int GetX() {
        return this.x;
    }

    public int GetY() {
        return this.y;
    }

    public int[] GetCoordinates() {
        int[] coords = {this.x,this.y};
        return coords;
    }
}
