package Lektion4;

import java.util.Scanner;

public class l4_5_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splittedUp = input.split("");
        int lastChar = input.charAt(input.length() - 1);
       int multiplier = 0;

       switch (lastChar) {
           case 48:
               multiplier = 0;
               break;
           case 49:
               multiplier = 1;
               break;
           case 50:
               multiplier = 2;
               break;
           case 51:
               multiplier = 3;
               break;
           case 52:
               multiplier = 4;
               break;
           case 53:
               multiplier = 5;
               break;
           case 54:
               multiplier = 6;
               break;
           case 55:
               multiplier = 7;
               break;
           case 56:
               multiplier = 8;
               break;
           case 57:
               multiplier = 9;
               break;
           default:
               System.out.println("Ugyldig int");
       }

               for (int i = 0; i < splittedUp.length-2; i++) {
                   for (int j = 0; j < multiplier; j++)
                   System.out.print(splittedUp[i]);

               }
    }
}
