// Create a program to calculate the sum of all elements in an array.

package Day3.Arrays.SingleDimensionalArray;

import java.util.Arrays;

public class SumOfEelements {
    static public long sumOfElements(int[] arr) {
        int sum = 0;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
            sum += arr[j--];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        long sum = sumOfElements(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of all elements: " + sum);
    }
}
