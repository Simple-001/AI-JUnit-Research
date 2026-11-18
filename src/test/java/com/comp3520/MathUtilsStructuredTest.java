
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsStructuredTest {

    private final MathUtils utils = new MathUtils();

    // add(int a, int b)

    @Test
    void addTwoPositiveNumbersReturnsSum() {
        assertEquals(15, utils.add(10, 5));
    }

    @Test
    void addTwoNegativeNumbersReturnsNegativeSum() {
        assertEquals(-15, utils.add(-10, -5));
    }

    @Test
    void addPositiveAndNegativeNumbers() {
        assertEquals(3, utils.add(8, -5));
    }

    @Test
    void addOppositeNumbersReturnsZero() {
        assertEquals(0, utils.add(12, -12));
    }

    @Test
    void addZeroToZeroReturnsZero() {
        assertEquals(0, utils.add(0, 0));
    }

    @Test
    void addMaximumIntegerAndZero() {
        assertEquals(Integer.MAX_VALUE,
                utils.add(Integer.MAX_VALUE, 0));
    }

    @Test
    void addMinimumIntegerAndZero() {
        assertEquals(Integer.MIN_VALUE,
                utils.add(Integer.MIN_VALUE, 0));
    }

    @Test
    void addLargeNumbersWithoutOverflow() {
        assertEquals(2000000000,
                utils.add(1000000000, 1000000000));
    }

    // divide(double a, double b)

    @Test
    void dividePositiveNumbersReturnsQuotient() {
        assertEquals(5.0, utils.divide(10.0, 2.0), 1e-9);
    }

    @Test
    void divideNegativeNumerator() {
        assertEquals(-5.0, utils.divide(-10.0, 2.0), 1e-9);
    }

    @Test
    void divideTwoNegativeNumbers() {
        assertEquals(5.0, utils.divide(-10.0, -2.0), 1e-9);
    }

    @Test
    void divideZeroNumerator() {
        assertEquals(0.0, utils.divide(0.0, 5.0), 1e-9);
    }

    @Test
    void divideProducesFractionalResult() {
        assertEquals(2.5, utils.divide(5.0, 2.0), 1e-9);
    }

    @Test
    void divideDetectsIntegerDivisionMistake() {
        assertEquals(1.5, utils.divide(3.0, 2.0), 1e-9);
    }

    @Test
    void divideDecimalNumbers() {
        assertEquals(2.5, utils.divide(1.25, 0.5), 1e-9);
    }

    @Test
    void divideByPositiveZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, 0.0));
    }

    @Test
    void divideByNegativeZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, -0.0));
    }

    @Test
    void divideByVerySmallNonzeroNumber() {
        assertEquals(1000000000.0,
                utils.divide(1.0, 1e-9), 0.001);
    }

    // factorial(int n)

    @Test
    void factorialMinimumBoundaryZero() {
        assertEquals(1L, utils.factorial(0));
    }

    @Test
    void factorialOneReturnsOne() {
        assertEquals(1L, utils.factorial(1));
    }

    @Test
    void factorialFiveReturns120() {
        assertEquals(120L, utils.factorial(5));
    }

    @Test
    void factorialTenReturns3628800() {
        assertEquals(3628800L, utils.factorial(10));
    }

    @Test
    void factorialMaximumBoundaryTwenty() {
        assertEquals(2432902008176640000L,
                utils.factorial(20));
    }

    @Test
    void factorialImmediatelyBelowMaximum() {
        assertEquals(121645100408832000L,
                utils.factorial(19));
    }

    @Test
    void factorialBelowMinimumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(-1));
    }

    @Test
    void factorialAboveMaximumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(21));
    }

    @Test
    void factorialLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(Integer.MIN_VALUE));
    }
}
