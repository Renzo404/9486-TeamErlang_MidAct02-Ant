package Aquino_Barrera.M2401_LongestNiceSubarray;

public class LongestNiceSubarray {
     public static void main(String[] args) {
        int[] nums = {1, 3, 8, 48, 10};
        int maxLen = 0;

        int left = 0;
        int usedBits = 0;

        for (int right = 0; right < nums.length; right++) {
            // If current number shares bits with usedBits, move left pointer
            while ((usedBits & nums[right]) != 0) {
                usedBits ^= nums[left]; // remove left element bits
                left++;
            }

            // Add current number bits
            usedBits |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}
