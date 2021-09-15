package Section_5.Exercises.Ex27InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            sum += number;
            counter++;
        }
        long avg = Math.round((double) sum / counter);
        System.out.printf("SUM = %d AVG = %d", sum, avg);
        scanner.close();
    }
}
