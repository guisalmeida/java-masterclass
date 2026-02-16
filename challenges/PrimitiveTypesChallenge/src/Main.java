//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte validbyte = 100;
        short validShort = 30000;
        int validInt = 100000;
        long validLong = (50000L + (validbyte + validShort + validInt) * 10L);
        System.out.println("Result of the challenge:" + validLong);
    }
}