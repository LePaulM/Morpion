package gm;

import gui.*;

import java.util.List;
import org.javatuples.Pair;

public class GMCase {
    private boolean isEmpty = true;
    private int x,y = 0;

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

    public boolean GetThisEmpty() {
        return this.isEmpty;
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

    public String clic() {
        this.isEmpty=false;
        String sign = null;

        return sign;
    }
}
