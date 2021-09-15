package Section_5.Exercises.Ex19_LastDigitChecker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }
        if ( (x % 10 == y % 100) || (y % 10 == z % 10) || (x % 10 == z % 10) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number){
        System.out.println(number >= 10 && number <= 1000);
        return number >= 10 && number <= 1000;
    }
}
