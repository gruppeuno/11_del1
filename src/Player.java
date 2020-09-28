public class Player {
    String Name;
    int Points;
    int GamePoints;
    boolean hasWon;
    boolean MyTurn;
    Dice terning1;
    Dice terning2;

    public Player(String name, int points, int gamePoints, boolean myTurn){
        Name = name;
        Points = points;
        GamePoints = gamePoints;
        terning1 = new Dice(1);
        terning2 = new Dice(1);
        hasWon = false;
        MyTurn = myTurn;

    }
public String getName(){
        return this.Name; // this.Name fordi det en enkelte spillers navn
}

public void setPoints(int points){
        this.Points += points;
}

public void incrementGamePoints(){
        this.GamePoints++;
}

}
