package Day13.JunitPrograms;

import java.util.Arrays;

public class Array {
    public int[] sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        Arrays.sort(array);
        return array;
    }
}
