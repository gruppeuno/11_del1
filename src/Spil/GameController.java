package Spil;

import java.util.Scanner;

public class GameController {

    private boolean winner = false;
    private int turnCount = 0;
    private GameTurn newGame = new GameTurn();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private RaffleCup cup = new RaffleCup();
    private Scanner scan = new Scanner(System.in);
    private Player[] playerArray = {player1,player2};

    public void gameController(){

        player1.setPlayerName("gab");
        player2.setPlayerName("Dennis");

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
                newGame.gameTurn(cup.getDie1(),cup.getDie2(), playerArray[turnCount]);

            }while (playerArray[turnCount].getEkstraSlag()!=false);

            if (playerArray[turnCount].getPlayerWin()==true){
                break;
            }

            //giver mulighed for at tilføje flere spillere, turn turnCount+1%playerArray.length
            //giver turen til spiller 1 fra den sidste spiller, eller giver turen videre fra spiller 1 til 2
            turnCount= (turnCount+1)%playerArray.length;
            System.out.println();
            System.out.println();
        }

    }
}
