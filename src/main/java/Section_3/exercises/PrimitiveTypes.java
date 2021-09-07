package Section_3.exercises;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value " + myMinIntValue);
        System.out.println("Integer maximum value " + myMaxIntValue);
        System.out.println("Busted MAX value " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value " + myMinByteValue);
        System.out.println("Byte maximum value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value " + myMinShortValue);
        System.out.println("Short maximum value " + myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value " + myMinLongValue);
        System.out.println("Long maximum value " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinByteValue / 2);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myMinFloatValue);
        System.out.println("Float maximum value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value " + myMinDoubleValue);
        System.out.println("Double maximum value " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOwerTwentyOne = true;



    }
}
