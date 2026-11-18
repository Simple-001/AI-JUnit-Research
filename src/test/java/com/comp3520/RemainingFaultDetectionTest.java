
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemainingFaultDetectionTest {

    @Test
    void detectsReverseFault() {
        assertNotEquals(
                StringUtils.reverse("hello"),
                FaultyStringUtils.reverse("hello"));
    }

    @Test
    void detectsPalindromeFault() {
        assertNotEquals(
                StringUtils.isPalindrome("RaceCar"),
                FaultyStringUtils.isPalindrome("RaceCar"));
    }

    @Test
    void detectsVowelFault() {
        assertNotEquals(
                StringUtils.countVowels("AEIOU"),
                FaultyStringUtils.countVowels("AEIOU"));
    }

    @Test
    void detectsAgeFault() {
        assertNotEquals(
                ValidationUtils.isValidAge(18),
                FaultyValidationUtils.isValidAge(18));
    }

    @Test
    void detectsEmailFault() {
        assertNotEquals(
                ValidationUtils.isValidEmail("user@example"),
                FaultyValidationUtils.isValidEmail("user@example"));
    }

    @Test
    void detectsLeapYearFault() {
        assertNotEquals(
                ValidationUtils.isLeapYear(1900),
                FaultyValidationUtils.isLeapYear(1900));
    }

    @Test
    void detectsMaximumFault() {
        int[] values = {-5, -2, -9};
        assertNotEquals(
                ArrayUtils.findMaximum(values),
                FaultyArrayUtils.findMaximum(values));
    }

    @Test
    void detectsAverageFault() {
        int[] values = {1, 2};
        assertNotEquals(
                ArrayUtils.calculateAverage(values),
                FaultyArrayUtils.calculateAverage(values));
    }

    @Test
    void detectsContainsFault() {
        int[] values = {1, 2, 3};
        assertNotEquals(
                ArrayUtils.contains(values, 3),
                FaultyArrayUtils.contains(values, 3));
    }


    @Test
    void detectsDiscountFault() {
        assertNotEquals(
                UtilityUtils.calculateDiscount(200, 20),
                FaultyUtilityUtils.calculateDiscount(200, 20)
        );
    }


    @Test
    void detectsTemperatureFault() {
        assertNotEquals(
                UtilityUtils.celsiusToFahrenheit(100),
                FaultyUtilityUtils.celsiusToFahrenheit(100));
    }

    @Test
    void detectsPrimeFault() {
        assertNotEquals(
                UtilityUtils.isPrime(1),
                FaultyUtilityUtils.isPrime(1));
    }
}
