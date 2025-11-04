package test.java;

import Abluyon_Kimpay.H65_ValidNumber.ValidNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidNumberTest {

    private ValidNumber validNumber;

    @BeforeEach
    public void setUp() {
        validNumber = new ValidNumber();
    }

    // Valid number tests
    @Test
    public void testValidInteger() {
        assertTrue(validNumber.isNumber("0"));
        assertTrue(validNumber.isNumber("2"));
    }

    @Test
    public void testValidDecimal() {
        assertTrue(validNumber.isNumber("0.1"));
        assertTrue(validNumber.isNumber("2.5"));
    }

    @Test
    public void testValidSigned() {
        assertTrue(validNumber.isNumber("+100"));
        assertTrue(validNumber.isNumber("-10"));
    }

    @Test
    public void testValidSignedDecimal() {
        assertTrue(validNumber.isNumber("-0.5"));
        assertTrue(validNumber.isNumber("+3.14"));
    }

    @Test
    public void testValidExponent() {
        assertTrue(validNumber.isNumber("2e10"));
        assertTrue(validNumber.isNumber("3E+7"));
        assertTrue(validNumber.isNumber("4E-1"));
    }

    @Test
    public void testValidExponentDecimal() {
        assertTrue(validNumber.isNumber("5.2e3"));
        assertTrue(validNumber.isNumber("-90.E-3"));
    }

    @Test
    public void testValidDotCases() {
        assertTrue(validNumber.isNumber(".1")); // ".1" is valid
        assertTrue(validNumber.isNumber("2.")); // "2." is valid
        assertTrue(validNumber.isNumber("+.5")); // "+.5" is valid
    }

    // Invalid number tests
    @Test
    public void testInvalidEmptyOrWhitespace() {
        assertFalse(validNumber.isNumber(""));
        assertFalse(validNumber.isNumber(" "));
    }

    @Test
    public void testInvalidCharacters() {
        assertFalse(validNumber.isNumber("abc"));
        assertFalse(validNumber.isNumber("1a"));
        assertFalse(validNumber.isNumber("95a54e+3"));
    }

    @Test
    public void testInvalidSignPlacement() {
        assertFalse(validNumber.isNumber("++6"));
        assertFalse(validNumber.isNumber("-+3"));
        assertFalse(validNumber.isNumber("1+1"));
        assertFalse(validNumber.isNumber("5e+9.1")); // Sign only at start or after 'e'
    }

    @Test
    public void testInvalidMultipleDots() {
        assertFalse(validNumber.isNumber("1.2.3"));
        assertFalse(validNumber.isNumber(".."));
    }

    @Test
    public void testInvalidMultipleExponents() {
        assertFalse(validNumber.isNumber("1e2e3"));
    }

    @Test
    public void testInvalidExponentAlone() {
        assertFalse(validNumber.isNumber("e3")); // No digit before 'e'
        assertFalse(validNumber.isNumber("1e"));  // No digit after 'e'
    }

    @Test
    public void testInvalidDotAfterExponent() {
        assertFalse(validNumber.isNumber("6e-1.0"));
    }

    @Test
    public void testInvalidJustDot() {
        assertFalse(validNumber.isNumber("."));
    }

    @Test
    public void testInvalidJustSign() {
        assertFalse(validNumber.isNumber("+"));
        assertFalse(validNumber.isNumber("-"));
    }
}