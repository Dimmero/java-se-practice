package Section4.exercises.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (temperature >= 25 && temperature <= 35){
            return true;
        }else return summer && temperature - 10 >= 25 && temperature - 10 <= 35;
    }
}
