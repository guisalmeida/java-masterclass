package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value: " + myMinValue);
        System.out.println("Integer maximum value: " + myMaxValue);

        System.out.println("Busted maximum value = " + (myMaxValue + 1));
        System.out.println("Busted minimum value = " + (myMinValue - 1));

        // We can add underscore to differentiate the decimal values:
        int myMaxIntTest = 2_147_483_647;
    }
}