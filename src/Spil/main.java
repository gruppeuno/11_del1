package Spil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean winner = false;
        GameRules newGame = new GameRules();
        Player player1 = new Player();
        Player player2 = new Player();
        RaffleCup cup = new RaffleCup();
        player1.setPlayerName("gab");
        player2.setPlayerName("Dennis");
        Scanner scan = new Scanner(System.in);


        while (player1.getPlayerWin()==false && player2.getPlayerWin()==false){
            do {

                //String diceRoll;
                //do {
                //    System.out.println(player1.getPlayerName() + " use the command \"Roll\"");
//
                //    diceRoll = scan.nextLine();
                //}
                //while (!diceRoll.toLowerCase().equals("roll"));

                cup.roll();
                newGame.Game(cup.getDie1(),cup.getDie2(), player1);
            }while (player1.getEkstraSlag()!=false && player2.getPlayerWin()!=true);

            if (player1.getPlayerWin()==true){
                break;
            }
            System.out.println();
            System.out.println("næste spillers tur");
            System.out.println();


        }


    }
}
