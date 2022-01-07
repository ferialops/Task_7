package ru.vsu.cs.kunakhova_a_y;

import java.util.Scanner;

public class ArrayUtils {
    //ввод массива с клавиатуры
    public static int[] readArray() {
        int lengthOfArray = readLengthOfArray();
        int[] array = new int[lengthOfArray];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print("Write element of array: ");
            array[i] = sc.nextInt();
            System.out.println(array[i] + "; ");
        }
        return array;
    }

    //ввод длины подпоследовательности
    public static int readLengthOfArray() {
        System.out.println("Write length of array");
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        if (lengthOfArray <= 0) {
            System.out.println("Length cant be less then 1. Try again.");
            return readLengthOfArray();
        } else {
            return lengthOfArray;
        }
    }

    //печать массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
    }
}
