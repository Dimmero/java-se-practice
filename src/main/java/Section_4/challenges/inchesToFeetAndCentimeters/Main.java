package Section_4.challenges.inchesToFeetAndCentimeters;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Dima", 100);
        System.out.println("New score is " + newScore);
        calculateScore();
        calcFeetAndInchesToCentimeters(0, 12);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed Player scored, no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) && ((inches >= 0) && (inches > 12))) {
            return -1;
        } else {
            System.out.println(feet * 30.48 + inches * 2.54 + " cm");
            return feet * 30.48 + inches * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet =  inches / 12;
        double remainingInches =  inches % 12;
        System.out.println(inches + " and " + feet + " and " + remainingInches );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
