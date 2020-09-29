package Spil;

import java.util.Scanner;

public class Player{

    //værdier der skal gemmes og de er private så deres scope er klassen
    private int points = 0;
    private final int MAX = 40;
    private String playerName = "";
    private boolean playerWin=false;


    public void setPoints(int totalValue) {
        points+=totalValue;
    }

    public void setPlayerWin(){
        playerWin=true;
    }

    public boolean getPlayerWin(){
        return playerWin;
    }

    public int getPoints(){
        return points;
    }

    public void setPlayerName(String name){
        playerName = name;
    }

    public String getPlayerName(){
        return playerName;
    }




}
