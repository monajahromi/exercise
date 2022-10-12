package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarshadNumberShTest {
    @Test
    public void test1() {
        assertEquals(HarshadNumberSh.checkHash(75),false);
    }
    @Test
    public void test2() {
        assertEquals(HarshadNumberSh.checkHash(171),true);
    }
    @Test
    public void test3() {
        assertEquals(HarshadNumberSh.checkHash(481),true);
    }
    @Test
    public void test4() {
        assertEquals(HarshadNumberSh.checkHash(89),false);
    }
    @Test
    public void test5() {
        assertEquals(HarshadNumberSh.checkHash(516),true);
    }
    @Test
    public void test6() {
        assertEquals(HarshadNumberSh.checkHash(200),true);
    }

}
