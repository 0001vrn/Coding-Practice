package com.varun;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateIPv4Test {

    @Test
    public void isValidNum() {
    }

    @Test
    public void isValidIP() {
        ValidateIPv4 iPv4 = new ValidateIPv4();
        boolean res = iPv4.isValidIP("222.111.111.111");
        assertEquals(res, true);
    }
}