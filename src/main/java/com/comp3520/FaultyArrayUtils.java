
package com.comp3520;

public class FaultyArrayUtils {

    // Fault 10: Incorrect maximum for all-negative arrays
    public static int findMaximum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        int max = 0;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Fault 11: Integer division truncates the average
    public static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    // Fault 12: Skips the final array element
    public static boolean contains(int[] values, int target) {
        if (values == null) {
            throw new IllegalArgumentException("Null array");
        }

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }
}
