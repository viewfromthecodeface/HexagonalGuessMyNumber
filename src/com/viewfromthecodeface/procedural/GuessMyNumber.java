package com.viewfromthecodeface.procedural;

import java.util.Scanner;

public class GuessMyNumber {
    private final int numberToGuess;

    public GuessMyNumber(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void play() {
        displayIntroduction();
        boolean guessedCorrectly = givePlayerUpToFiveAttemptsToGuess();
        displayFinalResult(guessedCorrectly);
    }

    private boolean givePlayerUpToFiveAttemptsToGuess() {
        int attemptNumber = 1;
        boolean guessedCorrectly = false;

        while ( attemptNumber <= 5 && !guessedCorrectly){
            int latestGuess = readIntegerFromKeyboard(attemptNumber);

            if ( latestGuess == numberToGuess ){
                guessedCorrectly = true ;
            }
            else {
                display("Try again");
            }

            attemptNumber++;
        }

        return guessedCorrectly;
    }

    private void displayIntroduction() {
        display("I'm thinking of a number between 1 and 10.");
        display("Can you guess it, in five guesses?");
    }

    private void displayFinalResult(boolean guessedCorrectly) {
        if ( guessedCorrectly ) {
            display("You guessed it! Spooky. Or a good use of binary search...");
        }
        else {
            display("Bad luck. If there's nothing on Netflix, you could try again");
        }
    }

    private int readIntegerFromKeyboard(int attemptNumber) {
        display( String.format("Your Guess? (attempt %d) > ", attemptNumber));

        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

    private void display( String text ) {
        System.out.println(text);
    }
}
