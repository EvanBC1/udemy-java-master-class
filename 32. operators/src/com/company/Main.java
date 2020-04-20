package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;
        String player = "Evan";

        calculateScore(gameOver, score, levelCompleted, bonus, player);

        score = 900;
        levelCompleted = 0;
        bonus = 0;

        calculateScore(gameOver, score, levelCompleted, bonus, player);

        score = 400;
        levelCompleted = 0;
        bonus = 0;

        calculateScore(gameOver, score, levelCompleted, bonus, player);

        score = 50;
        levelCompleted = 0;
        bonus = 0;

        calculateScore(gameOver, score, levelCompleted, bonus, player);


    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, String player) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            displayHighScorePosition(player, finalScore);
        }
        return -1;
    }
    public static void displayHighScorePosition (String player, int highScore) {
        int rank;
        if (highScore >= 1000) {
            rank = 1;
        } else if (highScore >= 500) {
            rank = 2;
        } else if (highScore >= 100) {
            rank = 3;
        } else {
            rank = 4;
        }
        System.out.println(player + " you scored " + highScore + " receiving rank " + rank);
    }
}
