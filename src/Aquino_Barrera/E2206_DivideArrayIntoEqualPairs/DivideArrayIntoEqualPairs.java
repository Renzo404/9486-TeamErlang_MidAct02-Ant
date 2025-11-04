package Aquino_Barrera.E2206_DivideArrayIntoEqualPairs;

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {
      public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        boolean canDivide = true;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count % 2 != 0) {
                canDivide = false;
                break;
            }
        }

        System.out.println(canDivide);
    }
    
}
