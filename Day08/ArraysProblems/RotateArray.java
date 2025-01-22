/*
 * Write a function to rotate an array of n integers to the right by k steps.


Example:
Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3  
Output: [5, 6, 7, 1, 2, 3, 4]
Explanation: Rotate the array to the right by 3 steps.

 */

package Day08.ArraysProblems;

import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(nums, k);
        System.out.println("The Rotated Array by " + k + " steps is: " + Arrays.toString(nums));
    }

}
