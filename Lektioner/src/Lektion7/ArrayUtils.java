package Lektion7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtils {



    public static String arrayToString(int[] a) {
        String[] indexString = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            indexString[i] = Integer.toString(a[i]);
        }
        String arrString = Arrays.toString(indexString);
       String rep1 = arrString.replace("[", "{");
       String rep2 = rep1.replace("]","}");
       String rep3 = rep2.replace(",", "");
       return rep3;
    }

    public static int occurences(int[] a, int n) {
        int occurenceCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                occurenceCount++;
            }
        }
        return occurenceCount;
    }

    public static int sum(int[] a) {
        int sum = IntStream.of(a).sum();
        return sum;
    }
}
