package Game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        //Terning objekt bliver lavet for t1 og t2
        Dice t1 = new Dice(1);
        Dice t2 = new Dice(2);

        Scanner scan = new Scanner(System.in);

        //Opretter spiller1 og spiller2.
        System.out.println("Vælg navn: Spiller 1");
        String player1 = scan.nextLine();
        System.out.println("Vælg navn: Spiller 2");
        String player2 = scan.nextLine();

        while (player1.toLowerCase().equals(player2.toLowerCase())) {
            System.out.println("Spiller 1 og 2 kan ikke have det samme navn - Vælg nyt navn til Spiller 2");
            player2 = scan.nextLine();
        }

        int point1 = 0, point2 = 0;

        while (true) {

            //Spillet for spiller1
            point1 = GameEN.rollText(t1, t2, player1, point1);

            if (point1 == -1) {break;}

            //Spillet for spiller2
            point2 = GameEN.rollText(t1, t2, player2, point2);

            if (point2 == -1) {break;}
        }
    }
}
