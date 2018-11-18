package Lektion4;

import java.util.Scanner;

public class l4o2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();


        boolean keepLoop = false;

        while(!keepLoop) {
            String guessName = scanner.next();

            int nameToInt = (int) guessName.charAt(0);
            int realNameToInt = (int) name.charAt(0);

            if (guessName.equals(name)) {
                System.out.println("Du gættede rigtigt");
            } else if (nameToInt < realNameToInt) {
                System.out.println("Mit navn er efter i alfabetet. ");
            } else if (nameToInt > realNameToInt){
                System.out.println("Mit navn er før i alfabetet.");
            }
        }

    }
}
