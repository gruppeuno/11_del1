package Spil;

import java.util.Scanner;

public class GameRules {

    final static int MAX = 40;

    public static void main(int die1, int die2, Player p) {
        Scanner scan = new Scanner(System.in);

        if (p.getPoints() > MAX) {
            p.setPlayerPendingWin(true);
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
            }

            //vinder hvis man slår 2 seksere i streg, uanset om det var samme eller forrige tur
            if (die1 == 6 && die2 == 6) {
                //hvis man slog 2x6 sidste tur
                if (p.getAntalSeksere() == 1) {
                    p.setPlayerWin(true);
                }
                //sætter antal 2x6 til 1
                else {
                    p.setAntalSeksere(1);
                }
            }
            //slå 2 ens for at vinde, hvis altså du er på 40 points
            if (p.getPlayerPendingWin() == true) {
                p.setPlayerWin(true);
            }
        } else {
            p.setEkstraSlag(false);
            p.setAntalSeksere(0);
        }
    }
}