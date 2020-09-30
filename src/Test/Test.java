package Test;

import Game.Dice;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i <= 1; i++){
            Dice test = new Dice();
            test.roll();
            test.getDie1();
            test.getDie2();

            System.out.println(test);
        }

    }
}
