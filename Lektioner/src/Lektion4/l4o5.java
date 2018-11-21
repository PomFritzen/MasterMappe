package Lektion4;
import java.util.Scanner;

public class l4o5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int firstNum, secondNum;
      int n = scanner.nextInt();
      firstNum = 0;
      secondNum = 1;
        System.out.println(secondNum);
      for (int i = 2; i<= n; i++) {
          int bothNum = firstNum+secondNum;
          System.out.println(bothNum);
      firstNum = secondNum;
        secondNum = bothNum;
      }

    }
}
