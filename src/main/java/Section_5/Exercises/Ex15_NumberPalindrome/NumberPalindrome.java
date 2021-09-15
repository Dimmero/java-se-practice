package Section_5.Exercises.Ex15_NumberPalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = number < 0 ? Math.abs(number) : number;
        char[] arr = Integer.toString(number).toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length/2; i++) {
            if (arr[i] == arr[j - i]) {
            } else return false;
        }
        return true;
    }
}
