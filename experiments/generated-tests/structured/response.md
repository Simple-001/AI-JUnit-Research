1. MathUtilsStructuredTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsStructuredTest {

    private final MathUtils utils = new MathUtils();

    // add(int a, int b)

    @Test
    void addTwoPositiveNumbersReturnsSum() {
        assertEquals(15, utils.add(10, 5));
    }

    @Test
    void addTwoNegativeNumbersReturnsNegativeSum() {
        assertEquals(-15, utils.add(-10, -5));
    }

    @Test
    void addPositiveAndNegativeNumbers() {
        assertEquals(3, utils.add(8, -5));
    }

    @Test
    void addOppositeNumbersReturnsZero() {
        assertEquals(0, utils.add(12, -12));
    }

    @Test
    void addZeroToZeroReturnsZero() {
        assertEquals(0, utils.add(0, 0));
    }

    @Test
    void addMaximumIntegerAndZero() {
        assertEquals(Integer.MAX_VALUE,
                utils.add(Integer.MAX_VALUE, 0));
    }

    @Test
    void addMinimumIntegerAndZero() {
        assertEquals(Integer.MIN_VALUE,
                utils.add(Integer.MIN_VALUE, 0));
    }

    @Test
    void addLargeNumbersWithoutOverflow() {
        assertEquals(2000000000,
                utils.add(1000000000, 1000000000));
    }

    // divide(double a, double b)

    @Test
    void dividePositiveNumbersReturnsQuotient() {
        assertEquals(5.0, utils.divide(10.0, 2.0), 1e-9);
    }

    @Test
    void divideNegativeNumerator() {
        assertEquals(-5.0, utils.divide(-10.0, 2.0), 1e-9);
    }

    @Test
    void divideTwoNegativeNumbers() {
        assertEquals(5.0, utils.divide(-10.0, -2.0), 1e-9);
    }

    @Test
    void divideZeroNumerator() {
        assertEquals(0.0, utils.divide(0.0, 5.0), 1e-9);
    }

    @Test
    void divideProducesFractionalResult() {
        assertEquals(2.5, utils.divide(5.0, 2.0), 1e-9);
    }

    @Test
    void divideDetectsIntegerDivisionMistake() {
        assertEquals(1.5, utils.divide(3.0, 2.0), 1e-9);
    }

    @Test
    void divideDecimalNumbers() {
        assertEquals(2.5, utils.divide(1.25, 0.5), 1e-9);
    }

    @Test
    void divideByPositiveZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, 0.0));
    }

    @Test
    void divideByNegativeZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, -0.0));
    }

    @Test
    void divideByVerySmallNonzeroNumber() {
        assertEquals(1000000000.0,
                utils.divide(1.0, 1e-9), 0.001);
    }

    // factorial(int n)

    @Test
    void factorialMinimumBoundaryZero() {
        assertEquals(1L, utils.factorial(0));
    }

    @Test
    void factorialOneReturnsOne() {
        assertEquals(1L, utils.factorial(1));
    }

    @Test
    void factorialFiveReturns120() {
        assertEquals(120L, utils.factorial(5));
    }

    @Test
    void factorialTenReturns3628800() {
        assertEquals(3628800L, utils.factorial(10));
    }

    @Test
    void factorialMaximumBoundaryTwenty() {
        assertEquals(2432902008176640000L,
                utils.factorial(20));
    }

    @Test
    void factorialImmediatelyBelowMaximum() {
        assertEquals(121645100408832000L,
                utils.factorial(19));
    }

    @Test
    void factorialBelowMinimumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(-1));
    }

    @Test
    void factorialAboveMaximumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(21));
    }

    @Test
    void factorialLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(Integer.MIN_VALUE));
    }
}

