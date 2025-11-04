package array.M2401_LongestNiceSubarray;

public class LongestNiceSubarray {

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
