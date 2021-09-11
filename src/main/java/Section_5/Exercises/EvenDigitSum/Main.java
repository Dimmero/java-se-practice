package Section_5.Exercises.EvenDigitSum;

public class Main {
    public static void main(String[] args) {
        int evenDigitSum = EvenDigitSum.getEvenDigitSum(-1);
        System.out.println("The sum is " + evenDigitSum);
        int evenDigitSum1 = EvenDigitSum.getEvenDigitSum(123);
        System.out.println("The sum is " + evenDigitSum1);
        int evenDigitSum2 = EvenDigitSum.getEvenDigitSum(246);
        System.out.println("The sum is " + evenDigitSum2);

    }
}
