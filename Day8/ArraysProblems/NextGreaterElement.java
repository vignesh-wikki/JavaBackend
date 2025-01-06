package Day8.ArraysProblems;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] findGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean isHasGreater = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    result[i] = nums[j];
                    isHasGreater = true;
                    break;
                }
            }
            if (!isHasGreater) {
                result[i] = -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 2, 10 };
        int[] result = findGreaterElement(nums);
        System.out.println("The input Array is: " + Arrays.toString(nums));
        System.out.println("The next Greater Element is: " + Arrays.toString(result));
    }
}
