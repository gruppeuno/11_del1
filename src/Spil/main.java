package Spil;

public class main {
    //uden for metoden, ret andre
    //game controller skal være static for at fungere i static main
    //static betyder global scope
    static GameController ny = new GameController();
    public static void main(String[] args) {
        ny.gameController();

    }
}
