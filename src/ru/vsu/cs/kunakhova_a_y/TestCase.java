package ru.vsu.cs.kunakhova_a_y;

public class TestCase {
    public static void test() {
        int[] testArray1 = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1};
        int[] testArray2 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] testArray3 = new int[]{0, -1, -2, -3, -4, -5, -6, -7, -8};
        int[] testArray4 = new int[]{7, -1, 4, 10, 0, 100, -1000};
        int[] testArray5 = new int[]{4, -5, -6, 15, 22, -12, 44, -70};

        System.out.println("Test1");
        ArrayUtils.printArray(testArray1);
        System.out.print("Length of subsequence: 7; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray1, 7));

        System.out.println("Test2");
        ArrayUtils.printArray(testArray1);
        System.out.print("Length of subsequence: 1; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray1, 1));

        System.out.println("Test3");
        ArrayUtils.printArray(testArray2);
        System.out.print("Length of subsequence: 4; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray2, 4));

        System.out.println("Test4");
        ArrayUtils.printArray(testArray2);
        System.out.print("Length of subsequence: 0; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray2, 0));

        System.out.println("Test5");
        ArrayUtils.printArray(testArray3);
        System.out.print("Length of subsequence: 4; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray3, 4));

        System.out.println("Test6");
        ArrayUtils.printArray(testArray3);
        System.out.print("Length of subsequence: -10; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray3, -10));

        System.out.println("Test7");
        ArrayUtils.printArray(testArray4);
        System.out.print("Length of subsequence: 5; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray4, 5));

        System.out.println("Test8");
        ArrayUtils.printArray(testArray4);
        System.out.print("Length of subsequence: 2; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray4, 2));

        System.out.println("Test9");
        ArrayUtils.printArray(testArray5);
        System.out.print("Length of subsequence: 50; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray5, 50));

        System.out.println("Test10");
        ArrayUtils.printArray(testArray5);
        System.out.print("Length of subsequence: 3; Result: ");
        System.out.println(Solution.calculateFirstNumOfSubsequence(testArray5, 3));
    }
}
