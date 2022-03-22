package gm;

import gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import org.javatuples.Pair;

public class GMCase extends GMHeadmaster {
    private boolean isEmpty = true;
    private int x,y = 0;

    public GMCase() {}

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

    public List<Object> GetCoordinates() {
        Pair<Integer,Integer> coords = new Pair<Integer,Integer> (this.x,this.y);
        return coords.toList();
    }

    public void SetX(int x) {
        this.x = x;
    }

    public void SetY(int y) {
        this.y = y;
    }

    public void SetCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
