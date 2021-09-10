package Section_5.Challenges.EvenNumber;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int counter = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            counter++;
            System.out.println("Even number " + number);
            if (counter == 5){
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
