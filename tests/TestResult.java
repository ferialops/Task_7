package ru.vsu.cs.kunakhova_a_y.tests;

public class TestResult {

    final boolean testResult;

    public TestResult(boolean testResult) {
        this.testResult = testResult;
    }

    public boolean getTestResult() {
        return testResult;
    }

    static void printComment() {
        System.out.println(" test is incorrect.");
        System.out.println("Please read the task requirements again and try again.");
    }
}
