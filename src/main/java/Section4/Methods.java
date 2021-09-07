package Section4;

public class Methods {
    public static void main(String[] args) {
        String Name1 = "Dima";
        String Name2 = "Karol";
        String Name3 = "Kornel";
        String Name4 = "Alex";
        String[] arrayPlayers = {Name1, Name2, Name3, Name4};

        int highScore1 = 1500;
        int highScore2 = 900;
        int highScore3 = 400;
        int highScore4 = 50;
        int[] arrayScores = {highScore1, highScore2, highScore3, highScore4};

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highScore);
//
//        int newHighScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + newHighScore);

        int counter = 0;
        for (int score : arrayScores
        ) {
            int scorePosition = calculateHighScorePosition(score);
            StringBuffer displayPosition = displayHighScorePosition(arrayPlayers[counter], scorePosition);
            counter++;
            System.out.println(displayPosition);
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static StringBuffer displayHighScorePosition(String player, int position) {
        StringBuffer displayPosition = new StringBuffer();
        displayPosition.append(player)
                .append(" managed to get into position ")
                .append(position)
                .append(" on the high score table");
        return displayPosition;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500 && score < 1000)
            return 2;
        else if (score >= 100 && score < 500)
            return 3;
        else
            return 4;
    }
}


