package Lektion8;

import java.util.Arrays;
import java.util.Scanner;

public class l8_9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] values = new int[inputArr.length];
        int counter = 0;

        for (int i = 0; i < inputArr.length; i++) {
            values[i] = Integer.parseInt(inputArr[i]);
        }

       for (int j = 0; j < values.length; j++) {
           if (values[j] % 2 == 0)
               counter++;
        }

        System.out.println(counter);
    }
}
