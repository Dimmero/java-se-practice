package Section_5.Exercises.NumberOfDaysInMonth;

public class Main {
    public static void main(String[] args) {
        int a = NumberOfDaysInMonth.getDaysInMonth(12,10000);
        System.out.println(a);
        NumberOfDaysInMonth.isLeapYear(0);
        NumberOfDaysInMonth.isLeapYear(1924);
        NumberOfDaysInMonth.isLeapYear(2000);

    }
}
