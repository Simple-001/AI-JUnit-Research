
package com.comp3520;

public class FaultyMathUtils {

    // Fault 1: Subtracts instead of adding
    public static int add(int a, int b) {
        return a - b;
    }

    // Fault 2: Uses multiplication instead of division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "Cannot divide by zero"
            );
        }
        return a * b;
    }

    // Fault 3: Incorrectly returns 0 for factorial(0)
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Input must be between 0 and 20"
            );
        }

        if (n == 0) {
            return 0;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

