
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsBasicTest {

    private final MathUtils math = new MathUtils();

    @Test
    void addPositiveNumbers() {
        assertEquals(15, math.add(10, 5));
    }

    @Test
    void addNegativeNumbers() {
        assertEquals(-15, math.add(-10, -5));
    }

    @Test
    void addOppositeNumbers() {
        assertEquals(0, math.add(10, -10));
    }

    @Test
    void addZero() {
        assertEquals(7, math.add(7, 0));
    }

    @Test
    void dividePositiveNumbers() {
        assertEquals(5.0, math.divide(10, 2), 0.000001);
    }

    @Test
    void divideNegativeNumbers() {
        assertEquals(-5.0, math.divide(-10, 2), 0.000001);
    }

    @Test
    void divideFractionalResult() {
        assertEquals(2.5, math.divide(5, 2), 0.000001);
    }

    @Test
    void divideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.divide(10, 0));
    }

    @Test
    void factorialOfZero() {
        assertEquals(1L, math.factorial(0));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1L, math.factorial(1));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120L, math.factorial(5));
    }

    @Test
    void factorialOfTwenty() {
        assertEquals(2432902008176640000L, math.factorial(20));
    }

    @Test
    void factorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.factorial(-1));
    }

    @Test
    void factorialAboveTwentyThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.factorial(21));
    }
}
