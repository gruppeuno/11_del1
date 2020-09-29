package Spil;

import java.util.Scanner;

public class Game {
//efefwef

    RaffleCup cup = new RaffleCup();
    Player player1 = new Player();
    Player player2 = new Player();
    Scanner scan = new Scanner(System.in);


    public void playGame(){
        //instnce af stattracker så den kan kommunikere med rafflecup og player
        //for loop af liste af spilelre til at gennemgå spillere


        System.out.println("player 1 skriv dit navn: ");
        player1.setPlayerName(scan.nextLine());
        System.out.println("player 2 skriv dit navn: ");
        player2.setPlayerName(scan.nextLine());
        System.out.println("welcommen til spillet");




        while(player1.getPlayerWin()!=true && player2.getPlayerWin()!=true){
            int totalValue;
            System.out.println(player1.getPlayerName() + " roll the dice!");
            cup.roll();
            totalValue = cup.getTotalValue();
            player1.setPoints(totalValue, cup.getWin());
            plusPoints();


        }
        System.out.println("vinder fundet");




    }

    public void plusPoints(){
        player1.setPoints(player1.getPoints()+cup.getTotalValue(), cup.getWin());
        if (player1.getPoints()<40){
        }

        else if (player1.getPoints()>=40){
            player1.setPoints(40, cup.getWin());
            player1.setPlayerWin();
        }
    }
}
