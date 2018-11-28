package Lektion7;

public class l7_9_1 {
    public static int[] a = {1,3,3,2,1};

    public static void main(String[] args) {

        System.out.println("As string: " + ArrayUtils.arrayToString(a));
        System.out.println("Occurences: " + ArrayUtils.occurences(a, 3));
        System.out.println("Sum: " + ArrayUtils.sum(a));

    }
}
