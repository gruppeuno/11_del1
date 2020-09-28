package Spil;

import java.util.Random;

public class Terning {

    private int tVaerdi;

    public Terning (int vaerdi) {
        tVaerdi = vaerdi;
    }

    public void kast () {
        final int MAKS = 6;
        Random tilf = new Random();
        tVaerdi = tilf.nextInt(MAKS)+1;
    }
    public String toString(){
        return Integer.toString(tVaerdi);
    }
}
