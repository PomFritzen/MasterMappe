package Lektion2;

import java.util.Scanner;

public class l2_3_3 {

    public static void main(String[] args)
    {
        Scanner scanone = new Scanner(System.in);

        String password = scanone.nextLine();
        if (password.length() < 5) {
            System.out.println("Password for kort");
        }

        else{
            if (password.length() > 8) {

                System.out.println("Password for langt");

            } else {
                System.out.println("Password tilpas");

            }
        }

    }
}
