package Section4;

public class Methods {

public static void main(String[] args) {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    calculateScore();

    boolean newGameOver = true;
    int newScore = 10000;
    int newLevelCompleted = 8;
    int newBonus = 200;

    if (newGameOver){
        int newFinalScore = newScore + (newLevelCompleted * newBonus);
        System.out.println("Your final score is " + newFinalScore);
    }

}
    public static void calculateScore(){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    }


