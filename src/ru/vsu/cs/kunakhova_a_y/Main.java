package ru.vsu.cs.kunakhova_a_y;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        TestCase.test();
        int[] myArray = ArrayUtils.readArray();
        ArrayUtils.printArray(myArray);
        int lengthOfSubsequence = readLengthOfSubsequence();
        int result = Solution.calculateFirstNumOfSubsequence(myArray, lengthOfSubsequence);
        System.out.println("Index of the beginning of the substring = " + result);
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
