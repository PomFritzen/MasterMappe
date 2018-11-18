package Lektion4;
import java.util.Scanner;

public class l4o1 {
    public static void main(String[] args) {
        Scanner ULTIMATESCANNER = new Scanner(System.in);




        System.out.print("Indtast sidelængden a: ");
        double a = ULTIMATESCANNER.nextDouble();

        System.out.print("Indtast sidelængden b: ");
        double b = ULTIMATESCANNER.nextDouble();

        System.out.print("Indtast sidelængden c: ");
        double c = ULTIMATESCANNER.nextDouble();

        double vinkela = Math.acos((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2*b*c) );

        double vinkelb = Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2*a*c) );

        double vinkelc = Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)) / (2*a*b) );

        if (c > a+b || a > b+c || b > a+c){

            System.out.println("Noget er galt!");

        } else if (a == b && a == c && b == c){

            System.out.println("Trekanten er ligesidet");

        } else if ((a == b || a == c || b == c)) {

            System.out.println("Trekanten er ligebenet");

        } else if (Math.toDegrees(vinkela) == 90 || Math.toDegrees(vinkelb) == 90 || Math.toDegrees(vinkelc) == 90) {

            System.out.println("Trekanten er retvinklet");

        } else if (Math.toDegrees(vinkela) < 90 && Math.toDegrees(vinkelb) < 90 && Math.toDegrees(vinkelc) < 90) {

            System.out.println("Trekanten er spids");

        } else if (Math.toDegrees(vinkela) > 90 || Math.toDegrees(vinkelb) > 90 || Math.toDegrees(vinkelc) > 90) {

            System.out.println("Trekanten er stump");

        }
    }
}
