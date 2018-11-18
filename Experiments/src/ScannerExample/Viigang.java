package ScannerExample;
import java.util.Scanner;

public class Viigang {
    public static void main(String[] args)
    {
        Scanner scanone =  new Scanner(System.in);

        System.out.print("Skriv en integer: ");
        if (scanone.hasNextInt()) {

            int userInput = scanone.nextInt();
            System.out.println("Vi ganger dit lorte tal med to: " + userInput * 2);
            System.out.println("Vi dividerer dit lorte tal med to: " + userInput / 2);
            System.out.println("Vi ganger dit tal med sig selv: " + userInput * userInput);
        }
        else {
            System.out.println("Skriv en integer næste gang!");
        }
    }
}
