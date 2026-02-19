package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false) {
             System.out.println("It is not an alien");   
        }

        int topScore = 90;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("You got the second high score!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true!");
        }


    }
}