package array.M2401_LongestNiceSubarray;

/**
 * <h1>Longest Nice Subarray</h1>
 * The {@code LongestNiceSubarray} class finds the length of the longest
 * contiguous subarray such that the bitwise AND of every pair of elements is 0.
 * <p>
 * This solution uses a sliding window approach and is based on LeetCode problem #2401.
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input: nums = [1,3,8,48,10]
 * Output: 3
 * Explanation: The longest nice subarray is [3,8,48].
 * </pre>
 *
 * @author Aquino
 * @version 1.0
 */

public class LongestNiceSubarray {

     /**
     * Finds the length of the longest nice subarray.
     *
     * @param nums the input integer array
     * @return the maximum length of a nice subarray
     */
    public int longestNiceSubarray(int[] nums) {
        int left = 0, used = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((used & nums[right]) != 0) {
                used ^= nums[left++];
            }
            used |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // Optional manual test
    public static void main(String[] args) {
        LongestNiceSubarray solver = new LongestNiceSubarray();
        System.out.println(solver.longestNiceSubarray(new int[]{1, 3, 8, 48, 10})); // 3
        System.out.println(solver.longestNiceSubarray(new int[]{3, 1, 5, 11, 13})); // 1
    }
}
