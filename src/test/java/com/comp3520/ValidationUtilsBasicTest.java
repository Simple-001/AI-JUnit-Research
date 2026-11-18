
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsBasicTest {

    private final ValidationUtils utils = new ValidationUtils();

    @Test
    void validAgeNormal() {
        assertTrue(utils.isValidAge(25));
    }

    @Test
    void validAgeMinimumBoundary() {
        assertTrue(utils.isValidAge(18));
    }

    @Test
    void validAgeMaximumBoundary() {
        assertTrue(utils.isValidAge(120));
    }

    @Test
    void invalidAgeBelowMinimum() {
        assertFalse(utils.isValidAge(17));
    }

    @Test
    void invalidAgeAboveMaximum() {
        assertFalse(utils.isValidAge(121));
    }

    @Test
    void invalidNegativeAge() {
        assertFalse(utils.isValidAge(-5));
    }

    @Test
    void validEmailStandard() {
        assertTrue(utils.isValidEmail("user@example.com"));
    }

    @Test
    void validEmailWithSymbols() {
        assertTrue(utils.isValidEmail("user.name+1@example.co.uk"));
    }

    @Test
    void invalidEmailMissingAt() {
        assertFalse(utils.isValidEmail("userexample.com"));
    }

    @Test
    void invalidEmailMissingDomain() {
        assertFalse(utils.isValidEmail("user@"));
    }

    @Test
    void invalidEmailShortExtension() {
        assertFalse(utils.isValidEmail("user@example.c"));
    }

    @Test
    void invalidEmailWithSpaces() {
        assertFalse(utils.isValidEmail("user name@example.com"));
    }

    @Test
    void invalidEmailNull() {
        assertFalse(utils.isValidEmail(null));
    }

    @Test
    void invalidEmailEmpty() {
        assertFalse(utils.isValidEmail(""));
    }

    @Test
    void leapYearDivisibleByFour() {
        assertTrue(utils.isLeapYear(2024));
    }

    @Test
    void leapYearDivisibleByFourHundred() {
        assertTrue(utils.isLeapYear(2000));
    }

    @Test
    void nonLeapCenturyYear() {
        assertFalse(utils.isLeapYear(1900));
    }

    @Test
    void nonLeapNormalYear() {
        assertFalse(utils.isLeapYear(2023));
    }

    @Test
    void leapYearTwentyFourHundred() {
        assertTrue(utils.isLeapYear(2400));
    }
}
