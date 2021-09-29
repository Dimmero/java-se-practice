package Section_8.Exercises.Ex42_MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayIntegers = new int[count];
        System.out.printf("Please, provide %d numbers: %n", count);
        for (int i = 0; i < arrayIntegers.length; i++) {
            arrayIntegers[i] = scanner.nextInt();
        }
        return arrayIntegers;
    }

    public static int findMin(int[] array) {
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minInt) {
                minInt = array[i];
            }
        }
        return minInt;
    }
}
