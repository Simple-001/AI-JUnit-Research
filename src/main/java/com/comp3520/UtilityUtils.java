
package com.comp3520;

public class UtilityUtils {

    public static double calculateDiscount(
            double price, double percentage) {
        if (price < 0 || percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid input");
        }
        return price * (1 - percentage / 100);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
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
