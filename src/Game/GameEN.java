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

        //Rolls the dice
        t1.roll();
        t2.roll();

        //Reassigns the string value of t1 and t2 to int.
        int roll1 = Integer.parseInt(String.valueOf(t1));
        int roll2 = Integer.parseInt(String.valueOf(t2));

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println("Total sum of the two dices for this round: " + roll1 + roll2);

        //Checks if player has won
        if (point > 40 && roll1 == roll2) {
            System.out.println("Congratulations!\n " + player + " has won the game!");

            return -1;
        }
        //Checking the value of the dices to see if there are multiple 1's.
        else if (roll1 == 1 && roll2 == 1) {
            roll1 = 0; roll2 = 0; point = 0;
        }

        point = roll1 + roll2 + point;

        System.out.println(player + " har nu: " + point);

        //Checking for reroll
        if (roll1 == roll2) {
            System.out.println(player + " har slået dobbelt. Du får en ekstra tur!");
            point = rollText(t1, t2, player, point);
        }

        return point;
    }
}

