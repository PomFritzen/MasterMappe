package Lektion7.Test;

import Lektion7.ArrayUtilsPapa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrayUtilsPapa {
    @Test
    public void arrayToString_Should_provide_space_delimited_string() {
        int[] inputvalues = {1,2,3,4};
        Assertions.assertEquals("1 2 3 4", ArrayUtilsPapa.arrayToString(inputvalues));
    }

    @Test
    public void occurences_Should_count_number_of_occurences_in_list() {
        int[] inputvalues = {1,2,2,2,3};
        Assertions.assertEquals(3, ArrayUtilsPapa.occurences(inputvalues, 2));
    }

    @Test
    public void sum_Should_sum_values_from_input() {
        int[] inputvalues = {1,2,3};
        Assertions.assertEquals(6, ArrayUtilsPapa.sum(inputvalues));
    }
}
