package com.guisalmeida.methods;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is:" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next high score is:" + calculateScore(gameOver, score, levelCompleted, bonus));

        System.out.println("calculateHighScorePosition is:" + calculateHighScorePosition(1500));
        System.out.println("calculateHighScorePosition is:" + calculateHighScorePosition(1000));
        System.out.println("calculateHighScorePosition is:" + calculateHighScorePosition(500));
        System.out.println("calculateHighScorePosition is:" + calculateHighScorePosition(100));
        System.out.println("calculateHighScorePosition is:" + calculateHighScorePosition(25));
    }

    public static int calculateScore(int score){
        System.out.println("Player scored" + score + "points");
        return score * 1000;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

