package com.varun;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationTest {

    @Test
    public void permute() {
        StringPermutation sp = new StringPermutation();
        sp.permute("AABC".toCharArray()).forEach(s -> System.out.println(s));
    }
}