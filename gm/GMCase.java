package gm;

import gui.*;

import java.util.List;
import org.javatuples.Pair;

public class GMCase {
    private boolean isEmpty = true;
    private int x,y = 0;
    private String symbol;

    public GMCase() {}

    public GMCase(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int GetX() {
        return this.x;
    }

    public int GetY() {
        return this.y;
    }

    public boolean GetIsEmpty() {
        return this.isEmpty;
    }

    public void SetIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void clic(String symbol) {
        this.isEmpty=false;
        this.setSymbol(symbol);
    }

    public String toString() {
        return "case n° : " + this.GetX() + ", " + this.GetY();
    }
}
