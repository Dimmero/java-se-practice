package Section_5.Exercises.FlourPackProblem;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal ){
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int howMuchBigInGoal = goal / 5;
        int howMuchBigUsed = Math.min(howMuchBigInGoal, bigCount);
        int remainingAfterUsingBig = goal - howMuchBigUsed * 5;
        return remainingAfterUsingBig <= smallCount;
    }
}

