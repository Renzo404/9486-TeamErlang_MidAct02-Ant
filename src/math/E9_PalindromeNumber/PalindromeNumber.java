package math.E9_PalindromeNumber;

/**
 * Solves LeetCode problem 9: Palindrome Number.
 * <p>
 * Given an integer {@code x}, returns {@code true} if {@code x} is a palindrome,
 * and {@code false} otherwise.
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/">LeetCode Problem 9</a>
 */
public class PalindromeNumber {

    /**
     * Checks if an integer is a palindrome without converting it to a string.
     * <p>
     * A number is a palindrome if it reads the same backward as forward.
     * This method works by reversing the second half of the number and
     * comparing it to the first half.
     *
     * @param x The integer to check.
     * @return {@code true} if the integer is a palindrome, {@code false} otherwise.
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return (x == reversedHalf || x == reversedHalf / 10);
    }
}