package test.java;

import string.E28_FindTheIndexOfTheFirstOccurrenceInAString.FindTheIndexOfTheFirstOccurrenceInAString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    private final FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void testStrStr_basicCases() {
        assertEquals(0, solver.strStr("sadbutsad", "sad"));
        assertEquals(-1, solver.strStr("leetcode", "leeto"));
        assertEquals(4, solver.strStr("mississippi", "issip"));
    }

    @Test
    void testStrStr_emptyNeedle() {
        assertEquals(0, solver.strStr("abc", ""));
    }

    @Test
    void testStrStr_noOccurrence() {
        assertEquals(-1, solver.strStr("hello", "xyz"));
    }
}
