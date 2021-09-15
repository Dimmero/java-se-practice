package Section_5.Exercises.Ex17_EvenDigitSum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while(number != 0){
            int remainNumber = number % 10;
//            if (EvenNumber.isEvenNumber(remainNumber))
            if (number % 2 == 0) {
                sum += remainNumber;
            }
            number /= 10;
        }
        return sum;
    }
}
