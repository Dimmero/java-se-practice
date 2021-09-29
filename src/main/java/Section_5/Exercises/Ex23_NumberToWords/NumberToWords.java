package Section_5.Exercises.Ex23_NumberToWords;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        boolean numberIsZero = true;
        int numberToPrint;
        int reversedNumber = reverse(number);

        while (numberIsZero) {
            numberToPrint = reversedNumber % 10;
            reversedNumber /= 10;
            if (reversedNumber == 0) {
                numberIsZero = false;
            }
            switch (numberToPrint) {
                case (0): {
                    System.out.print("Zero");
                    break;
                }
                case (1): {
                    System.out.print("One ");
                    break;
                }
                case (2): {
                    System.out.print("Two ");
                    break;
                }
                case (3): {
                    System.out.print("Three ");
                    break;
                }
                case (4): {
                    System.out.print("Four ");
                    break;
                }
                case (5): {
                    System.out.print("Five ");
                    break;
                }
                case (6): {
                    System.out.print("Six ");
                    break;
                }
                case (7): {
                    System.out.print("Seven ");
                    break;
                }
                case (8): {
                    System.out.print("Eight ");
                    break;
                }
                case (9): {
                    System.out.print("Nine ");
                    break;
                }
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
