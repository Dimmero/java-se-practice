package Section_8.Challenges.ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You're creating an array of integers, please provide it's length: ");
        int[] arrayOfInt = getIntegers(scanner.nextInt());

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.printf("%d element is %d and %d has been printed out %n", i + 1, arrayOfInt[i], arrayOfInt[i]);
        }
        int[] sortedDescendingArray = sortDescendingOrder(arrayOfInt);
        System.out.println(Arrays.toString(sortedDescendingArray));

    }

    public static int[] getIntegers(int sizeOfArray){
        System.out.println("You've just created array of " + sizeOfArray + " integers. Now please fill it in with the numbers:");

        int[] arrayOfNumbers = new int[sizeOfArray];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        return arrayOfNumbers;
    }

    public static int[] sortDescendingOrder(int[] array) {
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
