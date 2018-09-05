package com.varun;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCombinationTest {

    @Test
    public void combination() {
        StringCombination c = new StringCombination();
        c.combination("abc".toCharArray());
    }
}