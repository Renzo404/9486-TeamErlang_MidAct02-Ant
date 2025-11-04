package test.java;

import math.E326_PowerOfThree.PowerOfThree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    private final PowerOfThree solver = new PowerOfThree();

    @Test
    void testIsPowerOfThree_trueCases() {
        assertTrue(solver.isPowerOfThree(27));
    }

    @Test
    void testIsPowerOfThree_falseCases() {
        assertFalse(solver.isPowerOfThree(45));
    }
}
