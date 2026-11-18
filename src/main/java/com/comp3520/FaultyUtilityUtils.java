
package com.comp3520;

public class FaultyUtilityUtils {

    // Fault 13: Subtracts percentage as a fixed amount
    public static double calculateDiscount(
            double price, double percentage) {
        if (price < 0 || percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid input");
        }
        return price - percentage;
    }

    // Fault 14: Uses integer division (9 / 5 = 1)
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * (9 / 5) + 32;
    }

    // Fault 15: Incorrectly treats 1 as prime
    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
