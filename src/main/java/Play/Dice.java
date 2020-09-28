package Play;

public class Dice {

    private int faceValue = 1;

    public Dice(){
    }

    public int getFaceValue(){
        return faceValue;
    }

    public void rollDice(){
        faceValue = (int)(Math.random()*6)+1;
    }



}
