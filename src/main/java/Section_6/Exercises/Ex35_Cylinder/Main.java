package Section_6.Exercises.Ex35_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.printf("circle.radius= %.2f %n",circle.getRadius());
        System.out.printf("circle.area= %.10f %n",circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.printf("cylinder.area= %.10f %n",cylinder.getArea());
        System.out.printf("cylinder.volume= %.10f %n",cylinder.getVolume());
    }
}
