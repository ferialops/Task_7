package ru.vsu.cs.kunakhova_a_y;

public class Solution {
    public static int calculateFirstNumOfSubsequence(int[] myArray, int lengthOfSubsequence) {
        int maxSumOfSubsequence = 0;
        int firstNumOfSubsequence = -1;
        if (lengthOfSubsequence <= 0 || lengthOfSubsequence > myArray.length) {
            return -1;
        }
        for (int i = 0; i <= myArray.length - lengthOfSubsequence; i++) {
            int sumOfSubsequence = 0;
            for (int j = 0; j < lengthOfSubsequence; j++) {
                sumOfSubsequence = sumOfSubsequence + myArray[i + j];
            }
            if (i == 0) {                                   //при первом проходе по массиву максимальной сумме
                maxSumOfSubsequence = sumOfSubsequence;     //подпоследовательности присваивается получившийся результат
            }                                               //в качестве начального значения
            if (sumOfSubsequence >= maxSumOfSubsequence) {
                maxSumOfSubsequence = sumOfSubsequence;
                firstNumOfSubsequence = i;
            }
        }
        return firstNumOfSubsequence;
    }
}
