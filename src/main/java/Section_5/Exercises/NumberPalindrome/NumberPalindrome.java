package Section_5.Exercises.NumberPalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = number < 0 ? Math.abs(number) : number;
        String stringOfNumber = String.valueOf(number);
        char[] arr = stringOfNumber.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i <= j - 1; i++) {
            if (arr[i] == arr[j - i]) {
            } else return false;
        }
        return true;
    }
}
