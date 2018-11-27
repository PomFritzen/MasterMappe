package Lektion2;

import java.util.Scanner;

public class l2_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextDouble();
        }
        double diskriminant = (Math.pow(values[1], 2)) - 4 * values[0] * values[2];

        if (values[0] == 0) {
            if (values[1] == 0)
                 System.out.println("Ingen rødder");
             else
                System.out.println(-values[2] / values[1]);

        } else if (diskriminant < 0) {
            System.out.println("Ingen rødder");
        } else if (diskriminant > 0 ) {
            double rootOne = (( -values[1]) + Math.sqrt(diskriminant)) / 2 * values[0];
            double rootTwo = (( -values[1]) - Math.sqrt(diskriminant)) / 2 * values[0];
            System.out.println(rootOne + " " + rootTwo);
        } else if (diskriminant == 0) {
            double rootOnly = ((-1) * values[1]) / 2 * values[0];
            System.out.println(rootOnly);
        }

    }
}
