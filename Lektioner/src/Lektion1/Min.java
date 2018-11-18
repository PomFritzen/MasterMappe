package Lektion1;

import java.util.Scanner;

public class Min {
    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    public static double min(double a, double b, double c) {

        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else  if (c <= b && c <= a) {
            return c;
        }
return 0;
    }
}
