
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsBasicTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void reverseNormalString() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    void reverseSingleCharacter() {
        assertEquals("a", utils.reverse("a"));
    }

    @Test
    void reversePreservesSpaces() {
        assertEquals("a b", utils.reverse("b a"));
    }

    @Test
    void reverseNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.reverse(null));
    }

    @Test
    void palindromeLowercase() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void palindromeIgnoringCase() {
        assertTrue(utils.isPalindrome("RaceCar"));
    }

    @Test
    void palindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void palindromeEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    void palindromeNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.isPalindrome(null));
    }

    @Test
    void countVowelsNormalString() {
        assertEquals(2, utils.countVowels("hello"));
    }

    @Test
    void countVowelsUppercase() {
        assertEquals(5, utils.countVowels("AEIOU"));
    }

    @Test
    void countVowelsNoVowels() {
        assertEquals(0, utils.countVowels("rhythm"));
    }

    @Test
    void countVowelsEmptyString() {
        assertEquals(0, utils.countVowels(""));
    }

    @Test
    void countVowelsMixedCase() {
        assertEquals(5, utils.countVowels("Education"));
    }

    @Test
    void countVowelsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.countVowels(null));
    }
}
