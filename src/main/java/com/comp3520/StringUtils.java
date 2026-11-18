
package com.comp3520;

public class StringUtils {

    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        String normalized = input.toLowerCase();
        return normalized.equals(reverse(normalized));
    }

    public static int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }
}

