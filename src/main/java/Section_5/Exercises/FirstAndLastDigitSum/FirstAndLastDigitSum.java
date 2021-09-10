package Section_5.Exercises.FirstAndLastDigitSum;

import java.util.Arrays;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        } else if (number / 10 == 0){
            return number * 2;
        }
        char[] arr = Integer.toString(number).toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length/2; i++) {
            number = Character.getNumericValue(arr[i]) + Character.getNumericValue(arr[j - i]);
            break;
        }
        return number;
    }
}
