package ru.vsu.cs.kunakhova_a_y;

import ru.vsu.cs.kunakhova_a_y.tests.TestResult;
import ru.vsu.cs.kunakhova_a_y.tests.Tests;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Tests test = new Tests();
        TestResult TestResult = test.tests();
        if (TestResult.getTestResult()) {
            System.out.println("The tests passed");

            int[] myArray = ArrayUtils.readArray();
            ArrayUtils.printArray(myArray);
            int lengthOfSubsequence = readLengthOfSubsequence();
            int result = Solution.calculateFirstNumOfSubsequence(myArray, lengthOfSubsequence);
            System.out.println("Index of the beginning of the substring = " + result);
        } else System.out.println("The tests failed.");

    }

    //ввод длины подпоследовательности
    public static int readLengthOfSubsequence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write length of subsequence");
        int lengthOfSubSequence = sc.nextInt();
        if (lengthOfSubSequence <= 0) {
            return -1;
        } else {
            return lengthOfSubSequence;
        }
    }
}
