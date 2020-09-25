package Spil;

public class Spil {

    public static void main(String[] args) {

        Terning t1 = new Terning(1);
        Terning t2 = new Terning(1);

        t1.kast(); t2.kast();

        //Omdanner Terning class output til int
        int kast1 = Integer.parseInt(String.valueOf(t1));
        int kast2 = Integer.parseInt(String.valueOf(t2));

        System.out.println(kast1);
        System.out.println(kast2);

    }
}
