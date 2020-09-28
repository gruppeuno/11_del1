package Game;

import java.util.Scanner;

public class GameEN {

    public static int rollText(Dice t1, Dice t2, String player, int point) {

        Scanner scanRoll = new Scanner(System.in);

        System.out.println(player + " roll the dice!");

        String diceRoll;

        do {
            System.out.println("Use the command \"Roll\"");

            diceRoll = scanRoll.nextLine();
        }
        while (!diceRoll.toLowerCase().equals("roll"));

        //Kaster terningerne
        t1.roll();
        t2.roll();

        //Laver terningerne om til int.
        int roll1 = Integer.parseInt(String.valueOf(t1));
        int roll2 = Integer.parseInt(String.valueOf(t2));

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println("Terningsum i alt for tur: " + roll1 + roll2);

        //Tjekker om spilleren har vundet
        if (point > 40 && roll1 == roll2) {
            System.out.println("Tilykke! " + player + " har vundet spillet!");

            return -1;
        }
        //Checker om der er slået to 1 taller.
        else if (roll1 == 1 && roll2 == 1) {
            roll1 = 0;
            roll2 = 0;
            point = 0;
        }

        point = roll1 + roll2 + point;

        System.out.println(player + " har nu: " + point);

        //Tjekker om der skal slåes igen.
        if (roll1 == roll2) {
            System.out.println(player + " har slået dobbelt. Du får en ekstra tur!");
            point = rollText(t1, t2, player, point);
        }

        return point;
    }
}

