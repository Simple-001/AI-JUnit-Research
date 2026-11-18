
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemainingMethodsReferenceTest {

    // STRING METHODS

    @Test
    void reverseWorks() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("a", StringUtils.reverse("a"));
        assertThrows(IllegalArgumentException.class,
                () -> StringUtils.reverse(null));
    }

    @Test
    void palindromeWorks() {
        assertTrue(StringUtils.isPalindrome("RaceCar"));
        assertTrue(StringUtils.isPalindrome(""));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertThrows(IllegalArgumentException.class,
                () -> StringUtils.isPalindrome(null));
    }

    @Test
    void vowelCountingWorks() {
        assertEquals(5, StringUtils.countVowels("AEIOU"));
        assertEquals(2, StringUtils.countVowels("hello"));
        assertEquals(0, StringUtils.countVowels("xyz"));
        assertThrows(IllegalArgumentException.class,
                () -> StringUtils.countVowels(null));
    }

    // VALIDATION METHODS

    @Test
    void ageValidationWorks() {
        assertTrue(ValidationUtils.isValidAge(18));
        assertTrue(ValidationUtils.isValidAge(120));
        assertFalse(ValidationUtils.isValidAge(17));
        assertFalse(ValidationUtils.isValidAge(121));
    }

    @Test
    void emailValidationWorks() {
        assertTrue(ValidationUtils.isValidEmail("user@example.com"));
        assertFalse(ValidationUtils.isValidEmail("user@example"));
        assertFalse(ValidationUtils.isValidEmail("invalid"));
        assertFalse(ValidationUtils.isValidEmail(null));
    }

    @Test
    void leapYearWorks() {
        assertTrue(ValidationUtils.isLeapYear(2000));
        assertFalse(ValidationUtils.isLeapYear(1900));
        assertTrue(ValidationUtils.isLeapYear(2024));
        assertFalse(ValidationUtils.isLeapYear(2023));
    }

    // ARRAY METHODS

    @Test
    void maximumWorks() {
        assertEquals(-2,
                ArrayUtils.findMaximum(new int[]{-5, -2, -9}));
        assertEquals(10,
                ArrayUtils.findMaximum(new int[]{1, 10, 3}));
        assertThrows(IllegalArgumentException.class,
                () -> ArrayUtils.findMaximum(new int[]{}));
    }

    @Test
    void averageWorks() {
        assertEquals(1.5,
                ArrayUtils.calculateAverage(new int[]{1, 2}), 0.0001);
        assertEquals(3.0,
                ArrayUtils.calculateAverage(new int[]{2, 4}), 0.0001);
        assertThrows(IllegalArgumentException.class,
                () -> ArrayUtils.calculateAverage(new int[]{}));
    }

    @Test
    void containsWorks() {
        assertTrue(ArrayUtils.contains(new int[]{1, 2, 3}, 3));
        assertFalse(ArrayUtils.contains(new int[]{1, 2, 3}, 4));
        assertFalse(ArrayUtils.contains(new int[]{}, 1));
        assertThrows(IllegalArgumentException.class,
                () -> ArrayUtils.contains(null, 1));
    }

    // UTILITY METHODS

    @Test
    void discountWorks() {
        assertEquals(80.0,
                UtilityUtils.calculateDiscount(100, 20), 0.0001);
        assertEquals(100.0,
                UtilityUtils.calculateDiscount(100, 0), 0.0001);
        assertThrows(IllegalArgumentException.class,
                () -> UtilityUtils.calculateDiscount(100, 101));
    }

    @Test
    void temperatureConversionWorks() {
        assertEquals(32.0,
                UtilityUtils.celsiusToFahrenheit(0), 0.0001);
        assertEquals(212.0,
                UtilityUtils.celsiusToFahrenheit(100), 0.0001);
        assertEquals(-40.0,
                UtilityUtils.celsiusToFahrenheit(-40), 0.0001);
    }

    @Test
    void primeWorks() {
        assertFalse(UtilityUtils.isPrime(1));
        assertTrue(UtilityUtils.isPrime(2));
        assertTrue(UtilityUtils.isPrime(17));
        assertFalse(UtilityUtils.isPrime(9));
    }
}
