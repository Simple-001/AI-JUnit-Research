
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityUtilsBasicTest {

    private final UtilityUtils utils = new UtilityUtils();

    @Test
    void discountNormalPercentage() {
        assertEquals(80.0,
                utils.calculateDiscount(100, 20),
                0.000001);
    }

    @Test
    void discountZeroPercent() {
        assertEquals(100.0,
                utils.calculateDiscount(100, 0),
                0.000001);
    }

    @Test
    void discountHundredPercent() {
        assertEquals(0.0,
                utils.calculateDiscount(100, 100),
                0.000001);
    }

    @Test
    void discountFractionalPercentage() {
        assertEquals(87.5,
                utils.calculateDiscount(100, 12.5),
                0.000001);
    }

    @Test
    void discountZeroPrice() {
        assertEquals(0.0,
                utils.calculateDiscount(0, 50),
                0.000001);
    }

    @Test
    void discountNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(-100, 20));
    }

    @Test
    void discountNegativePercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100, -1));
    }

    @Test
    void discountAboveHundredThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100, 101));
    }

    @Test
    void celsiusZero() {
        assertEquals(32.0,
                utils.celsiusToFahrenheit(0),
                0.000001);
    }

    @Test
    void celsiusBoilingPoint() {
        assertEquals(212.0,
                utils.celsiusToFahrenheit(100),
                0.000001);
    }

    @Test
    void celsiusNegativeForty() {
        assertEquals(-40.0,
                utils.celsiusToFahrenheit(-40),
                0.000001);
    }

    @Test
    void celsiusFractional() {
        assertEquals(98.6,
                utils.celsiusToFahrenheit(37),
                0.000001);
    }

    @Test
    void primeNumberTwo() {
        assertTrue(utils.isPrime(2));
    }

    @Test
    void primeOddNumber() {
        assertTrue(utils.isPrime(17));
    }

    @Test
    void primeLargeNumber() {
        assertTrue(utils.isPrime(97));
    }

    @Test
    void nonPrimeOne() {
        assertFalse(utils.isPrime(1));
    }

    @Test
    void nonPrimeZero() {
        assertFalse(utils.isPrime(0));
    }

    @Test
    void nonPrimeNegative() {
        assertFalse(utils.isPrime(-7));
    }

    @Test
    void nonPrimeComposite() {
        assertFalse(utils.isPrime(25));
    }

    @Test
    void nonPrimeEvenNumber() {
        assertFalse(utils.isPrime(100));
    }
}
