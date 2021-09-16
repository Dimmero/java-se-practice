package Section_6.Exercises.Ex34_ComplexOperations;

public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.printf("one.real= %.1f %n", one.getReal());
        System.out.printf("one.imaginary= %.1f %n", one.getImaginary());
        one.subtract(number);
        System.out.printf("one.real= %.1f %n", one.getReal());
        System.out.printf("one.imaginary= %.1f %n", one.getImaginary());
        number.subtract(one);
        System.out.printf("number.real= %.1f %n", number.getReal());
        System.out.printf("number.imaginary= %.1f %n", number.getImaginary());
    }
}
