
package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsStructuredTest {

    private final StringUtils utils = new StringUtils();

    // reverse(String input)

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
        assertEquals("A", utils.reverse("A"));
    }

    @Test
    void reversePreservesCase() {
        assertEquals("CbA", utils.reverse("AbC"));
    }

    @Test
    void reversePreservesSpaces() {
        assertEquals("c b a", utils.reverse("a b c"));
    }

    @Test
    void reverseSpecialCharacters() {
        assertEquals("!@cba", utils.reverse("abc@!"));
    }

    @Test
    void reverseNumericCharacters() {
        assertEquals("54321", utils.reverse("12345"));
    }

    @Test
    void reverseNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.reverse(null));
    }

    // isPalindrome(String input)

    @Test
    void palindromeOddLength() {
        assertTrue(utils.isPalindrome("radar"));
    }

    @Test
    void palindromeEvenLength() {
        assertTrue(utils.isPalindrome("abba"));
    }

    @Test
    void palindromeIgnoresCase() {
        assertTrue(utils.isPalindrome("RaceCar"));
    }

    @Test
    void palindromeSingleCharacter() {
        assertTrue(utils.isPalindrome("x"));
    }

    @Test
    void palindromeEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    void palindromeNonMatchingString() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void palindromeDoesNotIgnoreSpaces() {
        assertFalse(utils.isPalindrome("a b a "));
    }

    @Test
    void palindromeDoesNotIgnorePunctuation() {
        assertFalse(utils.isPalindrome("a!a?"));
    }

    @Test
    void palindromeWithMatchingSpecialCharacters() {
        assertTrue(utils.isPalindrome("!a!"));
    }

    @Test
    void palindromeNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.isPalindrome(null));
    }

    // countVowels(String input)

    @Test
    void countVowelsNormalString() {
        assertEquals(2, utils.countVowels("hello"));
    }

    @Test
    void countAllLowercaseVowels() {
        assertEquals(5, utils.countVowels("aeiou"));
    }

    @Test
    void countAllUppercaseVowels() {
        assertEquals(5, utils.countVowels("AEIOU"));
    }

    @Test
    void countMixedCaseVowels() {
        assertEquals(5, utils.countVowels("aEiOu"));
    }

    @Test
    void countRepeatedVowels() {
        assertEquals(6, utils.countVowels("aaeeii"));
    }

    @Test
    void countStringWithoutVowels() {
        assertEquals(0, utils.countVowels("rhythm"));
    }

    @Test
    void countEmptyString() {
        assertEquals(0, utils.countVowels(""));
    }

    @Test
    void countSpecialCharactersAndDigits() {
        assertEquals(0, utils.countVowels("123!@#"));
    }

    @Test
    void countVowelsAmongSpecialCharacters() {
        assertEquals(2, utils.countVowels("a!e123"));
    }

    @Test
    void countYAsConsonant() {
        assertEquals(0, utils.countVowels("yyy"));
    }

    @Test
    void countVowelsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.countVowels(null));
    }
}
