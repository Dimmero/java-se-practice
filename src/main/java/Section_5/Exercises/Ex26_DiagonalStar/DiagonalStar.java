package Section_5.Exercises.Ex26_DiagonalStar;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i ; j--) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
