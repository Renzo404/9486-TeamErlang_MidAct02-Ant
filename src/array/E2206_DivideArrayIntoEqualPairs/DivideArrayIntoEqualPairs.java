package array.E2206_DivideArrayIntoEqualPairs;

/**
     * Determines whether a given integer {@code n} is a power of three.
     *
     * @param n the integer to check
     * @return {@code true} if {@code n} is a power of three, otherwise {@code false}
     */

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {

    /**
     * Entry point for manual testing.
     * <p>Builds a frequency map and checks if every element count is even.</p>
     *
     * @param args command-line arguments (not used)
     */

    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // Optional manual test
    public static void main(String[] args) {
        DivideArrayIntoEqualPairs solver = new DivideArrayIntoEqualPairs();
        int[] nums = {3, 2, 3, 2, 2, 2};
        System.out.println(solver.divideArray(nums)); // true
    }
}
