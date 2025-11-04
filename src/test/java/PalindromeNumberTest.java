package test.java;

import math.E9_PalindromeNumber.PalindromeNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void testPositivePalindrome() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(palindromeNumber.isPalindrome(123));
    }

    @Test
    public void testNumberEndingInZero() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    public void testZero() {
        assertTrue(palindromeNumber.isPalindrome(0));
    }

    @Test
    public void testLargePalindrome() {
        assertTrue(palindromeNumber.isPalindrome(123454321));
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertTrue(palindromeNumber.isPalindrome(1221));
    }
}