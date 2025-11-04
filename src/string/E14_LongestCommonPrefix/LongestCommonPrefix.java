package string.E14_LongestCommonPrefix;
/**
 * Solves LeetCode problem 14: Longest Common Prefix.
 * <p>
 * Finds the longest common prefix string among an array of strings using
 * a horizontal scanning approach.
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">LeetCode Problem 14</a>
 * @author Dela Cruz, Angelika
 * @author Mabalot, Rod Clarenz
 */
public class LongestCommonPrefix {
    /**
     * Finds the longest common prefix string amongst an array of strings. The method uses a horizontal scanning
     * approach: it starts with the first string as the prefix and iteratively shortens it until it matches the start
     * of every subsequent string.
     *
     * @param strs The input array of strings.
     * @return The longest common prefix string. Returns an empty string ("")
     * if there is no common prefix or the input array is empty.
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}