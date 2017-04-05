package com.viewfromthecodeface.hexagonal;

import com.viewfromthecodeface.hexagonal.adapters.ConsoleDisplay;
import com.viewfromthecodeface.hexagonal.adapters.KeyboardGuesses;
import com.viewfromthecodeface.hexagonal.domain.Display;
import com.viewfromthecodeface.hexagonal.domain.Guesses;
import com.viewfromthecodeface.hexagonal.domain.HexagonalGuessMyNumber;

public class Game {
    public static void main ( String[] commandLineArguments ){

        Display display = new ConsoleDisplay();
        Guesses guesses = new KeyboardGuesses();

        new HexagonalGuessMyNumber(3, guesses, display).play();
    }
}
