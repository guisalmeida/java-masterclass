
public class Main {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("myMinFloat:" + myMinFloat);
        System.out.println("myMaxFloat:" + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("myMinDouble:" + myMinDouble);
        System.out.println("myMaxDouble:" + myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue:" + myIntValue);
        System.out.println("myFloatValue:" + myFloatValue);
        System.out.println("myDoubleValue:" + myDoubleValue);
    }
}