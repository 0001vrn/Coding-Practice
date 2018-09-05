package com.varun;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintPatternTest {

    @Test
    public void printForN() {
        PrintPattern printPattern = new PrintPattern();
        printPattern.printForN(3);
        printPattern.printForN(4);
    }
}