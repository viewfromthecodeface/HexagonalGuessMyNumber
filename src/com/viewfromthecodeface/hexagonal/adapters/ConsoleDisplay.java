package com.viewfromthecodeface.hexagonal.adapters;

import com.viewfromthecodeface.hexagonal.domain.Display;

public class ConsoleDisplay implements Display {
    @Override
    public void show(String text) {
        System.out.print(text);
    }
}
