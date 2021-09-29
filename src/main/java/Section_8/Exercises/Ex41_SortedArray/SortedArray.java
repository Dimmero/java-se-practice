package Section_8.Exercises.Ex41_SortedArray;

import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int sizeOfArray) {
        System.out.println("You've just created array of " + sizeOfArray + " integers. Now please fill it in with the numbers:");
        int[] arrayOfNumbers = new int[sizeOfArray];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        return arrayOfNumbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        boolean notSorted = true;
        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] > array[i]) {
                    int buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    notSorted = true;
                }
            }
        }
        return array;
    }
}


