
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsReferenceTest {

    @Test
    void additionWorks() {
        assertEquals(8, MathUtils.add(5, 3));
        assertEquals(-2, MathUtils.add(-5, 3));
        assertEquals(0, MathUtils.add(0, 0));
    }

    @Test
    void divisionWorks() {
        assertEquals(5.0, MathUtils.divide(10, 2), 0.0001);
        assertEquals(-3.0, MathUtils.divide(-9, 3), 0.0001);
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.divide(10, 0));
    }

    @Test
    void factorialWorks() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(120, MathUtils.factorial(5));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorial(-1));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorial(21));
    }
}

