// Write a program to find the largest and smallest numbers in an array.

package Day3.Arrays.SingleDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargeAndSmallNumber {

    static List<Integer> getLargerAndSmallerNumber(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            else
                min = arr[i];
        }
        numbers.add(max);
        numbers.add(min);
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = getLargerAndSmallerNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest number: " + list.get(0));
        System.out.println("Smallest number: " + list.get(1));
    }
}
