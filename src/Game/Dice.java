package Game;

import java.util.Random;

public class Dice {

    private int tVaerdi;

    public Dice(int vaerdi) {
        tVaerdi = vaerdi;
    }

    public void roll() {
        final int MAKS = 6;
        Random tilf = new Random();
        tVaerdi = tilf.nextInt(MAKS)+1;
    }
    public String toString(){
        return Integer.toString(tVaerdi);
    }
}
