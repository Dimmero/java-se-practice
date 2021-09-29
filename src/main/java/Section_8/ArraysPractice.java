package Section_8;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArraysPractice {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaar");
        linkedList.add("");
        linkedList.add("rary");
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            int comparison = iterator.next().compareTo(linkedList.get(1));
            System.out.println(comparison);
        }



        System.out.println("You're creating an array of integers, please provide it's length: ");
        int[] arrayOfInt = getIntegers(scanner.nextInt());

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.printf("%d element is %d and %d has been printed out %n", i + 1, arrayOfInt[i], arrayOfInt[i]);
        }
        double averageOfArray = getAverage(arrayOfInt);
        System.out.printf("The average of your array is %.2f %n", averageOfArray);
    }

    public static int[] getIntegers(int sizeOfArray){
        System.out.println("You've just created array of " + sizeOfArray + " integers. Now please fill it in with the numbers:");

        int[] arrayOfNumbers = new int[sizeOfArray];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        return arrayOfNumbers;
    }

    public static double getAverage(int [] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / 2;
    }
}
