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
        scan.close();
        System.out.println("welcommen til spillet");


        while(player1.getPlayerWin()!=true && player2.getPlayerWin()!=true){

            dinTurPlayer1();
            player1.roll();

        }




    }

    public void dinTurPlayer1(){
        System.out.println( "Det er din tur " + player1.getPlayerName() + ", slå med rasslebæreret, skriv slå tryk enter for at slå");
        String slå = scan.nextLine();
        scan.close();
    }
}
