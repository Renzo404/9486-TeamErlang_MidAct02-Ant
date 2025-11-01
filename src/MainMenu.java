
// Import all the solution classes from their respective sub-packages
import DelaCruz_Mabalot.E14_LongestCommonPrefix.LongestCommonPrefix;
import DelaCruz_Mabalot.E26_RemoveDuplicatesFromSortedArray.RemoveDuplicatesFromSortedArray;
import DelaCruz_Mabalot.E28_FindTheIndexOfTheFirstOccurrenceInAString.FindTheIndexOfTheFirstOccurrenceInAString;
import DelaCruz_Mabalot.H4_MedianOfTwoSortedArrays.MedianOfTwoSortedArrays;
import DelaCruz_Mabalot.M2_AddTwoNumbers.AddTwoNumbers;
import DelaCruz_Mabalot.M3_LongestSubstringWithoutRepeatingCharacters.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main application class to demonstrate the team's LeetCode solutions for ITCS 311L.
 * This class provides a command-line menu to run and test each solution individually.
 * It serves as the designated main file for the Ant build script's 'run' target.
 */
public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LongestCommonPrefix solver14 = new LongestCommonPrefix();
        RemoveDuplicatesFromSortedArray solver26 = new RemoveDuplicatesFromSortedArray();
        FindTheIndexOfTheFirstOccurrenceInAString solver28 = new FindTheIndexOfTheFirstOccurrenceInAString();
        MedianOfTwoSortedArrays solverH4 = new MedianOfTwoSortedArrays();
        AddTwoNumbers solverM2 = new AddTwoNumbers();
        LongestSubstringWithoutRepeatingCharacters solverM3 = new LongestSubstringWithoutRepeatingCharacters();

        while (true) {
            System.out.println("\n=======================================================");
            System.out.println("  ITCS 311L - LeetCode Solutions Demonstrator");
            System.out.println("=======================================================");
            System.out.println("1. E14 - Longest Common Prefix");
            System.out.println("2. E26 - Remove Duplicates from Sorted Array");
            System.out.println("3. E28 - Find the Index of the First Occurrence");
            System.out.println("4. H4  - Median of Two Sorted Arrays");
            System.out.println("5. M2  - Add Two Numbers (Linked List)");
            System.out.println("6. M3  - Longest Substring Without Repeating Chars");
            System.out.println("0. Exit");
            System.out.print("\n>>> Select a solution to run: ");

            // Defensive input reading
            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
            }

            System.out.println("-------------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("Running: Longest Common Prefix\n");
                    String[] strs = {"flower", "flow", "flight"};
                    System.out.println("Input: " + Arrays.toString(strs));
                    String prefix = solver14.longestCommonPrefix(strs);
                    System.out.println("Output (Prefix): \"" + prefix + "\"");
                    break;

                case 2:
                    System.out.println("Running: Remove Duplicates from Sorted Array\n");
                    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
                    System.out.println("Input: " + Arrays.toString(nums));
                    int k = solver26.removeDuplicates(nums);
                    System.out.println("Output (k): " + k);
                    System.out.println("Modified Array (first k elements): " + Arrays.toString(Arrays.copyOf(nums, k)));
                    break;

                case 3:
                    System.out.println("Running: Find the Index of the First Occurrence\n");
                    String haystack = "sadbutsad", needle = "sad";
                    System.out.println("Haystack: \"" + haystack + "\", Needle: \"" + needle + "\"");
                    int index = solver28.strStr(haystack, needle);
                    System.out.println("Output (Index): " + index);
                    break;

                case 4:
                    System.out.println("Running: Median of Two Sorted Arrays\n");
                    int[] nums1 = {1, 3}, nums2 = {2, 4};
                    System.out.println("Input nums1: " + Arrays.toString(nums1));
                    System.out.println("Input nums2: " + Arrays.toString(nums2));
                    double median = solverH4.findMedianSortedArrays(nums1, nums2);
                    System.out.println("Output (Median): " + median);
                    break;

                case 5:
                    System.out.println("Running: Add Two Numbers (Linked List)\n");
                    // Assuming you made the helper methods in AddTwoNumbers public static
                    int[] numArr1 = {2, 4, 3};
                    int[] numArr2 = {5, 6, 4};
                    AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(numArr1);
                    AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(numArr2);
                    System.out.println("Input l1: " + AddTwoNumbers.listToString(l1) + " (Represents 342)");
                    System.out.println("Input l2: " + AddTwoNumbers.listToString(l2) + " (Represents 465)");
                    AddTwoNumbers.ListNode resultNode = solverM2.addTwoNumbers(l1, l2);
                    System.out.println("Output (Sum): " + AddTwoNumbers.listToString(resultNode) + " (Represents 807)");
                    break;

                case 6:
                    System.out.println("Running: Longest Substring Without Repeating Characters\n");
                    String s = "abcabcbb";
                    System.out.println("Input: \"" + s + "\"");
                    int length = solverM3.lengthOfLongestSubstring(s);
                    System.out.println("Output (Length): " + length);
                    break;

                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    return; // Exit the main method

                default:
                    System.out.println("Invalid choice. Please enter a number from 0 to 6.");
            }
            System.out.println("-------------------------------------------------------");
        }
    }
}