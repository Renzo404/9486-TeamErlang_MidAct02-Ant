package string.M3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring in the input string without any repeating characters. This uses the
     * sliding window technique to achieve O(N) time complexity.
     *
     * @param s The input string from which to find the longest non-repeating substring.
     * @return The length of the longest substring without character repetition.
     * @author Dela Cruz, Angelika
     * @author Mabalot, Rod Clarenz
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}