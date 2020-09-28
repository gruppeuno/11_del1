package Spil;

import java.util.Scanner;

public class Player extends RaffleCup{

    //værdier der skal gemmes og de er private så deres scope er klassen
    private int points = 0;
    private final int MAX = 40;
    private String playerName = "";
    private boolean playerWin=false;


    public void setPoints(){
        points+=getTotalValue();

        if (points<MAX){
        }

        else if (points>=MAX){
            points=40;
            setPlayerWin();
        }
    }



    public void setPlayerWin(){
        playerWin=true;
    }

    public boolean getPlayerWin(){
        return playerWin;
    }

    public int getPoints(){
        System.out.println(points);
        return points;
    }

    public void setPlayerName(String name){
        playerName = name;
    }

    public String getPlayerName(){
        return playerName;
    }




}
