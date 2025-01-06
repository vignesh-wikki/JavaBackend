/*
 * Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
Example:
Input: nums = [3, 0, 1]  
Output: 2  
Explanation: The missing number is 2 because it is not in the array.
 */

package Day8.ArraysProblems;

public class DistinctElement {

    public static int findDistinctElement(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        System.out.println(sum);
        System.out.println(sum1);
        return sum - sum1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 6, 7, 8 };
        System.out.println("Distinct elements is: " + findDistinctElement(nums));
    }
}
