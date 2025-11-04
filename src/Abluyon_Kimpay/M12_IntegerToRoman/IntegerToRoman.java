package Abluyon_Kimpay.M12_IntegerToRoman;

/**
 * Solves LeetCode problem 12: Integer to Roman.
 * <p>
 * Given an integer, converts it to a roman numeral.
 *
 * @see <a href="https://leetcode.com/problems/integer-to-roman/">LeetCode Problem 12</a>
 */
public class IntegerToRoman {
    /**
     * Converts an integer to its Roman numeral representation.
     * <p>
     * This method uses a greedy approach. It defines parallel arrays for
     * integer values and their corresponding Roman symbols, ordered from
     * largest to smallest. It iterates through the values, subtracting
     * the largest possible value from the number and appending the
     * corresponding symbol until the number becomes zero.
     *
     * @param num The integer to convert (guaranteed to be 1 to 3999).
     * @return The Roman numeral string.
     */
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }

}