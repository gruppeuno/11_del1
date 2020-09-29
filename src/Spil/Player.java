package Spil;

import java.util.Scanner;

public class Player{

    //værdier der skal gemmes og de er private så deres scope er klassen
    private String playerName = "";
    private int points = 0;
    private boolean playerWin = false;
    private boolean playerPendingWin = false;
    private boolean ekstraSlag = false;
    private boolean antalSeksere = 0;
    private boolean


    public void setPoints(int totalValue, boolean setWin) {
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
