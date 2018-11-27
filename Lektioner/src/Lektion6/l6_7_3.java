package Lektion6;

public class l6_7_3 {
    public static void main(String[] args) {

        int[] badetemp = new int[args.length];

        for (int i = 0; i < badetemp.length; i++) {
            badetemp[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));

    }
    public static int maks(int[] badetemp){
        int maksTemp = 0;
        for (int i = 0; i < badetemp.length; i++) {
          if (badetemp[i] > maksTemp){
              maksTemp = badetemp[i];
          }
        } return maksTemp;
    }
    public static int antalfald(int[] badetemp) {
        int faldCounter = 0;
        for (int i = 1; i < badetemp.length; i++) {
        if (badetemp[i] < badetemp[i-1]) {
            faldCounter++;
        }
        } return faldCounter;
    }
    // min originale løsning
    // {
    //        int faldCounter = 0;
    //        int lowTemp = badetemp[0];
    //        for (int i = 0; i < badetemp.length; i++) {
    //        if (badetemp[i] < lowTemp) {
    //            faldCounter++;
    //        }
    //        lowTemp = badetemp[i];
    //    } return faldCounter;

}
