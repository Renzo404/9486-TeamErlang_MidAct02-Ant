package test.java;

import array.E2206_DivideArrayIntoEqualPairs.DivideArrayIntoEqualPairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideArrayIntoEqualPairsTest {
    private final DivideArrayIntoEqualPairs solver = new DivideArrayIntoEqualPairs();

    @Test
    void testDivideArray_trueCases() {
        assertTrue(solver.divideArray(new int[]{3, 2, 3, 2, 2, 2}));
        assertTrue(solver.divideArray(new int[]{1, 1, 2, 2, 3, 3}));
        assertTrue(solver.divideArray(new int[]{7, 7, 8, 8}));
    }

    @Test
    void testDivideArray_falseCases() {
        assertFalse(solver.divideArray(new int[]{1, 2, 3, 4}));
        assertFalse(solver.divideArray(new int[]{3, 3, 3}));
        assertFalse(solver.divideArray(new int[]{5, 5, 5, 6}));
    }

    @Test
    void testDivideArray_edgeCases() {
        assertTrue(solver.divideArray(new int[]{}));          // empty array -> trivially true
        assertFalse(solver.divideArray(new int[]{1}));        // single element
    }
}
