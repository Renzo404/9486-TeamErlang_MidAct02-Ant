import DelaCruz_Mabalot.E26_RemoveDuplicatesFromSortedArray.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testRemoveDuplicates_basicCases() {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();

        assertEquals(2, solver.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, solver.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(0, solver.removeDuplicates(new int[]{}));
    }

    @Test
    void testRemoveDuplicates_allUnique() {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        assertEquals(5, solver.removeDuplicates(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testRemoveDuplicates_allSame() {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        assertEquals(1, solver.removeDuplicates(new int[]{7, 7, 7, 7, 7}));
    }
}
