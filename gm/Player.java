package gm;

public class Player {
    int id;
    String name;
    String symbol;
    int points = 0;
    int score;
    
    public Player(int id, String name, String symbol, int points, int score) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.points = points;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean checkVictory() {
        if (this.score % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
