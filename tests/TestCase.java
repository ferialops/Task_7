package ru.vsu.cs.kunakhova_a_y.tests;

public class TestCase {
    final int[] array;
    final int result;
    final int lengthOfSubsequence;

    public TestCase(int[] array, int lengthOfSubSequence, int result) {
        this.array = array;
        this.result = result;
        this.lengthOfSubsequence = lengthOfSubSequence;
    }

    public int[] getArray() {
        return array;
    }
    public int getLengthOfSubsequence() {
        return lengthOfSubsequence;
    }

    public int getResult() {
        return result;
    }
}
