package Section_4.exercises.Ex8_AreaCalculator;

public class Main {
    public static void main(String[] args) {
        double areaResult1 = AreaCalculator.area(5.0);
        double areaResult2 = AreaCalculator.area(-1);
        double areaResult3 = AreaCalculator.area(5.0, 4.0);
        double areaResult4 = AreaCalculator.area(-1.0, 4.0);

        System.out.println("The area is " + areaResult1 );
        System.out.println("The area is " + areaResult2 );
        System.out.println("The area is " + areaResult3 );
        System.out.println("The area is " + areaResult4 );

    }
}
