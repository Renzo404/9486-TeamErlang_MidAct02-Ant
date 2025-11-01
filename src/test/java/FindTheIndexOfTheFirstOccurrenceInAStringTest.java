import DelaCruz_Mabalot.E28_FindTheIndexOfTheFirstOccurrenceInAString.FindTheIndexOfTheFirstOccurrenceInAString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void testStrStr_basicCases() {
        FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();

        assertEquals(0, solver.strStr("sadbutsad", "sad"));
        assertEquals(-1, solver.strStr("leetcode", "leeto"));
        assertEquals(4, solver.strStr("mississippi", "issip"));
    }

    @Test
    void testStrStr_emptyNeedle() {
        FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(0, solver.strStr("abc", ""));
    }

    @Test
    void testStrStr_noOccurrence() {
        FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(-1, solver.strStr("hello", "xyz"));
    }
}
