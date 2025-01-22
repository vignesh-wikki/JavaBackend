/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

package Day07.ExtraProblems.ArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Twosum {
    public static void main(String[] args) {
        int[] nums = { 2, 17, 7, 11, 16, 18, 10, 181, 17 };
        int target = 9;
        List<Integer> list = findIndicesOfTarget(nums, target);
        System.out.println("The indices of the target value is: " + list.toString());
    }

    private static List<Integer> findIndicesOfTarget(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        if (nums.length < 1) {
            return list;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target)
                right--;
            else if (nums[left] + nums[right] < target)
                left++;
            else if (nums[left] + nums[right] == target) {
                list.add(left);
                list.add(right);
                return list;
            }
        }

        return list;

    }

}
