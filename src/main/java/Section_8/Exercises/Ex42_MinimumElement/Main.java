package Section_8.Exercises.Ex42_MinimumElement;

public class Main {
    public static void main(String[] args) {
        int arraySize = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(arraySize);
        int minInteger = MinimumElement.findMin(array);
        System.out.printf("The minimum integer from array is %d", minInteger);
    }
}
