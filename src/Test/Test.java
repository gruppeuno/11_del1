package Test;

public class Test {
    public static void main(String[] args) {
        int t = 0;
        int resultat = 0;

        while(t<1000){
            resultat+=(int)(Math.random() * 6) + 1;
            t++;
        }
        System.out.println(resultat);
    }
}
