package Spil;

import java.util.Scanner;

public class GameController {

    private boolean winner = false;
    private int turnCount = 0;
    private String rollInput;

    //skaber nye objekter af hhv. GameTurn, Player for hver spille, RaffleCup og Scanner
    private GameTurn turn = new GameTurn();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private RaffleCup cup = new RaffleCup();
    private Scanner scan = new Scanner(System.in);
    //array med spillere, bruges sammen med turncount for at skifte spiller
    private Player[] playerArray = {player1,player2};

    public void gameController(){

        //**************lav scanner til de her fistere****************
        player1.setPlayerName("gab");
        player2.setPlayerName("Dennis");


        while (playerArray[turnCount].getPlayerWin()==false){
            do {


                //loop til afvente spillerens roll commando i consollen
                do {
                    System.out.println("Det er din tur " + playerArray[turnCount].getPlayerName() + "\nSkriv \"Roll\" for slå med terningerne!");

                    rollInput = scan.nextLine();
                }
                while (!rollInput.toLowerCase().equals("roll"));

                //ruller terninger med RaffleCup
                cup.roll();

                //ingsætter terningernes værdi og spilleren hvis tur det er, i gameturn
                //som sørger for at der sker det rigtige ud fra hvad terningerne viser
                turn.gameTurn(cup.getDie1(),cup.getDie2(), playerArray[turnCount]);

            //køre igennem flere gange hvis man slår dobbelt
            }while (playerArray[turnCount].getRollAgain()!=false);

            //checker om der er fundet en vinder efter turen
            if (playerArray[turnCount].getPlayerWin()==true){
                break;
            }

            //giver mulighed for at tilføje flere spillere, turn turnCount+1%playerArray.length
            //giver turen til spiller 1 fra den sidste spiller, eller giver turen videre fra spiller 1 til 2
            turnCount= (turnCount+1)%playerArray.length;
            System.out.println("========================================");
            System.out.println();
        }
        //lukker scanner
        scan.close();

    }
}
