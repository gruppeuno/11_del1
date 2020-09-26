package Spil;

import java.util.Scanner;

public class Spil {

    public static void main(String[] args) {

        //Terning objekt bliver lavet for t1 og t2
        Terning t1 = new Terning(1);
        Terning t2 = new Terning(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Vælg navn: Spiller 1");
        String spiller1 = scan.nextLine();
        System.out.println("Vælg navn: Spiller 2");
        String spiller2 = scan.nextLine();

        while (spiller1.toLowerCase().equals(spiller2.toLowerCase())) {
            System.out.println("Spiller 1 og 2 kan ikke have det samme navn - Vælg nyt navn til Spiller 2");
            spiller2 = scan.nextLine();
        }

        int point1, point2;

        while (true) {

            System.out.println(spiller1 + " kast terningen!");

            String tKast;

            do {
                System.out.println("Brug kommandoen \"kast\"");

                tKast = scan.nextLine();
            }
            while (!tKast.toLowerCase().equals("kast"));


            t1.kast(); t2.kast();

            //Omdanner Terning class output til int
            int kast1 = Integer.parseInt(String.valueOf(t1));
            int kast2 = Integer.parseInt(String.valueOf(t2));

            System.out.println(kast1);
            System.out.println(kast2);

            point1 = kast1 + kast2;

            System.out.println(point1);


        }
    }
}
