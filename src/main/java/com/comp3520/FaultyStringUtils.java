
package com.comp3520;

public class FaultyStringUtils {

    // Fault 4: Returns original string
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        return input;
    }

    // Fault 5: Case-sensitive comparison
    public static boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        return input.equals(
                new StringBuilder(input).reverse().toString()
        );
    }

    // Fault 6: Does not count uppercase vowels
    public static int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }
}
