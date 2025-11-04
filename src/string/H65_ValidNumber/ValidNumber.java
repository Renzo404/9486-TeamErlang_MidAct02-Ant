package string.H65_ValidNumber;

public class ValidNumber {
    /**
     * Checks if a string represents a valid number.
     * <p>
     * This method uses a set of boolean flags to track the components
     * of a valid number (digit, dot, exponent, sign) as it iterates
     * through the string. It enforces rules such as:
     * <ul>
     * <li>A dot or exponent cannot appear twice.</li>
     * <li>An exponent 'e'/'E' must be preceded by a digit.</li>
     * <li>A sign '+'/'–' must be at the start or immediately after 'e'/'E'.</li>
     * <li>A dot cannot appear after 'e'/'E'.</li>
     * <li>The final string must contain at least one digit (which can be
     * before or after the 'e'/'E').</li>
     * </ul>
     *
     * @param s The string to validate.
     * @return {@code true} if the string is a valid number, {@code false} otherwise.
     */
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) return false;

        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExp = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                seenDigit = true;
            }
            else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else if (c == '.') {
                if (seenDot || seenExp) {
                    return false;
                }
                seenDot = true;
            }
            else if (c == 'e' || c == 'E') {
                if (seenExp || !seenDigit) {
                    return false;
                }
                seenExp = true;
                seenDigit = false;
            }
            else {
                return false;
            }
        }

        return seenDigit;
    }
}

