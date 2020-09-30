package Game;

public class Dice {

    //Max til at bruge math.random senere
    private final int MAX = 6;

    //værdier der skal gemmes og de er private så deres scope er klassen
    private int die1;
    private int die2;

    public void roll() {
        die1 =(int)(Math.random() * MAX) + 1;
        die2 =(int)(Math.random() * MAX) + 1;
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }
}
