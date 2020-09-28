package Spil;

public class RaffleCup {
    //Max til at bruge math.random senere
    private final int MAX = 6;

    //værdier der skal gemmes og de er private så deres scope er klassen
    private int die1 = 1;
    private int die2 = 1;
    private int totalValue = 0;

    //ruller terninger vha math.random, bruger setteren setTotalValue() og er i sig selv
    //en setter for die1 og die2
    public void roll(){
        setDie1();
        setDie2();

        setTotalValue();
        System.out.println("Du slog en " + die1 + " og en " + die2);
        System.out.println("+" + totalValue + " points");
    }

    public void setDie1(){
        die1 =(int)(Math.random() * MAX) + 1;
    }

    public void setDie2(){
        die2 =(int)(Math.random() * MAX) + 1;
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
