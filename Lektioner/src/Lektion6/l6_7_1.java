package Lektion6;

import java.util.Arrays;
import java.util.Scanner;

public class l6_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbersStr = input.split(" ");
        int[] numbersInt = new int[numbersStr.length];
        int starOnes = 0;
        int starTens = 0;
        int starTwenties = 0;
        int starThirdies = 0;
        int starFourties = 0;
        int starFifties = 0;
        int starSixties = 0;
        int starSeventies = 0;
        int starEighties = 0;
        int starNineties = 0;


        for (int i = 0; i < numbersStr.length; i++) {
            numbersInt[i] = Integer.parseInt(numbersStr[i]);

        }
        for (int j = 0; j < numbersInt.length; j++) {
            if (numbersInt[j] > 0 && numbersInt[j] < 11) {
                starOnes++;
            }
            if (numbersInt[j] > 10 && numbersInt[j] < 21) {
                starTens++;
            }
            if (numbersInt[j] > 20 && numbersInt[j] < 31) {
                starTwenties++;
            }
            if (numbersInt[j] > 30 && numbersInt[j] < 41) {
                starThirdies++;
            }
            if (numbersInt[j] > 40 && numbersInt[j] < 51) {
                starFourties++;
            }
            if (numbersInt[j] > 50 && numbersInt[j] < 61) {
                starFifties++;
            }
            if (numbersInt[j] > 60 && numbersInt[j] < 71) {
                starSixties++;
            }
            if (numbersInt[j] > 70 && numbersInt[j] < 81) {
                starSeventies++;
            }
            if (numbersInt[j] > 80 && numbersInt[j] < 91) {
                starEighties++;
            }
            if (numbersInt[j] > 90 && numbersInt[j] <= 100) {
                starNineties++;
            }
        }
        System.out.print("1  - 10  | ");
        for (int k = 0; k < starOnes; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("11 - 20  | ");
        for (int k = 0; k < starTens; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("21 - 30  | ");
        for (int k = 0; k < starTwenties; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("31 - 40  | ");
        for (int k = 0; k < starThirdies; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("41 - 50  | ");
        for (int k = 0; k < starFourties; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("51 - 60  | ");
        for (int k = 0; k < starFifties; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("61 - 70  | ");
        for (int k = 0; k < starSixties; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("71 - 80  | ");
        for (int k = 0; k < starSeventies; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("81 - 90  | ");
        for (int k = 0; k < starEighties; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("91 - 100 | ");
        for (int k = 0; k < starNineties; k++) {
            System.out.print("*");
        }
    }
}
