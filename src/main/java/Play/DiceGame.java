package Play;

import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //points to begin with, and player names
        Player p1 = new Player(0, "Pontus", die1, die2);
        Player p2 = new Player(0, "Halfdan", die1, die2);

        GamePlay g = new GamePlay(0, die1, die2);

        //GUI
        GUI.setNull_fields_allowed(true);
        GUI_Field[] fields = new GUI_Field[40];

        GUI gui = new GUI(fields,Color.PINK);



        Scanner rafle = new Scanner(System.in);
        System.out.println("SHAKE RAFFLE CUP \nby typing >>roll<<");
        System.out.println("\nShake it " + p1.playerName + ";)");

        //x = 1 as player 1 begins
        int x = 1;
        //the loop continues indefinitely atm
        while (p1.points < 40 && p2.points < 40) {
            String s = rafle.nextLine();
            switch (x) {
                case 1:
                    //player one shakes the raffle cup and rolls the dices, if he/she/they types roll ;)
                    if (s.equalsIgnoreCase("roll")) {
                        die1.rollDice();
                        die2.rollDice();

                        //the dices' face values are printed to the console
                        System.out.println(die1.getFaceValue());
                        System.out.println(die2.getFaceValue());
                        gui.setDice(die1.getFaceValue(), die2.getFaceValue());

                        //extra turn if player 1 gets doubles
                        if (die1.getFaceValue() == die2.getFaceValue()) {
                            p1.points += p1.plusPoints();
                            x = 1;
                            if (g.isSnakeEyes()) {
                                p1.losePoints();
                                //x++ as it now is player 2's turn
                                x++;

                            }

                            System.out.println(p1.playerName + ":" + p1.points);
                        } else {
                            //player 1's points are calculated on behalf of the sum of the face value of the dices
                            p1.points += p1.plusPoints();
                            System.out.println(p1.playerName + ":" + p1.points);
                            //x++ as it now is player 2's turn
                            x++;
                        }

                        break;

                    } else {
                        System.out.println(":( plz");
                    }
                case 2:

                    //player one rolls the dices, if he/she/they types roll ;)
                    if (s.equalsIgnoreCase("roll")) {
                        die1.rollDice();
                        die2.rollDice();

                        System.out.println(die1.getFaceValue());
                        System.out.println(die2.getFaceValue());
                        gui.setDice(die1.getFaceValue(), die2.getFaceValue());

                        if (die1.getFaceValue() == die2.getFaceValue()) {
                            p2.points += p2.plusPoints();
                            x = 2;
                            if (g.isSnakeEyes()) {
                                p2.losePoints();
                                x--;
                            }

                            System.out.println(p2.playerName + ":" + p2.points);
                        } else {

                            //player 2's points
                            p2.points += p2.plusPoints();
                            System.out.println(p2.playerName + ":" + p2.points);
                            //x-- as it now is player 1's turn
                            x--;
                        }


                    } else {
                        System.out.println(":( plz");
                    }
            }


        }
        if (p1.points > 40) {
            System.out.println("TILLYKKE " + p1.playerName);
        } else {
            System.out.println("TILLYKKE " + p2.playerName);
        }
    }
}
