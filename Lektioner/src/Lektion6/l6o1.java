package Lektion6;

import java.util.Scanner;
import java.util.Arrays;

public class l6o1 {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );
        System.out.print("Enter numbers: ");

        String[] interval = {"1 - 10 |", " 11 - 20 |", "21 - 30", "31 - 40", "41 - 50", "51 - 60", "61 - 70", "71 - 80", "81 - 90", "91 - 100"};


        String input = keyboard.nextLine();

        String[] numbersStr = input.split(" ");

        int[] numbers = new int[ numbersStr.length ];

        for ( int i = 0; i < numbersStr.length; i++ )
        {

            numbers[i] = Integer.parseInt( numbersStr[i] );

            System.out.print( numbers[i] + ", " );

        }
        System.out.println();

    }
}