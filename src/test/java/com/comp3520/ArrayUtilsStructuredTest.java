
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsStructuredTest {

    private final ArrayUtils utils = new ArrayUtils();

    // findMaximum(int[] values)

    @Test
    void maximumFromPositiveArray() {
        assertEquals(9,
                utils.findMaximum(new int[]{1, 9, 3, 5}));
    }

    @Test
    void maximumFromNegativeArray() {
        assertEquals(-1,
                utils.findMaximum(new int[]{-5, -1, -10}));
    }

    @Test
    void maximumFromMixedArray() {
        assertEquals(10,
                utils.findMaximum(new int[]{-10, 0, 10}));
    }

    @Test
    void maximumFromSingleElement() {
        assertEquals(7,
                utils.findMaximum(new int[]{7}));
    }

    @Test
    void maximumFromRepeatedValues() {
        assertEquals(5,
                utils.findMaximum(new int[]{5, 5, 5}));
    }

    @Test
    void maximumAtFirstPosition() {
        assertEquals(20,
                utils.findMaximum(new int[]{20, 3, 1}));
    }

    @Test
    void maximumAtLastPosition() {
        assertEquals(20,
                utils.findMaximum(new int[]{1, 3, 20}));
    }

    @Test
    void maximumWithIntegerBoundaries() {
        assertEquals(Integer.MAX_VALUE,
                utils.findMaximum(new int[]{
                        Integer.MIN_VALUE,
                        Integer.MAX_VALUE
                }));
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

    // calculateAverage(int[] values)

    @Test
    void averagePositiveNumbers() {
        assertEquals(3.0,
                utils.calculateAverage(new int[]{1, 2, 3, 4, 5}),
                1e-9);
    }

    @Test
    void averageFractionalResult() {
        assertEquals(2.5,
                utils.calculateAverage(new int[]{1, 2, 3, 4}),
                1e-9);
    }

    @Test
    void averageDetectsIntegerDivisionError() {
        assertEquals(1.5,
                utils.calculateAverage(new int[]{1, 2}),
                1e-9);
    }

    @Test
    void averageNegativeNumbers() {
        assertEquals(-3.0,
                utils.calculateAverage(new int[]{-2, -4}),
                1e-9);
    }

    @Test
    void averageMixedPositiveNegative() {
        assertEquals(0.0,
                utils.calculateAverage(new int[]{-5, 0, 5}),
                1e-9);
    }

    @Test
    void averageSingleElement() {
        assertEquals(10.0,
                utils.calculateAverage(new int[]{10}),
                1e-9);
    }

    @Test
    void averageRepeatedValues() {
        assertEquals(4.0,
                utils.calculateAverage(new int[]{4, 4, 4}),
                1e-9);
    }

    @Test
    void averageLargeValuesAvoidsIntegerOverflow() {
        assertEquals(2000000000.0,
                utils.calculateAverage(new int[]{
                        2000000000, 2000000000
                }),
                1e-9);
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

    // contains(int[] values, int target)

    @Test
    void containsExistingMiddleElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    void containsFirstElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 1));
    }

    @Test
    void containsLastElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 3));
    }

    @Test
    void containsMissingElement() {
        assertFalse(utils.contains(new int[]{1, 2, 3}, 5));
    }

    @Test
    void containsEmptyArrayReturnsFalse() {
        assertFalse(utils.contains(new int[]{}, 1));
    }

    @Test
    void containsSingleMatchingElement() {
        assertTrue(utils.contains(new int[]{7}, 7));
    }

    @Test
    void containsSingleNonmatchingElement() {
        assertFalse(utils.contains(new int[]{7}, 8));
    }

    @Test
    void containsNegativeTarget() {
        assertTrue(utils.contains(new int[]{-5, 0, 5}, -5));
    }

    @Test
    void containsZeroTarget() {
        assertTrue(utils.contains(new int[]{-1, 0, 1}, 0));
    }

    @Test
    void containsRepeatedTarget() {
        assertTrue(utils.contains(new int[]{2, 2, 2}, 2));
    }

    @Test
    void containsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.contains(null, 1));
    }
}
