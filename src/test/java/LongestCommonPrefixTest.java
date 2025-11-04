package test.java;
import string.E14_LongestCommonPrefix.LongestCommonPrefix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix solver = new LongestCommonPrefix();
    @Test
    void testCommonPrefixNormalCase() {
        String[] input = {"flower", "flow", "flight"};
        assertEquals("fl", solver.longestCommonPrefix(input));
    }

    @Test
    void testNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        assertEquals("", solver.longestCommonPrefix(input));
    }

    @Test
    void testAllSameStrings() {
        String[] input = {"test", "test", "test"};
        assertEquals("test", solver.longestCommonPrefix(input));
    }

    @Test
    void testSingleString() {
        String[] input = {"alone"};
        assertEquals("alone", solver.longestCommonPrefix(input));
    }

    @Test
    void testEmptyArray() {
        String[] input = {};
        assertEquals("", solver.longestCommonPrefix(input));
    }

    @Test
    void testWithEmptyStringIncluded() {
        String[] input = {"", "abc", "ab"};
        assertEquals("", solver.longestCommonPrefix(input));
    }

    @Test
    void testPartialMatch() {
        String[] input = {"interspecies", "interstellar", "interstate"};
        assertEquals("inters", solver.longestCommonPrefix(input));
    }

    @Test
    void testCaseSensitivity() {
        String[] input = {"Case", "casing", "castle"};
        assertEquals("", solver.longestCommonPrefix(input));
    }

    @Test
    void testNullArray() {
        assertEquals("", solver.longestCommonPrefix(null));
    }
}
