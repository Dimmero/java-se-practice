package Section4.exercises.MinutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            double hours = minutes / 60;
            double days = hours / 24;
            double years = days / 365;
            double remainingDays = days % 365;
            System.out.println(minutes + " min = " + (int)years + " y and " + (int)remainingDays + " d");
        }
    }
}
