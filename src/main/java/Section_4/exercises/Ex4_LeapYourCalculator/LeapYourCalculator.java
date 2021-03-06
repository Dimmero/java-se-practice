package Section_4.exercises.Ex4_LeapYourCalculator;

public class LeapYourCalculator {
    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        }
        return false;
    }

}
