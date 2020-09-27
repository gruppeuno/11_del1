package Spil;

import java.util.Scanner;

public class Spil {

    public static void main(String[] args) {

        //Terning objekt bliver lavet for t1 og t2
        Terning t1 = new Terning(1);
        Terning t2 = new Terning(2);

        Scanner scan = new Scanner(System.in);

        //Opretter spiller1 og spiller2.
        System.out.println("Vælg navn: Spiller 1");
        String spiller1 = scan.nextLine();
        System.out.println("Vælg navn: Spiller 2");
        String spiller2 = scan.nextLine();

        while (spiller1.toLowerCase().equals(spiller2.toLowerCase())) {
            System.out.println("Spiller 1 og 2 kan ikke have det samme navn - Vælg nyt navn til Spiller 2");
            spiller2 = scan.nextLine();
        }

        int point1 = 0, point2 = 0;

        while (true) {

            //Spillet for spiller1
            point1 = kastText(t1, t2, scan, spiller1, point1);

            if (point1 == -1) {break;}

            //Spillet for spiller2
            point2 = kastText(t1, t2, scan, spiller2, point2);

            if (point2 == -1) {break;}
        }
    }
    private static int kastText(Terning t1, Terning t2, Scanner scan, String spiller, int point) {

        System.out.println(spiller + " kast terningen!");

        String tKast;

        do {
            System.out.println("Brug kommandoen \"Kast\"");

            tKast = scan.nextLine();
        }
        while (!tKast.toLowerCase().equals("kast"));

        //Kaster terningerne
        t1.kast();
        t2.kast();

        //Laver terningerne om til int.
        int kast1 = Integer.parseInt(String.valueOf(t1));
        int kast2 = Integer.parseInt(String.valueOf(t2));

        System.out.println(kast1);
        System.out.println(kast2);

        //Tjekker om spilleren har vundet
        if (point > 40 && kast1 == kast2) {
            System.out.println("Tilykke! " + spiller + " har vundet spillet!");

            return -1;
        }
        //Checker om der er slået to 1 taller.
        else if (kast1 == 1 && kast2 == 1) {
            kast1 = 0; kast2 = 0; point = 0;
        }

        point = kast1 + kast2 + point;

        System.out.println(spiller + " har nu: "+ point);

        //Tjekker om der skal slåes igen.
        if (kast1 == kast2) {
            System.out.println(spiller + " har slået dobbelt. Du får en ekstra tur!");
            point = kastText(t1, t2, scan, spiller, point);
        }

        return point;
    }
}
