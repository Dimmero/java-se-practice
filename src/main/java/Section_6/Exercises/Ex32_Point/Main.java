package Section_6.Exercises.Ex32_Point;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.printf("distance(0,0)= %.15f %n",first.distance());
        System.out.printf("distance(second)= %.1f %n",first.distance(second));
        System.out.printf("distance(2,2)= %.1f %n",first.distance(2,2));
        Point point = new Point();
        System.out.printf("distance()= %.1f %n",point.distance());
    }
}
