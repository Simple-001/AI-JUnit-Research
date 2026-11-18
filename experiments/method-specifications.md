
# Java Method Specifications

Package: com.comp3520
Testing framework: JUnit 5
Java version: 21

## MathUtils
- add(int a, int b): Returns the sum of two integers.
- divide(double a, double b): Returns a/b. Throws
  IllegalArgumentException when b is zero.
- factorial(int n): Returns n! for 0 <= n <= 20.
  Throws IllegalArgumentException otherwise.

## StringUtils
- reverse(String input): Reverses the input string.
  Throws IllegalArgumentException for null.
- isPalindrome(String input): Checks whether a string
  reads the same forwards and backwards, ignoring case.
  Throws IllegalArgumentException for null.
- countVowels(String input): Counts English vowels
  (a,e,i,o,u), ignoring case.
  Throws IllegalArgumentException for null.

## ValidationUtils
- isValidAge(int age): Returns true for ages 18 to 120,
  inclusive.
- isValidEmail(String email): Returns true when the
  entire string matches this simplified Java regex:
  ^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$
  Returns false for null.
- isLeapYear(int year): Returns true for years divisible
  by 400, or divisible by 4 but not by 100.

## ArrayUtils
- findMaximum(int[] values): Returns the maximum integer.
  Throws IllegalArgumentException for null or empty arrays.
- calculateAverage(int[] values): Returns the arithmetic
  mean as a double. Throws IllegalArgumentException
  for null or empty arrays.
- contains(int[] values, int target): Returns true if
  the target appears in the array. Returns false for
  an empty array. Throws IllegalArgumentException for null.

## UtilityUtils
- calculateDiscount(double price, double percentage):
  Returns price after a percentage discount.
  Valid percentage: 0 to 100 inclusive.
  Price must be nonnegative.
  Throws IllegalArgumentException for invalid inputs.
- celsiusToFahrenheit(double celsius): Returns
  celsius * 9.0 / 5.0 + 32.
- isPrime(int number): Returns true only when number
  is a prime integer greater than or equal to 2.
