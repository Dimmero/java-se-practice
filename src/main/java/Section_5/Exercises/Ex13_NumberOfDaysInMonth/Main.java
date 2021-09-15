package Section_5.Exercises.Ex13_NumberOfDaysInMonth;

public class Main {
    private static int height = 0;

    public static void main(String[] args) {
        int a = NumberOfDaysInMonth.getDaysInMonth(12,10000);
        int b = NumberOfDaysInMonth.getDaysInMonth(12,5784);
        System.out.println(a);
        System.out.println(b);

        NumberOfDaysInMonth.isLeapYear(0);
        NumberOfDaysInMonth.isLeapYear(1924);
        NumberOfDaysInMonth.isLeapYear(2000);

    }
}
