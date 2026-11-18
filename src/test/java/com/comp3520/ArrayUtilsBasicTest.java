
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsBasicTest {

    private final ArrayUtils utils = new ArrayUtils();

    @Test
    void maximumPositiveNumbers() {
        assertEquals(9,
                utils.findMaximum(new int[]{1, 9, 3, 5}));
    }

    @Test
    void maximumNegativeNumbers() {
        assertEquals(-1,
                utils.findMaximum(new int[]{-5, -1, -10}));
    }

    @Test
    void maximumSingleElement() {
        assertEquals(7,
                utils.findMaximum(new int[]{7}));
    }

    @Test
    void maximumDuplicateValues() {
        assertEquals(5,
                utils.findMaximum(new int[]{5, 5, 5}));
    }

    @Test
    void maximumEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.findMaximum(new int[]{}));
    }

    @Test
    void maximumNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.findMaximum(null));
    }

    @Test
    void averageNormalArray() {
        assertEquals(3.0,
                utils.calculateAverage(new int[]{1, 2, 3, 4, 5}),
                0.000001);
    }

    @Test
    void averageFractionalResult() {
        assertEquals(2.5,
                utils.calculateAverage(new int[]{1, 2, 3, 4}),
                0.000001);
    }

    @Test
    void averageNegativeNumbers() {
        assertEquals(-3.0,
                utils.calculateAverage(new int[]{-2, -4}),
                0.000001);
    }

    @Test
    void averageSingleElement() {
        assertEquals(10.0,
                utils.calculateAverage(new int[]{10}),
                0.000001);
    }

    @Test
    void averageEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateAverage(new int[]{}));
    }

    @Test
    void averageNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateAverage(null));
    }

    @Test
    void containsExistingElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    void containsMissingElement() {
        assertFalse(utils.contains(new int[]{1, 2, 3}, 5));
    }

    @Test
    void containsEmptyArray() {
        assertFalse(utils.contains(new int[]{}, 1));
    }

    @Test
    void containsNegativeNumber() {
        assertTrue(utils.contains(new int[]{-5, 0, 5}, -5));
    }

    @Test
    void containsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.contains(null, 1));
    }
}
