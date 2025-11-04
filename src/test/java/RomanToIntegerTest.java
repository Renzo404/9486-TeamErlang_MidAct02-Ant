package test.java;

import Abluyon_Kimpay.E13_RomanToInteger.RomanToInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void testSimpleNumber() {
        // III = 1 + 1 + 1 = 3
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void testSubtractiveCaseIV() {
        // IV = 5 - 1 = 4
        assertEquals(4, romanToInteger.romanToInt("IV"));
    }

    @Test
    public void testSubtractiveCaseIX() {
        // IX = 10 - 1 = 9
        assertEquals(9, romanToInteger.romanToInt("IX"));
    }

    @Test
    public void testLargerNumber() {
        // LVIII = 50 + 5 + 1 + 1 + 1 = 58
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void testComplexSubtractiveCase() {
        // MCMXCIV = 1000 + (1000 - 100) + (100 - 10) + (5 - 1)
        // M = 1000
        // CM = 900
        // XC = 90
        // IV = 4
        // Total = 1994
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void testAllSubtractiveCases() {
        assertEquals(40, romanToInteger.romanToInt("XL"));
        assertEquals(90, romanToInteger.romanToInt("XC"));
        assertEquals(400, romanToInteger.romanToInt("CD"));
        assertEquals(900, romanToInteger.romanToInt("CM"));
    }

    @Test
    public void testSingleLargestSymbol() {
        assertEquals(1000, romanToInteger.romanToInt("M"));
    }

    @Test
    public void testLargestPossibleNumber() {
        // MMMCMXCIX = 1000 + 1000 + 1000 + 900 + 90 + 9
        assertEquals(3999, romanToInteger.romanToInt("MMMCMXCIX"));
    }
}