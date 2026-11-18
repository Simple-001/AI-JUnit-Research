
package com.comp3520;

public class ArrayUtils {

    public static int findMaximum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static boolean contains(int[] values, int target) {
        if (values == null) {
            throw new IllegalArgumentException("Null array");
        }

        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
