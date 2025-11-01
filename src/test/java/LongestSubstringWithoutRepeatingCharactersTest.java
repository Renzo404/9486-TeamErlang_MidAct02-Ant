import DelaCruz_Mabalot.M3_LongestSubstringWithoutRepeatingCharacters.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testLengthOfLongestSubstring_basicCases() {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(3, solver.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solver.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solver.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testLengthOfLongestSubstring_emptyAndSingleChar() {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(0, solver.lengthOfLongestSubstring(""));
        assertEquals(1, solver.lengthOfLongestSubstring("a"));
    }

    @Test
    void testLengthOfLongestSubstring_allUnique() {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(5, solver.lengthOfLongestSubstring("abcde"));
    }
}
