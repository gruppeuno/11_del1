package Spil;

import java.util.Scanner;

public class RaffleCup {

    //Max til at bruge math.random senere
    private final int MAX = 6;

    //værdier der skal gemmes og de er private så deres scope er klassen
    private int die1;
    private int die2;
    private int totalValue = 0;

    public void roll() {
        die1 =(int)(Math.random() * MAX) + 1;
        die2 =(int)(Math.random() * MAX) + 1;
        setTotalValue();
    }

    public boolean get2Ens() {
        return die1==die2;
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    public void setTotalValue(){
        totalValue= die1 + die2;
    }

    public int getTotalValue(){
        return totalValue;
    }

}
