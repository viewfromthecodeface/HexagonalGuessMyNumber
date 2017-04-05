package com.viewfromthecodeface.hexagonal.adapters;

import com.viewfromthecodeface.hexagonal.domain.Guesses;

import java.util.Scanner;

public class KeyboardGuesses implements Guesses {
    @Override
    public int latestGuess() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
