
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityUtilsStructuredTest {

    private final UtilityUtils utils = new UtilityUtils();

    // calculateDiscount(double price, double percentage)

    @Test
    void discountNormalPercentage() {
        assertEquals(80.0,
                utils.calculateDiscount(100.0, 20.0),
                1e-9);
    }

    @Test
    void discountDetectsIncorrectPercentageFormula() {
        assertEquals(160.0,
                utils.calculateDiscount(200.0, 20.0),
                1e-9);
    }

    @Test
    void discountMinimumPercentageBoundary() {
        assertEquals(100.0,
                utils.calculateDiscount(100.0, 0.0),
                1e-9);
    }

    @Test
    void discountMaximumPercentageBoundary() {
        assertEquals(0.0,
                utils.calculateDiscount(100.0, 100.0),
                1e-9);
    }

    @Test
    void discountJustAboveMinimumPercentage() {
        assertEquals(99.99,
                utils.calculateDiscount(100.0, 0.01),
                1e-9);
    }

    @Test
    void discountJustBelowMaximumPercentage() {
        assertEquals(0.01,
                utils.calculateDiscount(100.0, 99.99),
                1e-9);
    }

    @Test
    void discountFractionalPercentage() {
        assertEquals(87.5,
                utils.calculateDiscount(100.0, 12.5),
                1e-9);
    }

    @Test
    void discountFractionalPrice() {
        assertEquals(7.5,
                utils.calculateDiscount(10.0, 25.0),
                1e-9);
    }

    @Test
    void discountZeroPrice() {
        assertEquals(0.0,
                utils.calculateDiscount(0.0, 50.0),
                1e-9);
    }

    @Test
    void discountNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(-1.0, 20.0));
    }

    @Test
    void discountNegativePercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100.0, -0.01));
    }

    @Test
    void discountAboveMaximumPercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100.0, 100.01));
    }

    @Test
    void discountLargeValidPrice() {
        assertEquals(750000.0,
                utils.calculateDiscount(1000000.0, 25.0),
                1e-9);
    }

    // celsiusToFahrenheit(double celsius)

    @Test
    void celsiusZeroConvertsTo32() {
        assertEquals(32.0,
                utils.celsiusToFahrenheit(0.0),
                1e-9);
    }

    @Test
    void celsiusHundredConvertsTo212() {
        assertEquals(212.0,
                utils.celsiusToFahrenheit(100.0),
                1e-9);
    }

    @Test
    void celsiusNegativeFortyConvertsToNegativeForty() {
        assertEquals(-40.0,
                utils.celsiusToFahrenheit(-40.0),
                1e-9);
    }

    @Test
    void celsiusBodyTemperature() {
        assertEquals(98.6,
                utils.celsiusToFahrenheit(37.0),
                1e-9);
    }

    @Test
    void celsiusFractionalValue() {
        assertEquals(32.9,
                utils.celsiusToFahrenheit(0.5),
                1e-9);
    }

    @Test
    void celsiusNegativeValue() {
        assertEquals(14.0,
                utils.celsiusToFahrenheit(-10.0),
                1e-9);
    }

    @Test
    void celsiusDetectsIntegerDivisionMistake() {
        assertEquals(33.8,
                utils.celsiusToFahrenheit(1.0),
                1e-9);
    }

    // isPrime(int number)

    @Test
    void primeMinimumValidNumberTwo() {
        assertTrue(utils.isPrime(2));
    }

    @Test
    void primeThree() {
        assertTrue(utils.isPrime(3));
    }

    @Test
    void primeOddNumber() {
        assertTrue(utils.isPrime(17));
    }

    @Test
    void primeLargerNumber() {
        assertTrue(utils.isPrime(97));
    }

    @Test
    void primeLargeKnownPrime() {
        assertTrue(utils.isPrime(997));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(utils.isPrime(1));
    }

    @Test
    void zeroIsNotPrime() {
        assertFalse(utils.isPrime(0));
    }

    @Test
    void negativeNumberIsNotPrime() {
        assertFalse(utils.isPrime(-7));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(utils.isPrime(4));
    }

    @Test
    void evenCompositeIsNotPrime() {
        assertFalse(utils.isPrime(100));
    }

    @Test
    void oddCompositeIsNotPrime() {
        assertFalse(utils.isPrime(25));
    }

    @Test
    void squareOfPrimeIsNotPrime() {
        assertFalse(utils.isPrime(49));
    }

    @Test
    void compositeWithFactorsAboveTwo() {
        assertFalse(utils.isPrime(121));
    }

    @Test
    void largeCompositeIsNotPrime() {
        assertFalse(utils.isPrime(999));
    }
}
