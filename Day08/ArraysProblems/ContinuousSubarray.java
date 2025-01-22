/*
 * Given an array of integers, find the largest sum of a contiguous subarray. Implement an efficient algorithm to solve this problem.

Example:
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]  
Output: 6  
Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.

 */

package Day08.ArraysProblems;

public class ContinuousSubarray {
    public static int getSubarraySum(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0)
                sum = 0;
            else
                max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("The Continuous Subarray Sum is: " + getSubarraySum(nums));
    }
}
