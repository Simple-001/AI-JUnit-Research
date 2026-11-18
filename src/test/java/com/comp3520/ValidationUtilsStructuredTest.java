
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsStructuredTest {

    private final ValidationUtils utils = new ValidationUtils();

    // isValidAge(int age)

    @Test
    void ageMinimumValidBoundary() {
        assertTrue(utils.isValidAge(18));
    }

    @Test
    void ageImmediatelyBelowMinimum() {
        assertFalse(utils.isValidAge(17));
    }

    @Test
    void ageImmediatelyAboveMinimum() {
        assertTrue(utils.isValidAge(19));
    }

    @Test
    void ageMaximumValidBoundary() {
        assertTrue(utils.isValidAge(120));
    }

    @Test
    void ageImmediatelyBelowMaximum() {
        assertTrue(utils.isValidAge(119));
    }

    @Test
    void ageImmediatelyAboveMaximum() {
        assertFalse(utils.isValidAge(121));
    }

    @Test
    void ageNormalAdult() {
        assertTrue(utils.isValidAge(35));
    }

    @Test
    void ageZeroIsInvalid() {
        assertFalse(utils.isValidAge(0));
    }

    @Test
    void ageNegativeIsInvalid() {
        assertFalse(utils.isValidAge(-1));
    }

    @Test
    void ageMaximumIntegerIsInvalid() {
        assertFalse(utils.isValidAge(Integer.MAX_VALUE));
    }

    // isValidEmail(String email)
    // Expected results follow the exact simplified regex.

    @Test
    void emailStandardAddressIsValid() {
        assertTrue(utils.isValidEmail("user@example.com"));
    }

    @Test
    void emailWithAllowedLocalSymbolsIsValid() {
        assertTrue(utils.isValidEmail("a.b_c%+d-e@example.com"));
    }

    @Test
    void emailWithSubdomainIsValid() {
        assertTrue(utils.isValidEmail("user@mail.example.co.uk"));
    }

    @Test
    void emailTwoLetterTldIsValid() {
        assertTrue(utils.isValidEmail("a@b.co"));
    }

    @Test
    void emailOneLetterTldIsInvalid() {
        assertFalse(utils.isValidEmail("a@b.c"));
    }

    @Test
    void emailMissingAtSymbolIsInvalid() {
        assertFalse(utils.isValidEmail("userexample.com"));
    }

    @Test
    void emailMissingLocalPartIsInvalid() {
        assertFalse(utils.isValidEmail("@example.com"));
    }

    @Test
    void emailMissingDomainIsInvalid() {
        assertFalse(utils.isValidEmail("user@"));
    }

    @Test
    void emailMissingDotIsInvalid() {
        assertFalse(utils.isValidEmail("user@examplecom"));
    }

    @Test
    void emailWithSpacesIsInvalid() {
        assertFalse(utils.isValidEmail("user name@example.com"));
    }

    @Test
    void emailWithMultipleAtSymbolsIsInvalid() {
        assertFalse(utils.isValidEmail("a@@example.com"));
    }

    @Test
    void emailWithNumericTldIsInvalid() {
        assertFalse(utils.isValidEmail("user@example.123"));
    }

    @Test
    void emailWithTrailingCharactersIsInvalid() {
        assertFalse(utils.isValidEmail("user@example.com!"));
    }

    @Test
    void emailNullReturnsFalse() {
        assertFalse(utils.isValidEmail(null));
    }

    @Test
    void emailEmptyReturnsFalse() {
        assertFalse(utils.isValidEmail(""));
    }

    @Test
    void emailUppercaseLettersAreValid() {
        assertTrue(utils.isValidEmail("USER@EXAMPLE.COM"));
    }

    // isLeapYear(int year)

    @Test
    void leapYearDivisibleByFour() {
        assertTrue(utils.isLeapYear(2024));
    }

    @Test
    void leapYearDivisibleByFourHundred() {
        assertTrue(utils.isLeapYear(2000));
    }

    @Test
    void centuryNotDivisibleByFourHundred() {
        assertFalse(utils.isLeapYear(1900));
    }

    @Test
    void normalNonLeapYear() {
        assertFalse(utils.isLeapYear(2023));
    }

    @Test
    void leapYearBeforeCentury() {
        assertTrue(utils.isLeapYear(1996));
    }

    @Test
    void nonLeapYearAfterCentury() {
        assertFalse(utils.isLeapYear(2001));
    }

    @Test
    void yearDivisibleByOneHundredNotFourHundred() {
        assertFalse(utils.isLeapYear(2100));
    }

    @Test
    void yearDivisibleByFourHundredAgain() {
        assertTrue(utils.isLeapYear(2400));
    }

    @Test
    void yearDivisibleByFourButNotHundred() {
        assertTrue(utils.isLeapYear(2028));
    }
}
