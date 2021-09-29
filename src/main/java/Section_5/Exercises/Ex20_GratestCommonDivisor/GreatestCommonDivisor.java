package Section_5.Exercises.Ex20_GratestCommonDivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int maxDivisor = 0;
//        if ( first < 10 || second < 10 ){
//            return -1;
//        }
//        int smallerNumber = 0;
//        if (Integer.MAX_VALUE - first > Integer.MAX_VALUE - second)
//            smallerNumber = first;
//        else smallerNumber = second;
        for (int i = 1; i <= getSmallerNumber(first, second); i++) {
            if ( first % i == 0 && second % i == 0 && i > maxDivisor){
                maxDivisor = i;
            }
        }
        return maxDivisor;
    }

    public static int getSmallerNumber(int first, int second){
        if ( first < 10 || second < 10 ){
            return -1;
        }
        if (Integer.MAX_VALUE - first > Integer.MAX_VALUE - second)
            return first;
        else return second;
    }
}
