package com.varun;

import org.junit.Test;

import static org.junit.Assert.*;

public class MostFrequentWordTest {

    @Test
    public void getMostFrequentWord() {
        MostFrequentWord mostFrequentWord = new MostFrequentWord();

        String result = mostFrequentWord.getMostFrequentWord("geeks for geeks");

        assertEquals("geeks",result);
    }
}