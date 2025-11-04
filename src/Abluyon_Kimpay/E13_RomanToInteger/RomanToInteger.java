package Abluyon_Kimpay.E13_RomanToInteger;

import java.util.HashMap;

/**
 * Solves LeetCode problem 13: Roman to Integer.
 * <p>
 * Given a roman numeral, converts it to an integer.
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">LeetCode Problem 13</a>
 */
public class RomanToInteger {

    /**
     * Converts a string representation of a Roman numeral to its integer value.
     * <p>
     * This method iterates through the string, checking for subtractive pairs
     * (like "IV" or "CM"). If the current numeral's value is less than the
     * next one, it's a subtractive case, so we subtract its value. Otherwise,
     * we add its value.
     *
     * @param s The Roman numeral string (e.g., "MCMXCIV").
     * @return The integer representation of the Roman numeral (e.g., 1994).
     */
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextValue = romanMap.get(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    total -= currentValue;
                }
                else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }

        return total;
    }
}

