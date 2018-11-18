package Lektion1;
import java.util.Scanner;
public class l1o3 {
    public static void main(String[] args) {
        Scanner scannerOne = new Scanner(System.in);

        double a = scannerOne.nextDouble();
        double b = scannerOne.nextDouble();
        double c = scannerOne.nextDouble();
        scannerOne.close();

        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else  if (c <= b && c <= a) {
            System.out.println(c);
        }

    }
}
