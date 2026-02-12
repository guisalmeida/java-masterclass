package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value: " + myMinValue);
        System.out.println("Integer maximum value: " + myMaxValue);

        System.out.println("Busted maximum value = " + (myMaxValue + 1));
        System.out.println("Busted minimum value = " + (myMinValue - 1));

        // We can add underscore to differentiate the decimal values:
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

        long myLongValue = 100L;
        long bigLongValue = myMaxIntTest * myLongValue;
        System.out.println("Long bigLongValue value: " + bigLongValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);
    }
}