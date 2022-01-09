package ru.vsu.cs.kunakhova_a_y.tests;

import ru.vsu.cs.kunakhova_a_y.Solution;

public class Tests {
    public TestResult tests() {
        ArraysForTests arraysList = new ArraysForTests();
        TestCase[] arrays = arraysList.getArraysTest();
        for (int i = 0; i < arrays.length; i++) {
            int newResult = Solution.calculateFirstNumOfSubsequence(arrays[i].getArray(), arrays[i].getLengthOfSubsequence());

            if (newResult != arrays[i].getResult()) {
                System.out.print(i + 1);
                TestResult.printComment();
                return new TestResult(false);
            }
        }
        return new TestResult(true);
    }
}
