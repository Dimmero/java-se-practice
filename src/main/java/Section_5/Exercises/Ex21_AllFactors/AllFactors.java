package Section_5.Exercises.Ex21_AllFactors;

public class AllFactors {
    public static void printFactors(int number){
        if (number < 1)
            System.out.println("Invalid Value");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
    }
}
