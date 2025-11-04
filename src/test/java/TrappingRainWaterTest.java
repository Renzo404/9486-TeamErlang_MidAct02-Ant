package test.java;
import array.H42_TrappingRainWater.TrappingRainWater;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TrappingRainWaterTest {
     private final TrappingRainWater solver = new TrappingRainWater();

    @Test
    void testTrappingRainWater_basicCase() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    void testTrappingRainWater_flatGround() {
        int[] height = {0,0,0,0,0};
        int expected = 0;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    void testTrappingRainWater_increasingBars() {
        int[] height = {1,2,3,4,5};
        int expected = 0;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    void testTrappingRainWater_decreasingBars() {
        int[] height = {5,4,3,2,1};
        int expected = 0;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    void testTrappingRainWater_valleyShape() {
        int[] height = {3,0,2,0,4};
        int expected = 7;
        assertEquals(expected, solver.trap(height));
    }
    
}
