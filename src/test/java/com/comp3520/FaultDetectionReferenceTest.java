
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FaultDetectionReferenceTest {

    @Test
    void detectsAdditionFault() {
        assertNotEquals(
                MathUtils.add(5, 3),
                FaultyMathUtils.add(5, 3)
        );
    }

    @Test
    void detectsDivisionFault() {
        assertNotEquals(
                MathUtils.divide(10, 2),
                FaultyMathUtils.divide(10, 2)
        );
    }

    @Test
    void detectsFactorialFault() {
        assertNotEquals(
                MathUtils.factorial(0),
                FaultyMathUtils.factorial(0)
        );
    }
}
