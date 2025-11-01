import DelaCruz_Mabalot.H4_MedianOfTwoSortedArrays.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    void testFindMedianSortedArrays_basicCases() {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();

        assertEquals(2.0, solver.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, solver.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void testFindMedianSortedArrays_oneEmptyArray() {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();

        assertEquals(2.0, solver.findMedianSortedArrays(new int[]{}, new int[]{2}));
        assertEquals(3.0, solver.findMedianSortedArrays(new int[]{3}, new int[]{}));
    }

    @Test
    void testFindMedianSortedArrays_differentSizes() {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();

        assertEquals(3.0, solver.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}));
        assertEquals(4.5, solver.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 8, 9}));
    }
}
