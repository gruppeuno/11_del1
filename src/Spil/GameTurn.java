package Spil;

import java.util.Scanner;

public class GameTurn {

    final static int MAX = 40;

    public void gameTurn(int die1, int die2, Player p) {
        System.out.println(p.getPlayerName() + " slog " + die1 +" og " + die2);

        if ((p.getPoints() + die1 + die2)>= MAX) {
            p.setPlayerPendingWin(true);
            p.setPoints(MAX);

        } else {
            p.setPoints(p.getPoints() + die1 + die2);
        }

        if (die1 == die2) {
            //ekstra tur hvis 2 ens
            p.setEkstraSlag(true);

            //snake eyeees, 2x1 = mister alle points, samt mister pending win hvis man nu var på 40
            if ((die1 == 1 && die2 == 1)) {
                p.setPoints(0);
                p.setPlayerPendingWin(false);
                System.out.println("du slog to 1'ere og mistede alle dine points... Du må slå igen");
            }

            //vinder hvis man slår 2 seksere i streg, uanset om det var samme eller forrige tur
            if (die1 == 6 && die2 == 6) {
                //hvis man slog 2x6 sidste tur
                if (p.getAntalSeksere() == 1) {
                    p.setPlayerWin(true);
                    System.out.println("du slog to 6'ere igen!");
                }
                //sætter antal 2x6 til 1
                else {
                    p.setAntalSeksere(1);
                    System.out.println(p.getPlayerName() + " har nu " + p.getPoints() + " points");
                }
            }
            //slå 2 ens for at vinde, hvis altså du er på 40 points
            if (p.getPlayerPendingWin() == true) {
                p.setPlayerWin(true);
                System.out.println("Du vandt!");
                p.setEkstraSlag(false);
            }

            else {
                p.setAntalSeksere(0);
                System.out.println(p.getPlayerName() + " har nu " + p.getPoints() + " points");
            }
        }

        else {
            p.setEkstraSlag(false);
            p.setAntalSeksere(0);
            System.out.println(p.getPlayerName() + " har nu " + p.getPoints() + " points");
        }
    }
}