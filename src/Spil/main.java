package Spil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        GameRules newGame = new GameRules();
        Player player1 = new Player();
        Player player2 = new Player();
        RaffleCup cup = new RaffleCup();
        player1.setPlayerName("gab");
        player2.setPlayerName("Dennis");


        cup.roll();
        newGame.Game(cup.getDie1(),cup.getDie2(), player1);


        cup.roll();
        newGame.Game(cup.getDie1(),cup.getDie2(), player2);


    }
}
