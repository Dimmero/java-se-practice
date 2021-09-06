package Section_3.challenges;

public class PrimitiveTypesChallenge28 {
    public static void main(String[] args) {
        byte testByte = 5;
        short testShort = 32000;
        int testInt = 100200300;
        long testLong = 50000L + 10L * (testByte + testShort + testInt);
        System.out.println(testLong);
    }
}
