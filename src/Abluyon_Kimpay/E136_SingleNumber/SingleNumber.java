package Abluyon_Kimpay.E136_SingleNumber;

/**
 * Solves LeetCode problem 136: Single Number.
 * <p>
 * Given a non-empty array of integers {@code nums}, every element appears
 * twice except for one. Finds that single one.
 *
 * @see <a href="https://leetcode.com/problems/single-number/">LeetCode Problem 136</a>
 */
public class SingleNumber {

    /**
     * Finds the single element in an array that does not appear twice.
     * <p>
     * This method uses the Bitwise XOR (^) operator. The XOR operator
     * has two key properties:
     * 1. A number XORed with itself is 0 (e.g., {@code a ^ a = 0}).
     * 2. A number XORed with 0 is itself (e.g., {@code a ^ 0 = a}).
     * <p>
     * By XORing all numbers in the array, all the pairs cancel
     * each other out (become 0), leaving only the single, unpaired number.
     *
     * @param nums An array where every element appears twice, except for one.
     * @return The single, unpaired element.
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}