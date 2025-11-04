package test.java;

import Abluyon_Kimpay.M12_IntegerToRoman.IntegerToRoman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {

    private IntegerToRoman.Solution solution;

    @BeforeEach
    public void setUp() {
        // We need to instantiate the outer class to create an instance of the inner Solution class
        IntegerToRoman outerInstance = new IntegerToRoman();
        solution = outerInstance.new Solution();
    }

    @Test
    public void testSimpleNumber() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    public void testSubtractiveCase4() {
        assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    public void testSubtractiveCase9() {
        assertEquals("IX", solution.intToRoman(9));
    }

    @Test
    public void testLargerNumber() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    public void testComplexSubtractive() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    public void testLargestPossible() {
        // Assuming the problem constraint is 1 to 3999
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }

    @Test
    public void testMidNumber() {
        assertEquals("CDLVI", solution.intToRoman(456));
    }
}