assertEquals(-15, utils.add(-10, -5));
}

    @Test
    void addPositiveAndNegativeNumbers() {
        assertEquals(3, utils.add(8, -5));
    }

    @Test
    void addOppositeNumbersReturnsZero() {
        assertEquals(0, utils.add(12, -12));
    }

    @Test
    void addZeroToZeroReturnsZero() {
        assertEquals(0, utils.add(0, 0));
    }

    @Test
    void addMaximumIntegerAndZero() {
        assertEquals(Integer.MAX_VALUE,
                utils.add(Integer.MAX_VALUE, 0));
    }

    @Test
    void addMinimumIntegerAndZero() {
        assertEquals(Integer.MIN_VALUE,
                utils.add(Integer.MIN_VALUE, 0));
    }

    @Test
    void addLargeNumbersWithoutOverflow() {
        assertEquals(2000000000,
                utils.add(1000000000, 1000000000));
    }

    // divide(double a, double b)

    @Test
    void dividePositiveNumbersReturnsQuotient() {
        assertEquals(5.0, utils.divide(10.0, 2.0), 1e-9);
    }

    @Test
    void divideNegativeNumerator() {
        assertEquals(-5.0, utils.divide(-10.0, 2.0), 1e-9);
    }

    @Test
    void divideTwoNegativeNumbers() {
        assertEquals(5.0, utils.divide(-10.0, -2.0), 1e-9);
    }

    @Test
    void divideZeroNumerator() {
        assertEquals(0.0, utils.divide(0.0, 5.0), 1e-9);
    }

    @Test
    void divideProducesFractionalResult() {
        assertEquals(2.5, utils.divide(5.0, 2.0), 1e-9);
    }

    @Test
    void divideDetectsIntegerDivisionMistake() {
        assertEquals(1.5, utils.divide(3.0, 2.0), 1e-9);
    }

    @Test
    void divideDecimalNumbers() {
        assertEquals(2.5, utils.divide(1.25, 0.5), 1e-9);
    }

    @Test
    void divideByPositiveZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, 0.0));
    }

    @Test
    void divideByNegativeZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.divide(10.0, -0.0));
    }

    @Test
    void divideByVerySmallNonzeroNumber() {
        assertEquals(1000000000.0,
                utils.divide(1.0, 1e-9), 0.001);
    }

    // factorial(int n)

    @Test
    void factorialMinimumBoundaryZero() {
        assertEquals(1L, utils.factorial(0));
    }

    @Test
    void factorialOneReturnsOne() {
        assertEquals(1L, utils.factorial(1));
    }

    @Test
    void factorialFiveReturns120() {
        assertEquals(120L, utils.factorial(5));
    }

    @Test
    void factorialTenReturns3628800() {
        assertEquals(3628800L, utils.factorial(10));
    }

    @Test
    void factorialMaximumBoundaryTwenty() {
        assertEquals(2432902008176640000L,
                utils.factorial(20));
    }

    @Test
    void factorialImmediatelyBelowMaximum() {
        assertEquals(121645100408832000L,
                utils.factorial(19));
    }

    @Test
    void factorialBelowMinimumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(-1));
    }

    @Test
    void factorialAboveMaximumThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(21));
    }

    @Test
    void factorialLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.factorial(Integer.MIN_VALUE));
    }
}



2. StringUtilsStructuredTest.java

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

3. ValidationUtilsStructuredTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsStructuredTest {

    private final ValidationUtils utils = new ValidationUtils();

    // isValidAge(int age)

    @Test
    void ageMinimumValidBoundary() {
        assertTrue(utils.isValidAge(18));
    }

    @Test
    void ageImmediatelyBelowMinimum() {
        assertFalse(utils.isValidAge(17));
    }

    @Test
    void ageImmediatelyAboveMinimum() {
        assertTrue(utils.isValidAge(19));
    }

    @Test
    void ageMaximumValidBoundary() {
        assertTrue(utils.isValidAge(120));
    }

    @Test
    void ageImmediatelyBelowMaximum() {
        assertTrue(utils.isValidAge(119));
    }

    @Test
    void ageImmediatelyAboveMaximum() {
        assertFalse(utils.isValidAge(121));
    }

    @Test
    void ageNormalAdult() {
        assertTrue(utils.isValidAge(35));
    }

    @Test
    void ageZeroIsInvalid() {
        assertFalse(utils.isValidAge(0));
    }

    @Test
    void ageNegativeIsInvalid() {
        assertFalse(utils.isValidAge(-1));
    }

    @Test
    void ageMaximumIntegerIsInvalid() {
        assertFalse(utils.isValidAge(Integer.MAX_VALUE));
    }

    // isValidEmail(String email)
    // Expected results follow the exact simplified regex.

    @Test
    void emailStandardAddressIsValid() {
        assertTrue(utils.isValidEmail("user@example.com"));
    }

    @Test
    void emailWithAllowedLocalSymbolsIsValid() {
        assertTrue(utils.isValidEmail("a.b_c%+d-e@example.com"));
    }

    @Test
    void emailWithSubdomainIsValid() {
        assertTrue(utils.isValidEmail("user@mail.example.co.uk"));
    }

    @Test
    void emailTwoLetterTldIsValid() {
        assertTrue(utils.isValidEmail("a@b.co"));
    }

    @Test
    void emailOneLetterTldIsInvalid() {
        assertFalse(utils.isValidEmail("a@b.c"));
    }

    @Test
    void emailMissingAtSymbolIsInvalid() {
        assertFalse(utils.isValidEmail("userexample.com"));
    }

    @Test
    void emailMissingLocalPartIsInvalid() {
        assertFalse(utils.isValidEmail("@example.com"));
    }

    @Test
    void emailMissingDomainIsInvalid() {
        assertFalse(utils.isValidEmail("user@"));
    }

    @Test
    void emailMissingDotIsInvalid() {
        assertFalse(utils.isValidEmail("user@examplecom"));
    }

    @Test
    void emailWithSpacesIsInvalid() {
        assertFalse(utils.isValidEmail("user name@example.com"));
    }

    @Test
    void emailWithMultipleAtSymbolsIsInvalid() {
        assertFalse(utils.isValidEmail("a@@example.com"));
    }

    @Test
    void emailWithNumericTldIsInvalid() {
        assertFalse(utils.isValidEmail("user@example.123"));
    }

    @Test
    void emailWithTrailingCharactersIsInvalid() {
        assertFalse(utils.isValidEmail("user@example.com!"));
    }

    @Test
    void emailNullReturnsFalse() {
        assertFalse(utils.isValidEmail(null));
    }

    @Test
    void emailEmptyReturnsFalse() {
        assertFalse(utils.isValidEmail(""));
    }

    @Test
    void emailUppercaseLettersAreValid() {
        assertTrue(utils.isValidEmail("USER@EXAMPLE.COM"));
    }

    // isLeapYear(int year)

    @Test
    void leapYearDivisibleByFour() {
        assertTrue(utils.isLeapYear(2024));
    }

    @Test
    void leapYearDivisibleByFourHundred() {
        assertTrue(utils.isLeapYear(2000));
    }

    @Test
    void centuryNotDivisibleByFourHundred() {
        assertFalse(utils.isLeapYear(1900));
    }

    @Test
    void normalNonLeapYear() {
        assertFalse(utils.isLeapYear(2023));
    }

    @Test
    void leapYearBeforeCentury() {
        assertTrue(utils.isLeapYear(1996));
    }

    @Test
    void nonLeapYearAfterCentury() {
        assertFalse(utils.isLeapYear(2001));
    }

    @Test
    void yearDivisibleByOneHundredNotFourHundred() {
        assertFalse(utils.isLeapYear(2100));
    }

    @Test
    void yearDivisibleByFourHundredAgain() {
        assertTrue(utils.isLeapYear(2400));
    }

    @Test
    void yearDivisibleByFourButNotHundred() {
        assertTrue(utils.isLeapYear(2028));
    }
}

4. ArrayUtilsStructuredTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsStructuredTest {

    private final ArrayUtils utils = new ArrayUtils();

    // findMaximum(int[] values)

    @Test
    void maximumFromPositiveArray() {
        assertEquals(9,
                utils.findMaximum(new int[]{1, 9, 3, 5}));
    }

    @Test
    void maximumFromNegativeArray() {
        assertEquals(-1,
                utils.findMaximum(new int[]{-5, -1, -10}));
    }

    @Test
    void maximumFromMixedArray() {
        assertEquals(10,
                utils.findMaximum(new int[]{-10, 0, 10}));
    }

    @Test
    void maximumFromSingleElement() {
        assertEquals(7,
                utils.findMaximum(new int[]{7}));
    }

    @Test
    void maximumFromRepeatedValues() {
        assertEquals(5,
                utils.findMaximum(new int[]{5, 5, 5}));
    }

    @Test
    void maximumAtFirstPosition() {
        assertEquals(20,
                utils.findMaximum(new int[]{20, 3, 1}));
    }

    @Test
    void maximumAtLastPosition() {
        assertEquals(20,
                utils.findMaximum(new int[]{1, 3, 20}));
    }

    @Test
    void maximumWithIntegerBoundaries() {
        assertEquals(Integer.MAX_VALUE,
                utils.findMaximum(new int[]{
                        Integer.MIN_VALUE,
                        Integer.MAX_VALUE
                }));
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

    // calculateAverage(int[] values)

    @Test
    void averagePositiveNumbers() {
        assertEquals(3.0,
                utils.calculateAverage(new int[]{1, 2, 3, 4, 5}),
                1e-9);
    }

    @Test
    void averageFractionalResult() {
        assertEquals(2.5,
                utils.calculateAverage(new int[]{1, 2, 3, 4}),
                1e-9);
    }

    @Test
    void averageDetectsIntegerDivisionError() {
        assertEquals(1.5,
                utils.calculateAverage(new int[]{1, 2}),
                1e-9);
    }

    @Test
    void averageNegativeNumbers() {
        assertEquals(-3.0,
                utils.calculateAverage(new int[]{-2, -4}),
                1e-9);
    }

    @Test
    void averageMixedPositiveNegative() {
        assertEquals(0.0,
                utils.calculateAverage(new int[]{-5, 0, 5}),
                1e-9);
    }

    @Test
    void averageSingleElement() {
        assertEquals(10.0,
                utils.calculateAverage(new int[]{10}),
                1e-9);
    }

    @Test
    void averageRepeatedValues() {
        assertEquals(4.0,
                utils.calculateAverage(new int[]{4, 4, 4}),
                1e-9);
    }

    @Test
    void averageLargeValuesAvoidsIntegerOverflow() {
        assertEquals(2000000000.0,
                utils.calculateAverage(new int[]{
                        2000000000, 2000000000
                }),
                1e-9);
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

    // contains(int[] values, int target)

    @Test
    void containsExistingMiddleElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    void containsFirstElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 1));
    }

    @Test
    void containsLastElement() {
        assertTrue(utils.contains(new int[]{1, 2, 3}, 3));
    }

    @Test
    void containsMissingElement() {
        assertFalse(utils.contains(new int[]{1, 2, 3}, 5));
    }

    @Test
    void containsEmptyArrayReturnsFalse() {
        assertFalse(utils.contains(new int[]{}, 1));
    }

    @Test
    void containsSingleMatchingElement() {
        assertTrue(utils.contains(new int[]{7}, 7));
    }

    @Test
    void containsSingleNonmatchingElement() {
        assertFalse(utils.contains(new int[]{7}, 8));
    }

    @Test
    void containsNegativeTarget() {
        assertTrue(utils.contains(new int[]{-5, 0, 5}, -5));
    }

    @Test
    void containsZeroTarget() {
        assertTrue(utils.contains(new int[]{-1, 0, 1}, 0));
    }

    @Test
    void containsRepeatedTarget() {
        assertTrue(utils.contains(new int[]{2, 2, 2}, 2));
    }

    @Test
    void containsNullThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.contains(null, 1));
    }
}

5. UtilityUtilsStructuredTest.java

