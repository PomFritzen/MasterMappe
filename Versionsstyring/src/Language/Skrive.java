package Language;

import java.io.*;

public class Skrive {
    public static void main(String[] args) throws IOException {

        String str = "Hello\n" +
                "en til linje\n" +
                "og endnu en\n" +
                "Anders lugter\n" +
                "Jeg ville ønske han ikke lugtede så meget\n" +
                "Jeg elsker kage\n" +
                "Men ikke æblekage\n" +
                "Den er bare ok\n" +
                "Lion bar er klart den bedste chokoladebar\n" +
                "Yankie bar er stærkt overvurderet";
        String mitFilnavn = "minFil.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(mitFilnavn));
        writer.write(str); //skriver streng til filen
        writer.newLine(); //skriver ny line til filen
        writer.close();

      // String mitFilnavn = "minFilEngelsk.txt";

        BufferedReader br = new BufferedReader(new FileReader(mitFilnavn));
        String text = br.readLine();

        while (text != null) {
            System.out.println(text);
            text = br.readLine();
        }
    }
}
