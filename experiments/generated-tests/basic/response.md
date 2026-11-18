1. MathUtilsBasicTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsBasicTest {

    private final MathUtils math = new MathUtils();

    @Test
    void addPositiveNumbers() {
        assertEquals(15, math.add(10, 5));
    }

    @Test
    void addNegativeNumbers() {
        assertEquals(-15, math.add(-10, -5));
    }

    @Test
    void addOppositeNumbers() {
        assertEquals(0, math.add(10, -10));
    }

    @Test
    void addZero() {
        assertEquals(7, math.add(7, 0));
    }

    @Test
    void dividePositiveNumbers() {
        assertEquals(5.0, math.divide(10, 2), 0.000001);
    }

    @Test
    void divideNegativeNumbers() {
        assertEquals(-5.0, math.divide(-10, 2), 0.000001);
    }

    @Test
    void divideFractionalResult() {
        assertEquals(2.5, math.divide(5, 2), 0.000001);
    }

    @Test
    void divideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.divide(10, 0));
    }

    @Test
    void factorialOfZero() {
        assertEquals(1L, math.factorial(0));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1L, math.factorial(1));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120L, math.factorial(5));
    }

    @Test
    void factorialOfTwenty() {
        assertEquals(2432902008176640000L, math.factorial(20));
    }

    @Test
    void factorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.factorial(-1));
    }

    @Test
    void factorialAboveTwentyThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> math.factorial(21));
    }
}

2. StringUtilsBasicTest.java

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

3. ValidationUtilsBasicTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsBasicTest {

    private final ValidationUtils utils = new ValidationUtils();

    @Test
    void validAgeNormal() {
        assertTrue(utils.isValidAge(25));
    }

    @Test
    void validAgeMinimumBoundary() {
        assertTrue(utils.isValidAge(18));
    }

    @Test
    void validAgeMaximumBoundary() {
        assertTrue(utils.isValidAge(120));
    }

    @Test
    void invalidAgeBelowMinimum() {
        assertFalse(utils.isValidAge(17));
    }

    @Test
    void invalidAgeAboveMaximum() {
        assertFalse(utils.isValidAge(121));
    }

    @Test
    void invalidNegativeAge() {
        assertFalse(utils.isValidAge(-5));
    }

    @Test
    void validEmailStandard() {
        assertTrue(utils.isValidEmail("user@example.com"));
    }

    @Test
    void validEmailWithSymbols() {
        assertTrue(utils.isValidEmail("user.name+1@example.co.uk"));
    }

    @Test
    void invalidEmailMissingAt() {
        assertFalse(utils.isValidEmail("userexample.com"));
    }

    @Test
    void invalidEmailMissingDomain() {
        assertFalse(utils.isValidEmail("user@"));
    }

    @Test
    void invalidEmailShortExtension() {
        assertFalse(utils.isValidEmail("user@example.c"));
    }

    @Test
    void invalidEmailWithSpaces() {
        assertFalse(utils.isValidEmail("user name@example.com"));
    }

    @Test
    void invalidEmailNull() {
        assertFalse(utils.isValidEmail(null));
    }

    @Test
    void invalidEmailEmpty() {
        assertFalse(utils.isValidEmail(""));
    }

    @Test
    void leapYearDivisibleByFour() {
        assertTrue(utils.isLeapYear(2024));
    }

    @Test
    void leapYearDivisibleByFourHundred() {
        assertTrue(utils.isLeapYear(2000));
    }

    @Test
    void nonLeapCenturyYear() {
        assertFalse(utils.isLeapYear(1900));
    }

    @Test
    void nonLeapNormalYear() {
        assertFalse(utils.isLeapYear(2023));
    }

    @Test
    void leapYearTwentyFourHundred() {
        assertTrue(utils.isLeapYear(2400));
    }
}

4. ArrayUtilsBasicTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsBasicTest {

    private final ArrayUtils utils = new ArrayUtils();

    @Test
    void maximumPositiveNumbers() {
        assertEquals(9,
                utils.findMaximum(new int[]{1, 9, 3, 5}));
    }

    @Test
    void maximumNegativeNumbers() {
        assertEquals(-1,
                utils.findMaximum(new int[]{-5, -1, -10}));
    }

    @Test
    void maximumSingleElement() {
        assertEquals(7,
                utils.findMaximum(new int[]{7}));
    }

    @Test
    void maximumDuplicateValues() {
        assertEquals(5,
                utils.findMaximum(new int[]{5, 5, 5}));
    }

    @Test
    void maximumEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.findMaximum(new int[]{}));
    }

    @Test
    void maximumNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.findMaximum(null));
    }

    @Test
    void averageNormalArray() {
        assertEquals(3.0,
                utils.calculateAverage(new int[]{1, 2, 3, 4, 5}),
                0.000001);
    }

    @Test
    void averageFractionalResult() {
        assertEquals(2.5,
                utils.calculateAverage(new int[]{1, 2, 3, 4}),
                0.000001);
    }

    @Test
    void averageNegativeNumbers() {
        assertEquals(-3.0,
                utils.calculateAverage(new int[]{-2, -4}),
                0.000001);
    }

    @Test
    void averageSingleElement() {
        assertEquals(10.0,
                utils.calculateAverage(new int[]{10}),
                0.000001);
    }

    @Test
    void averageEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateAverage(new int[]{}));
    }

    @Test
    void averageNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateAverage(null));
    }

    @Test
    void containsExistingElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    void containsMissingElement() {
        assertFalse(utils.contains(new int[]{1, 2, 3}, 5));
    }

    @Test
    void containsEmptyArray() {
        assertFalse(utils.contains(new int[]{}, 1));
    }

    @Test
    void containsNegativeNumber() {
        assertTrue(utils.contains(new int[]{-5, 0, 5}, -5));
    }

    @Test
    void containsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.contains(null, 1));
    }
}

5. UtilityUtilsBasicTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityUtilsBasicTest {

    private final UtilityUtils utils = new UtilityUtils();

    @Test
    void discountNormalPercentage() {
        assertEquals(80.0,
                utils.calculateDiscount(100, 20),
                0.000001);
    }

    @Test
    void discountZeroPercent() {
        assertEquals(100.0,
                utils.calculateDiscount(100, 0),
                0.000001);
    }

    @Test
    void discountHundredPercent() {
        assertEquals(0.0,
                utils.calculateDiscount(100, 100),
                0.000001);
    }

    @Test
    void discountFractionalPercentage() {
        assertEquals(87.5,
                utils.calculateDiscount(100, 12.5),
                0.000001);
    }

    @Test
    void discountZeroPrice() {
        assertEquals(0.0,
                utils.calculateDiscount(0, 50),
                0.000001);
    }

    @Test
    void discountNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(-100, 20));
    }

    @Test
    void discountNegativePercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100, -1));
    }

    @Test
    void discountAboveHundredThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100, 101));
    }

    @Test
    void celsiusZero() {
        assertEquals(32.0,
                utils.celsiusToFahrenheit(0),
                0.000001);
    }

    @Test
    void celsiusBoilingPoint() {
        assertEquals(212.0,
                utils.celsiusToFahrenheit(100),
                0.000001);
    }

    @Test
    void celsiusNegativeForty() {
        assertEquals(-40.0,
                utils.celsiusToFahrenheit(-40),
                0.000001);
    }

    @Test
    void celsiusFractional() {
        assertEquals(98.6,
                utils.celsiusToFahrenheit(37),
                0.000001);
    }

    @Test
    void primeNumberTwo() {
        assertTrue(utils.isPrime(2));
    }

    @Test
    void primeOddNumber() {
        assertTrue(utils.isPrime(17));
    }

    @Test
    void primeLargeNumber() {
        assertTrue(utils.isPrime(97));
    }

    @Test
    void nonPrimeOne() {
        assertFalse(utils.isPrime(1));
    }

    @Test
    void nonPrimeZero() {
        assertFalse(utils.isPrime(0));
    }

    @Test
    void nonPrimeNegative() {
        assertFalse(utils.isPrime(-7));
    }

    @Test
    void nonPrimeComposite() {
        assertFalse(utils.isPrime(25));
    }

    @Test
    void nonPrimeEvenNumber() {
        assertFalse(utils.isPrime(100));
    }
}

