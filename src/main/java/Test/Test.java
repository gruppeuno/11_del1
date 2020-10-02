package test;

import Game.RaffleCup;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int i = 1000;
        int[] DiceResult = new int [i];

        for (i = 0; i < 1000; i++){
            RaffleCup test = new RaffleCup();
            test.roll();
            int die1 =test.getDie1();

            System.out.println(i + ": " + die1);
            DiceResult[i] = die1;
        }
        //Output af min max, og sum total
        System.out.println("\nStørste tal i array: " + Arrays.stream(DiceResult).max().getAsInt());
        System.out.println("Mindste tal i array: " + Arrays.stream(DiceResult).min().getAsInt());
        System.out.println("\n\nTotale sum af alle kast: " + Arrays.stream(DiceResult).sum());
            System.out.println(i + ": " + die1);
            DiceResult[i] = die1;
        }
        System.out.println("\nStørste tal i array: " + Arrays.stream(DiceResult).max().getAsInt());
        System.out.println("Mindste tal i array: " + Arrays.stream(DiceResult).min().getAsInt());
        System.out.println("\n\nTotale sum af alle kast: " + Arrays.stream(DiceResult).sum());
            System.out.println(i + ": " + die1);
            DiceResult[i] = die1;
        }
        System.out.println("\nStørste tal i array: " + Arrays.stream(DiceResult).max().getAsInt());
        System.out.println("Mindste tal i array: " + Arrays.stream(DiceResult).min().getAsInt());
    }
}