package Lektion6;

import java.util.Scanner;

public class l6_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];
        double meanCalc = 0;
        double mean;
        double sum = 0;
        double sd;

        for(int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        for(int j = 0; j < numbers.length; j++) {
            meanCalc +=numbers[j];

        }
        mean = meanCalc/numbers.length;


        for (int k = 0; k < numbers.length; k++) {
            sum += Math.pow(numbers[k]-mean,2);
        }
        sd = Math.sqrt((sum*1/numbers.length));

        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + sd);

    }
}
