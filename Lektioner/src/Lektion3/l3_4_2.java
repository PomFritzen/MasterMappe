package Lektion3;
import java.util.Scanner;

public class l3_4_2 {

    public static void main(String[] args) {
        Scanner scanone = new Scanner(System.in);


        boolean William = true;

        while (William) {
            String password = scanone.nextLine();
            //System.out.println(password);

            if (password.length() < 5) {
                System.out.println("Password for kort");
            }

            else  if (password.length() > 8) {

                System.out.println("Password for langt");

            } else {
                System.out.println("Password tilpas");
                William = false;

            }

        }
    }
}