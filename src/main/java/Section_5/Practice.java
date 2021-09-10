package Section_5;

public class Practice {
    public static void main(String[] args) {
//        System.out.println("10000 at 2% interest " + calculateInterest(10000, 2));
//        System.out.println("10000 at 3% interest " + calculateInterest(10000, 3));
//        System.out.println("10000 at 4% interest " + calculateInterest(10000, 4));
//        System.out.println("10000 at 5% interest " + calculateInterest(10000, 5));

//        for (int i = 100; i < 200; i++) {
//            double calculatedInterest = calculateInterest(10000, i);
//            System.out.println("10000 at " + i + " % interest = " + String.format("%.3f", calculatedInterest));
//        }
        int counter = 0;
        for (int i = 1000; i < 5000; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println(i + " is a prime number");
                if (counter == 30)
                    break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
