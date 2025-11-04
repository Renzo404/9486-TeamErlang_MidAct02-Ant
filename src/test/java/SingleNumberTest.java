package test.java;

import array.E136_SingleNumber.SingleNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    private SingleNumber singleNumber;

    @BeforeEach
    public void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void testBasicCase() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    public void testLongerCase() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums = {-1, -2, -1, -3, -2};
        assertEquals(-3, singleNumber.singleNumber(nums));
    }

    @Test
    public void testWithZero() {
        int[] nums = {0, 1, 1, 2, 2};
        assertEquals(0, singleNumber.singleNumber(nums));
    }
}