# AI-Generated JUnit Test Evaluation

**Evaluating the Effectiveness of Structured Prompting in AI-Generated JUnit Tests: An Experimental Comparison Using ChatGPT-4**

**Authors:** Kabir Sood and Pavneet Singh  
**University:** Thompson Rivers University  
**Course:** COMP 3520 – Software Engineering  
**Date:** November 2026

## 1. Project Overview

This project investigates whether providing more detailed instructions to ChatGPT improves the effectiveness of AI-generated unit tests.

We compared two prompting approaches:

- **Basic Prompting:** ChatGPT was asked to generate JUnit 5 tests using the specifications of 15 Java methods.
- **Structured Prompting:** ChatGPT received the same specifications along with detailed instructions to consider boundary values, invalid inputs, exceptions, special cases, and possible implementation errors.

Our goal was to determine whether structured prompting produces more effective tests, rather than simply generating a larger number of test cases.

## 2. Technologies Used

- Java
- JUnit 5
- Apache Maven
- ChatGPT-4
- Git and GitHub
- IntelliJ IDEA

The prompts requested Java 21. The Maven environment used during the experiment reported compilation with Java release 17.

## 3. Project Structure

The project contains five Java utility classes, their corresponding JUnit test classes, and supporting experimental materials.

```text
AI-JUnit-Research/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/com/comp3520/
│   │   └── Java utility classes
│   └── test/java/com/comp3520/
│       └── JUnit test classes
└── experiments/
    ├── method-specifications.md
    ├── prompts/
    │   ├── basic-prompt.txt
    │   └── structured-prompt.txt
    ├── generated-tests/
    │   ├── basic/response.md
    │   └── structured/response.md
    └── results/
        └── fault-detection-results.csv
```

## 4. Methods Tested

We evaluated 15 methods distributed across five utility classes.

| Class | Methods |
|---|---|
| MathUtils | add, divide, factorial |
| StringUtils | reverse, isPalindrome, countVowels |
| ValidationUtils | isValidAge, isValidEmail, isLeapYear |
| ArrayUtils | findMaximum, calculateAverage, contains |
| UtilityUtils | calculateDiscount, celsiusToFahrenheit, isPrime |

The methods cover arithmetic operations, string manipulation, validation, array processing, and general utility calculations.

## 5. Experimental Methodology

The experiment was conducted in three main stages.

### Stage 1: Generate Unit Tests

We provided ChatGPT with the specifications for all 15 methods.

Two separate sets of JUnit 5 tests were generated using the basic and structured prompts.

The basic approach generated 86 tests, while the structured approach generated 156 tests.

### Stage 2: Execute the Tests

Both test suites were executed using Apache Maven and JUnit 5.

An additional reference suite containing 30 tests was used to check the intended behavior of the Java methods.

After restoring the correct production implementations, all 272 tests passed.

### Stage 3: Fault Injection

Six faults were manually introduced into selected methods, one at a time.

Each modified implementation was tested using both generated test suites.

The objective was to determine whether the tests could detect incorrect behavior.

## 6. Experimental Results

| Metric | Basic Prompting | Structured Prompting |
|---|---:|---:|
| Generated tests | 86 | 156 |
| Injected faults | 6 | 6 |
| Faults detected | 6 | 6 |
| Fault detection rate | 100% | 100% |
| Failing/error test cases across experiments | 10 | 17 |

### Fault Detection Details

| Fault ID | Modified Method | Basic Failures/Errors | Structured Failures/Errors |
|---|---|---:|---:|
| F01 | MathUtils.add | 3 | 5 |
| F02 | MathUtils.divide | 3 | 7 |
| F03 | MathUtils.factorial | 1 | 1 |
| F04 | ValidationUtils.isValidAge | 1 | 1 |
| F05 | ValidationUtils.isLeapYear | 1 | 2 |
| F06 | ArrayUtils.findMaximum | 1 | 1 |
| **Total** | | **10** | **17** |

Structured prompting produced approximately 81.4% more test cases than basic prompting.

However, both approaches detected all six injected faults. Therefore, the experiment did not demonstrate an improvement in the number of unique faults detected.

The higher number of failing tests in the structured suite may partly reflect its larger size.

## 7. How to Run the Project

### Prerequisites

Install the following:

- Java Development Kit compatible with the Maven compiler configuration
- Apache Maven
- Git
- IntelliJ IDEA or another Java IDE (optional)

### Clone the Repository

```bash
git clone -b fault-injection-experiment https://github.com/Simple-001/AI-JUnit-Research.git
```

### Navigate to the Project

```bash
cd AI-JUnit-Research
```

### Run All Tests

```bash
mvn clean test
```

Maven will compile the project and execute the JUnit tests.

With the correct production code restored, the test suite should complete successfully.

### Review Experimental Results

The recorded fault-injection results are available at:

```text
experiments/results/fault-detection-results.csv
```

The original prompts and generated responses are preserved in the `experiments/` directory.

The six faults were introduced manually during the experiment. The CSV records the observed results; it is not an automated fault-injection script.

## 8. Limitations

This experiment has several limitations:

- Only 15 methods from five relatively small Java classes were evaluated.
- Six manually selected faults were used.
- The structured suite contained more tests than the basic suite.
- The experiment did not use an automated mutation-testing framework.
- Statement and branch coverage were not measured.
- The results cannot establish whether the same outcomes would occur with larger, more complex software systems.

## 9. Conclusion

This project helped us understand how prompt design can influence AI-generated software tests.

Structured prompting generated substantially more test cases and encouraged broader consideration of edge cases.

However, both prompting approaches detected the same six faults in our experiment.

Our results suggest that generating more tests does not automatically mean detecting more unique defects.

Future work could evaluate larger Java projects, additional fault types, code coverage, and automated mutation testing.

## 10. Team Contributions

Kabir Sood and Pavneet Singh contributed equally to the project.

Both authors participated in planning, implementation, experimental evaluation, analysis, and preparation of the research report.

## 11. AI Usage Disclosure

ChatGPT was used to generate JUnit test cases under the two prompting conditions and to assist with research writing and documentation.

The generated tests were executed and evaluated as part of the experiment. The authors remain responsible for reviewing the code, verifying the reported results, and ensuring the accuracy of the submitted work.

## 12. Repository

**GitHub:** https://github.com/Simple-001/AI-JUnit-Research

**Experimental branch:** `fault-injection-experiment`

**Research paper:** Submitted separately as part of the COMP 3520 assignment.
