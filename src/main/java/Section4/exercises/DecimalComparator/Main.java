package Section4.exercises.DecimalComparator;

public class Main {
    public static void main(String[] args) {
        DecimalComparator.areEqualByThreeDecimalPlaces(-1.175, -1.1756);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
    }
}
