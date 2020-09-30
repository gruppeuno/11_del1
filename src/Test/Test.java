package Test;

import Game.RaffleCup;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++){
            RaffleCup test = new RaffleCup();
            test.roll();
            int die1 =test.getDie1();

            System.out.println(i + ": " + die1);
        }

    }
}
