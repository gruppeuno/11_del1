package Spil;

public class GameTurn {

    //max points
    final static int MAX = 40;

    public void gameTurn(int die1, int die2, Player p) {
        System.out.println(p.getPlayerName() + " slog " + die1 +" og " + die2);

        //set PlayerPendingWin til true, hvis spilleren har +40 points, samt sæt værdien til MAX
        if (p.getPoints()>= MAX) {
            p.setPlayerPendingWin(true);
            p.setPoints(MAX);

        //læg ternings siderne til points
        } else {
            p.setPoints(p.getPoints() + die1 + die2);
        }

        //hvis 2 ens
        if (die1 == die2) {

            //ekstra tur hvis 2 ens
            p.setRollAgain(true);

            //snake eyeees, 2x1 = mister alle points, samt mister pending win hvis man nu var på 40 points
            if ((die1 == 1 && die2 == 1)) {
                p.setPoints(0);
                p.setPlayerPendingWin(false);
                System.out.println("du slog to 1'ere og mistede alle dine points... Du må slå igen");
            }

            //vinder hvis man slår 2 seksere i streg, uanset om det var samme eller forrige tur
            if (die1 == 6 && die2 == 6) {
                //hvis man slog 2x6 sidste tur
                if (p.getSixes() == 1) {
                    p.setPlayerWin(true);
                    System.out.println("du slog to 6'ere igen!");
                }
                //sætter antal 2x6 til 1
                else {
                    p.setSixes(1);
                }
            }
            //slå 2 ens for at vinde, hvis altså du er på 40 points
            if (p.getPlayerPendingWin() == true) {
                p.setPlayerWin(true);
                System.out.println("Du vandt!");
                p.setRollAgain(false);
            }

            //set seksere til 0, da spiller ikke slog 6
            else {
                p.setSixes(0);
                System.out.println(p.getPlayerName() + " har nu " + p.getPoints() + " points");
            }
        }

        else {
            p.setRollAgain(false);
            p.setSixes(0);
            System.out.println(p.getPlayerName() + " har nu " + p.getPoints() + " points");
        }
    }
}