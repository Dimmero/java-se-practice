package Section_5.Exercises.Ex23_NumberToWords;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        boolean numberIsZero = true;
        int numberToPrint;
        int reversedNumber = reverse(number);

        while (numberIsZero) {
            if (reversedNumber == 0)
                numberIsZero = false;
            numberToPrint = reversedNumber % 10;
            reversedNumber /= 10;
            switch (numberToPrint) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
        }
        for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverse(number))); i++) {
            System.out.print("Zero ");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int remainingNumber;
        boolean numberIsZero = true;

        while (numberIsZero) {
            remainingNumber = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + remainingNumber;
            if (number == 0)
                numberIsZero = false;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0)
            return -1;


        boolean numberIsZero = true;
        int counter = 0;

        while (numberIsZero) {
            number /= 10;
            counter++;
            if (number == 0)
                numberIsZero = false;
        }
        return counter;
    }
}
