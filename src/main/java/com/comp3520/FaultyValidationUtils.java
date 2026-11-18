
package com.comp3520;

public class FaultyValidationUtils {

    // Fault 7: Rejects age 18
    public static boolean isValidAge(int age) {
        return age > 18 && age <= 120;
    }

    // Fault 8: Accepts addresses without a dot in domain
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+$"
        );
    }

    // Fault 9: Incorrect century-year handling
    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
