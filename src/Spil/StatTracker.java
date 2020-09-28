package Spil;

public class StatTracker{
    //hver spiller skal have en tracker

    private int pointSum = 0;
    int dieOne;
    int dieTwo;

    public void setPointSum(int totalValue){
        pointSum+=totalValue;
        System.out.println(pointSum);
    }

    public int getPointSum(){
        System.out.println(pointSum);
        return pointSum;

    }


   // public String getStats(){

   // }


}
