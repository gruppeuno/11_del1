package Spil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean winner = false;
        GameTurn newGame = new GameTurn();
        Player player1 = new Player();
        Player player2 = new Player();
        RaffleCup cup = new RaffleCup();
        player1.setPlayerName("gab");
        player2.setPlayerName("Dennis");
        Scanner scan = new Scanner(System.in);
        Player[] playerArray = {player1,player2};
        int turnCount = 0;


        while (playerArray[turnCount].getPlayerWin()==false){
            do {

                //String diceRoll;
                //do {
                //    System.out.println(player1.getPlayerName() + " use the command \"Roll\"");
//
                //    diceRoll = scan.nextLine();
                //}
                //while (!diceRoll.toLowerCase().equals("roll"));

                cup.roll();
                newGame.gameTurn(cup.getDie1(),cup.getDie2(), player1);
            }while (playerArray[turnCount].getEkstraSlag()!=false);
            //giver mulighed for at tilføje flere spillere, turn turnCount+1%playerArray.length
            //giver turen til spiller 1 fra den sidste spiller
            turnCount= (turnCount+1)%playerArray.length;

            if (playerArray[turnCount].getPlayerWin()==true){
                break;
            }


            System.out.println();
            System.out.println("næste spillers tur");
            System.out.println();


        }


    }
}
