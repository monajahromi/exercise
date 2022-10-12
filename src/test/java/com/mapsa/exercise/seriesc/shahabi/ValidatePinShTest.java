package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatePinShTest {
    @Test
    public void test1() {
        assertEquals(ValidatePinSh.isDigit("121317"), true);
    }
    @Test
    public void test2() {
        assertEquals(ValidatePinSh.isDigit("1234"), true);
    }
    @Test
    public void test4() {
        assertEquals(ValidatePinSh.isDigit("89abc1"), false);
    }
    @Test
    public void test5() {
        assertEquals(ValidatePinSh.isDigit("900876"), true);
    }
}
