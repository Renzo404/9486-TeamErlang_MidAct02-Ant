package string.E28_FindTheIndexOfTheFirstOccurrenceInAString;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * Finds the index of the first occurrence of the `needle` string within the `haystack` string. This implementation
     * uses a simple sliding window and substring comparison.
     *
     * @param haystack The string to be searched within.
     * @param needle The substring to search for.
     * @return The starting index of the first occurrence of `needle` in `haystack`,
     * or -1 if `needle` is not part of `haystack`. Returns 0 if `needle` is empty.
     * @author Dela Cruz, Angelika
     * @author Mabalot, Rod Clarenz
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
