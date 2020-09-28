package Game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        //Dice object gets created. Two instances.
        Dice t1 = new Dice(1);
        Dice t2 = new Dice(2);

        Scanner scan = new Scanner(System.in);

        //Creates player1 and player2
        System.out.println("Choose name: Player 1");
        String player1 = scan.nextLine();
        System.out.println("Choose name: Player 2");
        String player2 = scan.nextLine();

        while (player1.toLowerCase().equals(player2.toLowerCase())) {
            System.out.println("Player 1 and Player 2 cannot have same name - Player 2 please choose another name");
            player2 = scan.nextLine();
        }

        int point1 = 0, point2 = 0;

        while (true) {

            //Game for player1
            point1 = GameEN.rollText(t1, t2, player1, point1);

            if (point1 == -1) {break;}

            //Game for player2
            point2 = GameEN.rollText(t1, t2, player2, point2);

            if (point2 == -1) {break;}
        }
    }
}
