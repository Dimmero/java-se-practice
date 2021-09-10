package Section_5.Challenges.Sum3And5;

public class Sum3And5 {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i < 1000 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum += i;
                counter++;
                if (counter == 5)
                    break;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
