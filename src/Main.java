// Import all the solution classes from their respective sub-packages
import DelaCruz_Mabalot.E14_LongestCommonPrefix.LongestCommonPrefix;
import DelaCruz_Mabalot.E26_RemoveDuplicatesFromSortedArray.RemoveDuplicatesFromSortedArray;
import DelaCruz_Mabalot.E28_FindTheIndexOfTheFirstOccurrenceInAString.FindTheIndexOfTheFirstOccurrenceInAString;
import DelaCruz_Mabalot.H4_MedianOfTwoSortedArrays.MedianOfTwoSortedArrays;
import DelaCruz_Mabalot.M2_AddTwoNumbers.AddTwoNumbers;
import DelaCruz_Mabalot.M3_LongestSubstringWithoutRepeatingCharacters.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

/**
 * Main application class to demonstrate the team's LeetCode solutions for ITCS 311L.
 * This class sequentially runs and prints the output for each solution.
 * It serves as the designated main file for the Ant build script's 'run' target.
 */
public class Main {
    public static void main(String[] args) {
        // Instantiate all the solver classes
        LongestCommonPrefix solver14 = new LongestCommonPrefix();
        RemoveDuplicatesFromSortedArray solver26 = new RemoveDuplicatesFromSortedArray();
        FindTheIndexOfTheFirstOccurrenceInAString solver28 = new FindTheIndexOfTheFirstOccurrenceInAString();
        MedianOfTwoSortedArrays solverH4 = new MedianOfTwoSortedArrays();
        AddTwoNumbers solverM2 = new AddTwoNumbers();
        LongestSubstringWithoutRepeatingCharacters solverM3 = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println("\n=======================================================");
        System.out.println("  ITCS 311L - LeetCode Solutions Demonstrator");
        System.out.println("=======================================================\n");

        System.out.println("---[ Running: E14 - Longest Common Prefix ]----------");
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Input: " + Arrays.toString(strs));
        String prefix = solver14.longestCommonPrefix(strs);
        System.out.println("Output (Prefix): \"" + prefix + "\"\n");

        System.out.println("---[ Running: E26 - Remove Duplicates ]--------------");
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Input: " + Arrays.toString(nums));
        int k = solver26.removeDuplicates(nums);
        System.out.println("Output (k): " + k);
        System.out.println("Modified Array (first k elements): " + Arrays.toString(Arrays.copyOf(nums, k)) + "\n");

        System.out.println("---[ Running: E28 - Find First Occurrence ]----------");
        String haystack = "sadbutsad", needle = "sad";
        System.out.println("Haystack: \"" + haystack + "\", Needle: \"" + needle + "\"");
        int index = solver28.strStr(haystack, needle);
        System.out.println("Output (Index): " + index + "\n");

        System.out.println("---[ Running: H4 - Median of Two Sorted Arrays ]-----");
        int[] nums1 = {1, 3}, nums2 = {2, 4};
        System.out.println("Input nums1: " + Arrays.toString(nums1));
        System.out.println("Input nums2: " + Arrays.toString(nums2));
        double median = solverH4.findMedianSortedArrays(nums1, nums2);
        System.out.println("Output (Median): " + median + "\n");

        System.out.println("---[ Running: M2 - Add Two Numbers ]-----------------");
        // Assuming helper methods in AddTwoNumbers (createList, listToString) are public static
        int[] numArr1 = {2, 4, 3};
        int[] numArr2 = {5, 6, 4};
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(numArr1);
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(numArr2);
        System.out.println("Input l1: " + AddTwoNumbers.listToString(l1) + " (Represents 342)");
        System.out.println("Input l2: " + AddTwoNumbers.listToString(l2) + " (Represents 465)");
        AddTwoNumbers.ListNode resultNode = solverM2.addTwoNumbers(l1, l2);
        System.out.println("Output (Sum): " + AddTwoNumbers.listToString(resultNode) + " (Represents 807)\n");

        System.out.println("---[ Running: M3 - Longest Substring ]---------------");
        String s = "abcabcbb";
        System.out.println("Input: \"" + s + "\"");
        int length = solverM3.lengthOfLongestSubstring(s);
        System.out.println("Output (Length): " + length + "\n");

        System.out.println("=======================================================");
        System.out.println("                  All tests complete.");
        System.out.println("=======================================================");
    }
}