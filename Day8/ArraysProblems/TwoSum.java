package Day8.ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
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
