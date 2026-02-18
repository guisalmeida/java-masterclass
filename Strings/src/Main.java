public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";

        System.out.println("myString:"+ myString);

        myString = myString + ", more text";

        System.out.println("new myString:"+ myString);

        myString = myString + ". \u00A9 2026";

        System.out.println("final myString:"+ myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString with int:" + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString with double:" + lastString);
    }
}
