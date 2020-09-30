package Game;
import gui_main.GUI;

public class Game {


    //game controller skal være static for at fungere i static main
    //static betyder global scope
    static GameController ny = new GameController();
    public static void main(String[] args) {
        ny.gameController();

    }
}
