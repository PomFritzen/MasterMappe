package Lektion3;

import java.util.Scanner;

public class l3_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pyramidHight = scanner.nextInt();
        for(int pyramid = 0; pyramid < pyramidHight; pyramid++) {

            System.out.println("Pyramid " + (pyramid+1));

            for (int i = 1; i <= pyramid+1; i++) {

                for (int startDots = 0; startDots < (pyramid - i+1); startDots++) {
                    System.out.print(".");

                }
                for (int hashTag = 0; hashTag < 2 * i - 1; hashTag++) {
                    System.out.print("#");

                }
                for (int endDots = 0; endDots < (pyramid - i+1); endDots++) {
                    System.out.print(".");
                }

                System.out.println();
            }
        }
            scanner.close();

    }
}

