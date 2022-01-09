package ru.vsu.cs.kunakhova_a_y.tests;

public class ArraysForTests {
    public TestCase[] getArraysTest() {
        TestCase testMirrorArray1 = new TestCase(new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1}, 2, 5);
        TestCase testIdenticalNumbersArray = new TestCase(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5}, 1, 8);
        TestCase testDecreasingSequenceArray = new TestCase(new int[]{0, -1, -2, -3, -4, -5, -6, -7, -8}, 3, 0);
        TestCase testRandomArray1 = new TestCase(new int[]{7, -1, 4, 10, 0, 100, -1000}, -100, -1);
        TestCase testRandomArray2 = new TestCase(new int[]{4, -5, -6, 15, 22, -12, 44, -70}, 0, -1);
        TestCase testMirrorArray2 = new TestCase(new int[]{6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6}, 5, 6);
        TestCase testRandomArray3 = new TestCase(new int[]{11, 98, 35, 49,7, 12, 6, 1, 50}, 1, 1);
        TestCase testHugeArray = new TestCase(new int[]{-8484, 8404, 1000, 38272, 0, 1}, 11, -1);
        TestCase testRandomArray4 = new TestCase(new int[]{-8, -27, 55, -2, 3, 90, 0, -651, 9, 6}, 4, 2);
        TestCase testNegativeArray = new TestCase(new int[]{-9, -29, -50, -15, -4, -97, -15}, 7, 0);

        return new TestCase[]{testMirrorArray1, testIdenticalNumbersArray, testDecreasingSequenceArray, testRandomArray1,
                testRandomArray2, testMirrorArray2, testRandomArray3, testHugeArray, testRandomArray4, testNegativeArray};
    }
}
