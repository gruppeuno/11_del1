import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String name;
        String name2;
        String enter;
        int firstRoll;
        int secondRoll;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter player1 name");
        name = scan.next();
        Player player1 = new Player(name, 0,0, true);

        System.out.println("Enter player2 name");
        name2 = scan.next();
        Player player2 = new Player(name2, 0,0, false);

        System.out.println("Play to: ");

        int playTo = scan.nextInt();

        while (player1.GamePoints < playTo && player2.GamePoints < playTo) {

            while (player1.hasWon == false && player2.hasWon == false) {
                if (player1.MyTurn) {
                    System.out.println(player1.getName() + ": Type and press enter to roll");
                    enter = scan.next();
                    firstRoll = player1.terning1.roll();
                    secondRoll = player1.terning2.roll();
                    System.out.println("First dice:" + firstRoll);
                    System.out.println("Second dice:" + secondRoll);
                    player1.setPoints(firstRoll + secondRoll);

                    if (firstRoll == 1 && secondRoll == 1) {
                        player1.Points = 0;
                    }

                    System.out.println("Points total:" + player1.Points);


                    if (player1.Points >= 40 && firstRoll == secondRoll) {
                        player1.hasWon = true;
                        System.out.println(player1.getName() + " Has Won a round!");
                        player1.incrementGamePoints();
                        System.out.println(player1.getName() + " now has " + player1.GamePoints + " game points");
                    }

                    player1.MyTurn = false;
                    player2.MyTurn = true;

                    if (firstRoll == secondRoll) {
                        player1.MyTurn = true;
                        player2.MyTurn = false;
                    }
                } else {
                    System.out.println(player2.getName() + ": Type and press enter to roll");
                    enter = scan.next();
                    firstRoll = player2.terning1.roll();
                    secondRoll = player2.terning2.roll();
                    System.out.println("First dice:" + firstRoll);
                    System.out.println("Second dice:" + secondRoll);
                    player2.setPoints(firstRoll + secondRoll);

                    if (firstRoll == 1 && secondRoll == 1) {
                        player2.Points = 0;
                    }

                    System.out.println("Points total:" + player2.Points);


                    if (player2.Points >= 40 && firstRoll == secondRoll) {
                        player2.hasWon = true;
                        System.out.println(player2.getName() + " Has Won a round!");
                        player2.incrementGamePoints();
                        System.out.println(player2.getName() + " now has " + player1.GamePoints + " game points");
                    }

                    player2.MyTurn = false;
                    player1.MyTurn = true;

                    if (firstRoll == secondRoll) {
                        player2.MyTurn = true;
                        player1.MyTurn = false;
                    }
                }

            }
            player1.hasWon = false;
            player2.hasWon = false;
            player1.Points = 0;
            player2.Points = 0;
        }
        if(player1.GamePoints >= playTo){
            System.out.println(player1.getName() + "HAS WON!!!");
        }
        else {
            System.out.println(player2.getName() + "HAS WON!!!");
        }
    }
}
