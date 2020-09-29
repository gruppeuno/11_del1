package Spil;

import java.util.Scanner;

public class Player{

    //værdier der skal gemmes og de er private så deres scope er klassen
    private String playerName = "";
    private int points = 0;
    private boolean playerWin = false;
    private boolean playerPendingWin = false;
    private boolean ekstraSlag = false;
    private int antalSeksere = 0;

    //points
    public void setPoints(int totalValue) {
        this.points=totalValue;
    }
    public int getPoints(){
        return points;
    }

    //Player win
    public void setPlayerWin(boolean playerWin){
        this.playerWin=true;
    }
    public boolean getPlayerWin(){
        return playerWin;
    }

    //navn
    public void setPlayerName(String name){
        this.playerName = name;
    }

    public String getPlayerName(){
        return playerName;
    }

    //set vinder pending
    public void setPlayerPendingWin(boolean playerPendingWin){
        this.playerPendingWin=playerPendingWin;
    }
    public boolean getPlayerPendingWin(){
        return playerPendingWin;
    }

    //ekstra Slag
    public void setEkstraSlag(boolean ekstraSlag) {
        this.ekstraSlag = ekstraSlag;
    }

    public boolean getEkstraSlag() {
        return ekstraSlag;
    }


    public void setAntalSeksere(int antalSeksere) {
        this.antalSeksere = antalSeksere;
    }

    public int getAntalSeksere() {
        return antalSeksere;
    }




}
