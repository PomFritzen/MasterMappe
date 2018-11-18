package Lektion2;
import java.util.Scanner;
import java.lang.*;

public class l2o1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, x0, y0;

        a = scan.nextDouble();
        b = scan.nextDouble();
        x0 = scan.nextDouble();
        y0 = scan.nextDouble();


        double absolutevalue = Math.abs(a*x0-y0+b);
        double output = absolutevalue / Math.sqrt(1+Math.pow(a, 2));
        System.out.println(output);

    }

}
