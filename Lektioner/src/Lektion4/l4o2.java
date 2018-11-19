package Lektion4;

import java.util.Scanner;

public class l4o2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String nameCaseIncensitive = name.toLowerCase();
        String guessName;
        String guessNameCaseIncensitive;
        do {
            guessName = scanner.next();
            guessNameCaseIncensitive = guessName.toLowerCase();
            int compare = guessNameCaseIncensitive.compareTo(nameCaseIncensitive);
            if (compare < 0) {
                System.out.println("Mit navn er efter i alfabetet.");
         } else if (compare > 0) {
                System.out.println("Mit navn er før i alfabetet.");
         }

        } while (!guessNameCaseIncensitive.equals(nameCaseIncensitive));
        System.out.println("Du gættede rigtigt.");
    }
}
