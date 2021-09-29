package Section_8.Exercises.Ex43_ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int a = array.length;
        int[] reversedArray = new int[a];
        for (int i = 0; i <= (a - 1) / 2; i++) {
            reversedArray[a - 1 - i] = array[i];
            reversedArray[i] = array[a - 1 - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        reverse(array);
    }
}
