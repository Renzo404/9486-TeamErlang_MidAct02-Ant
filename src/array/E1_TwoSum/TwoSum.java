package array.E1_TwoSum;

import java.util.HashMap;

/**
 * Solves LeetCode problem 1: Two Sum.
 * <p>
 * Given an array of integers {@code nums} and an integer {@code target},
 * returns indices of the two numbers such that they add up to {@code target}.
 * Assumes that each input has exactly one solution and the same element
 * may not be used twice.
 * * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem 1</a>
 */
public class TwoSum {

    /**
     * Finds two numbers in the array that add up to the target value.
     * <p>
     * This method uses a single-pass HashMap to achieve O(n) time complexity.
     * It iterates through the array, calculating the "complement" needed to
     * reach the target. If the complement is already in the map, it means
     * a solution has been found, and it returns the indices. Otherwise,
     * it adds the current number and its index to the map.
     *
     * @param nums   An array of integers.
     * @param target The target sum to find.
     * @return An array of two integers representing the indices of the
     * two numbers that sum up to the target. Returns an empty
     * array if no solution is found.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}