package test.java;

import Aquino_Barrera.M2401_LongestNiceSubarray.LongestNiceSubarray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestNiceSubarrayTest {
    private final LongestNiceSubarray solver = new LongestNiceSubarray();

    @Test
    void testLongestNiceSubarray_basicCases() {
        assertEquals(3, solver.longestNiceSubarray(new int[]{1, 3, 8, 48, 10}));
        assertEquals(1, solver.longestNiceSubarray(new int[]{3, 1, 5, 11, 13}));
    }

    @Test
    void testLongestNiceSubarray_singleElement() {
        assertEquals(1, solver.longestNiceSubarray(new int[]{7}));
    }

    @Test
    void testLongestNiceSubarray_largeCase() {
        assertEquals(2, solver.longestNiceSubarray(new int[]{8, 1, 2}));
    }

    @Test
    void testLongestNiceSubarray_allZeros() {
        assertEquals(5, solver.longestNiceSubarray(new int[]{0, 0, 0, 0, 0}));
    }
}
