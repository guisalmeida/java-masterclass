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
        // int myMaxIntTest = 2_147_483_647;

        int myMinByteValue = Byte.MIN_VALUE;
        int myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        int myMinShortValue = Short.MIN_VALUE;
        int myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);
    }
}