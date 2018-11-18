package Lektion3;

import java.util.Scanner;

public class l3o2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean exitWasTyped = false;

        int inputInInt;


        while (!exitWasTyped) {
            String input = scanner.next();

            if (input.compareTo("exit") == 0) {
                exitWasTyped = true;
            } else {

                inputInInt = (int) input.charAt(0);

                if (inputInInt == 35 || inputInInt == 33 || inputInInt == 43 || inputInInt == 92) {
                    System.out.println("Tegnet er et af de 4 specialtegn");
                } else if (inputInInt >= 48 && inputInInt <= 57) {
                    System.out.println("Tegnet er et tal");
                } else if (inputInInt >= 97 && inputInInt <= 122) {
                    System.out.println("Tegnet er et lille bogstav");
                } else if (inputInInt >= 65 && inputInInt <= 90) {
                    System.out.println("Tegnet er et stort bogstav");
                } else System.out.println("Tegnet er ikke kendt af dette program");

            }

        }
    }
}