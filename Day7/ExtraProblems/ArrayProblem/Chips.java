/*
 * We have n chips, where the position of the ith chip is position[i].
We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.
Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.

 */

package Day7.ExtraProblems.ArrayProblem;

public class Chips {
    public static int findMinCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < position.length; i++) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int[] position = { 1, 2, 3 };
        int minCost = findMinCostToMoveChips(position);
        System.out.println("Minimum cost is: " + minCost);
    }

}
