package Section_4.exercises.Ex5_DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        return (int) (number1 * 1000) == (int) (number2 * 1000);
    }
}
