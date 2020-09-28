package Spil;

import java.util.Random;

public class Terning {

    private final int MAKS = 6;

    private int tVaerdi;

    public Terning (int vaerdi) {
        tVaerdi = vaerdi;
    }

    public void kast () {
        Random tilf = new Random();
        tVaerdi = tilf.nextInt(MAKS)+1;
    }
    public String toString(){
        String resultat = Integer.toString(tVaerdi);
        return resultat;
    }
}
