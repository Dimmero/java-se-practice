package Section_6.Exercises.Ex29_SumCalculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(50);
        calculator.setSecondNumber(14);
        System.out.printf("Add = %.2f %n", calculator.getAdditionResult());
        System.out.printf("Subtract = %.2f %n", calculator.getSubtractionResult());
        System.out.printf("Multiply = %.2f %n", calculator.getMultiplicationResult());
        System.out.printf("Divide = %.2f %n", calculator.getDivisionResult());
    }


}
