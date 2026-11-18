
package com.comp3520;

public class ValidationUtils {

    public static boolean isValidAge(int age) {
        return age >= 18 && age <= 120;
    }

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        );
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);
    }
}