package com.comp3520;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityUtilsStructuredTest {

    private final UtilityUtils utils = new UtilityUtils();

    // calculateDiscount(double price, double percentage)

    @Test
    void discountNormalPercentage() {
        assertEquals(80.0,
                utils.calculateDiscount(100.0, 20.0),
                1e-9);
    }

    @Test
    void discountDetectsIncorrectPercentageFormula() {
        assertEquals(160.0,
                utils.calculateDiscount(200.0, 20.0),
                1e-9);
    }

    @Test
    void discountMinimumPercentageBoundary() {
        assertEquals(100.0,
                utils.calculateDiscount(100.0, 0.0),
                1e-9);
    }

    @Test
    void discountMaximumPercentageBoundary() {
        assertEquals(0.0,
                utils.calculateDiscount(100.0, 100.0),
                1e-9);
    }

    @Test
    void discountJustAboveMinimumPercentage() {
        assertEquals(99.99,
                utils.calculateDiscount(100.0, 0.01),
                1e-9);
    }

    @Test
    void discountJustBelowMaximumPercentage() {
        assertEquals(0.01,
                utils.calculateDiscount(100.0, 99.99),
                1e-9);
    }

    @Test
    void discountFractionalPercentage() {
        assertEquals(87.5,
                utils.calculateDiscount(100.0, 12.5),
                1e-9);
    }

    @Test
    void discountFractionalPrice() {
        assertEquals(7.5,
                utils.calculateDiscount(10.0, 25.0),
                1e-9);
    }

    @Test
    void discountZeroPrice() {
        assertEquals(0.0,
                utils.calculateDiscount(0.0, 50.0),
                1e-9);
    }

    @Test
    void discountNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(-1.0, 20.0));
    }

    @Test
    void discountNegativePercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100.0, -0.01));
    }

    @Test
    void discountAboveMaximumPercentageThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.calculateDiscount(100.0, 100.01));
    }

    @Test
    void discountLargeValidPrice() {
        assertEquals(750000.0,
                utils.calculateDiscount(1000000.0, 25.0),
                1e-9);
    }

    // celsiusToFahrenheit(double celsius)

    @Test
    void celsiusZeroConvertsTo32() {
        assertEquals(32.0,
                utils.celsiusToFahrenheit(0.0),
                1e-9);
    }

    @Test
    void celsiusHundredConvertsTo212() {
        assertEquals(212.0,
                utils.celsiusToFahrenheit(100.0),
                1e-9);
    }

    @Test
    void celsiusNegativeFortyConvertsToNegativeForty() {
        assertEquals(-40.0,
                utils.celsiusToFahrenheit(-40.0),
                1e-9);
    }

    @Test
    void celsiusBodyTemperature() {
        assertEquals(98.6,
                utils.celsiusToFahrenheit(37.0),
                1e-9);
    }

    @Test
    void celsiusFractionalValue() {
        assertEquals(32.9,
                utils.celsiusToFahrenheit(0.5),
                1e-9);
    }

    @Test
    void celsiusNegativeValue() {
        assertEquals(14.0,
                utils.celsiusToFahrenheit(-10.0),
                1e-9);
    }

    @Test
    void celsiusDetectsIntegerDivisionMistake() {
        assertEquals(33.8,
                utils.celsiusToFahrenheit(1.0),
                1e-9);
    }

    // isPrime(int number)

    @Test
    void primeMinimumValidNumberTwo() {
        assertTrue(utils.isPrime(2));
    }

    @Test
    void primeThree() {
        assertTrue(utils.isPrime(3));
    }

    @Test
    void primeOddNumber() {
        assertTrue(utils.isPrime(17));
    }

    @Test
    void primeLargerNumber() {
        assertTrue(utils.isPrime(97));
    }

    @Test
    void primeLargeKnownPrime() {
        assertTrue(utils.isPrime(997));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(utils.isPrime(1));
    }

    @Test
    void zeroIsNotPrime() {
        assertFalse(utils.isPrime(0));
    }

    @Test
    void negativeNumberIsNotPrime() {
        assertFalse(utils.isPrime(-7));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(utils.isPrime(4));
    }

    @Test
    void evenCompositeIsNotPrime() {
        assertFalse(utils.isPrime(100));
    }

    @Test
    void oddCompositeIsNotPrime() {
        assertFalse(utils.isPrime(25));
    }

    @Test
    void squareOfPrimeIsNotPrime() {
        assertFalse(utils.isPrime(49));
    }

    @Test
    void compositeWithFactorsAboveTwo() {
        assertFalse(utils.isPrime(121));
    }

    @Test
    void largeCompositeIsNotPrime() {
        assertFalse(utils.isPrime(999));
    }
}
