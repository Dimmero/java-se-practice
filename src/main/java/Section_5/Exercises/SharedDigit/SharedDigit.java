package Section_5.Exercises.SharedDigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || x > 99){
            return false;
        } else if (y < 10 || y > 99){
            return false;
        }
        int remainNumberForX = 0;
        int remainNumberForY = 0;

        while (x != 0){
            int duplicateY = y;
            remainNumberForX = x % 10;
            x /= 10;
            while(duplicateY != 0){
                remainNumberForY = duplicateY % 10;
                duplicateY /= 10;
                if (remainNumberForX == remainNumberForY){
                    return true;
                }
            }
        }
        return false;
    }
}
