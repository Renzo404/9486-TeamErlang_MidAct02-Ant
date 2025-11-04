package Aquino_Barrera.E2206_DivideArrayIntoEqualPairs;

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {

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
