package DelaCruz_Mabalot.E26_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    /**
     * Removes duplicates from a sorted integer array in place. The method uses the array's sorted property to determine
     * unique elements. The first 'k' elements of the input array will contain the unique elements.
     *
     * @param nums The input array of integers, which is assumed to be sorted.
     * @return The number of unique elements (k) in the array.
     * @author Dela Cruz, Angelika
     * @author Mabalot, Rod Clarenz
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        int largest = nums[nums.length - 1];

        for (int i = nums[0]; i <= largest; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    nums[k] = i;
                    k++;
                    break;
                }
            }
        }
        return k;
    }
}
