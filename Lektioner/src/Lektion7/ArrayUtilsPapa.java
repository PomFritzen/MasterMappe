package Lektion7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtilsPapa {
    public static String arrayToString(int[] values) {
        String intAsStrings[] = Arrays.stream(values)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        CharSequence seq = " ";
        return String.join(seq, intAsStrings);
    }

    public static int occurences(int[] values, int matching) {
        return (int)IntStream.of(values).filter(value -> matching == value).count();
    }

    public static int sum(int[] values) {
        return IntStream.of(values).sum();
    }
}
