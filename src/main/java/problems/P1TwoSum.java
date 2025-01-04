package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers such
 * that they add up to `target`.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <a href="https://leetcode.com/problems/two-sum/description/">leetcode link</a>
 */
public class P1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // >= O(n)
        // O(1)
        // [2, 7, 11, 15], 9
        Map<Integer, Integer> elementToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // i = 1
            int secondAdditionPart = target - nums[i]; // nums[1] = 7
            // secondAdditionPart = 9 - 7 = 2

            if (elementToIndex.containsKey(secondAdditionPart)) {
                return new int[]{elementToIndex.get(secondAdditionPart), i};
            }

            elementToIndex.put(nums[i], i);
            // {2: 0}
        }

        return new int[]{-1, -1};
    }
}