package test.java;

import Aquino_Barrera.E27_RemoveElement.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    private final RemoveElement solver = new RemoveElement();

    @Test
    void testRemoveElement_basicCase() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = solver.removeElement(nums, val);
        assertEquals(2, result);
        assertArrayEquals(new int[]{2, 2}, java.util.Arrays.copyOf(nums, result));
    }

    @Test
    void testRemoveElement_noOccurrences() {
        int[] nums = {1, 2, 3};
        int val = 4;
        int result = solver.removeElement(nums, val);
        assertEquals(3, result);
        assertArrayEquals(new int[]{1, 2, 3}, java.util.Arrays.copyOf(nums, result));
    }

    @Test
    void testRemoveElement_allRemoved() {
        int[] nums = {2, 2, 2};
        int val = 2;
        int result = solver.removeElement(nums, val);
        assertEquals(0, result);
    }
}
