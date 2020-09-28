package Game;

import java.util.Random;

public class Dice {

    private int fValue;

    public Dice(int value) {
        fValue = value;
    }

    public boolean roll() {
        final int MAX = 6;
        Random random = new Random();
        fValue = random.nextInt(MAX)+1;
        return false;
    }
    public String toString(){
        return Integer.toString(fValue);
    }
}
