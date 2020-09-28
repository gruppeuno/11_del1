package Play;

public class GamePlay {
    int points = 0;
    Dice die1;
    Dice die2;

    public GamePlay(int p, Dice d1, Dice d2){
        points = p;
        die1 = d1;
        die2 = d2;
    }

    public boolean isSnakeEyes (){
        if (die1.getFaceValue() + die2.getFaceValue() == 2) {
            return true;
        }
        return false;
    }

    public boolean isDiceValueSame(){
        if (die1.getFaceValue() == die2.getFaceValue()) {
            return true;
        }
        return false;
    }

}
