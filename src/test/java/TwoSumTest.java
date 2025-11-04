package test.java;

import Abluyon_Kimpay.E1_TwoSum.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testAnotherCase() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testWithDuplicates() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] expected = {};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testWithZero() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] expected = {0, 3};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}