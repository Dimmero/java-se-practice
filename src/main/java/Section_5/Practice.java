package Section_5;

public class Practice {
    private int height;

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(100);
        StringBuilder stringBuilder2 = new StringBuilder("My name is ");
        stringBuilder2.append("Dima and it's nice to meet you");
//        System.out.println(stringBuilder2);
        stringBuilder2.insert(stringBuilder2.length()," here again");
        System.out.println( stringBuilder2);

//        String name = "Dima";
//        String name1 = new String("Alex");
//        char[] nameByChars = new char[]{' ','d'};
//        String stringFromArr = new String(nameByChars);


//        Practice practice = new Practice();
//        practice.height = 13;
//        System.out.println(practice.getHeight());
//
//        Button button = new Button(1, "Dima");

//        System.out.println("10000 at 2% interest " + calculateInterest(10000, 2));
//        System.out.println("10000 at 3% interest " + calculateInterest(10000, 3));
//        System.out.println("10000 at 4% interest " + calculateInterest(10000, 4));
//        System.out.println("10000 at 5% interest " + calculateInterest(10000, 5));

//        for (int i = 100; i < 200; i++) {
//            double calculatedInterest = calculateInterest(10000, i);
//            System.out.println("10000 at " + i + " % interest = " + String.format("%.3f", calculatedInterest));
//        }
//        int counter = 0;
//        for (int i = 1000; i < 5000; i++) {
//            if (isPrime(i)) {
//                counter++;
//                System.out.println(i + " is a prime number");
//                if (counter == 30)
//                    break;
//            }
//        }
//    }
//
//    public static boolean isPrime(int n) {
//        if (n == 0 || n == 1) {
//            return false;
//        }
//        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static double calculateInterest(double amount, double interestRate) {
//        return (amount * (interestRate / 100));
//    }
    }
}
