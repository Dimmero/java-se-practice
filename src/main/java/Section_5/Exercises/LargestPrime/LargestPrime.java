package Section_5.Exercises.LargestPrime;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int primeNumber = 0;
        int maxPrimeNumber = 0;
        for (int i = 2; i <= number; i++) {
            int counterForPrimeDetection = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counterForPrimeDetection++;
                }
            }
            if (counterForPrimeDetection == 2 && number % i == 0) {
                primeNumber = i;
            } else if (counterForPrimeDetection == 1 && number % i == 0)
                primeNumber = i;
        }
        if (number % primeNumber == 0) {
            maxPrimeNumber = primeNumber;
        }
        return maxPrimeNumber;
    }
}
