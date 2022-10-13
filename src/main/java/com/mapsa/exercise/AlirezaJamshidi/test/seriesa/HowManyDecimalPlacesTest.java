package com.mapsa.exercise.AlirezaJamshidi.test.seriesa;

import com.mapsa.exercise.AlirezaJamshidi.seriesa.d.HowManyDecimalPlaces;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyDecimalPlacesTest {

    @Test
    public void test1() {
        assertEquals(2, HowManyDecimalPlaces.getDecimalPlaces("3.22"));
    }

    @Test
    public void test2() {
        assertEquals(0, HowManyDecimalPlaces.getDecimalPlaces("400"));
    }

    @Test
    public void test3() {
        assertEquals(2, HowManyDecimalPlaces.getDecimalPlaces("43.50"));
    }

    @Test
    public void test4() {
        assertEquals(0, HowManyDecimalPlaces.getDecimalPlaces("100,000,000"));
    }

    @Test
    public void test5() {
        assertEquals(4, HowManyDecimalPlaces.getDecimalPlaces("3.1415"));
    }

    @Test
    public void test6() {
        assertEquals(0, HowManyDecimalPlaces.getDecimalPlaces("0"));
    }

    @Test
    public void test7() {
        assertEquals(0, HowManyDecimalPlaces.getDecimalPlaces("01"));
    }

    @Test
    public void test8() {
        assertEquals(5, HowManyDecimalPlaces.getDecimalPlaces("00010.00010"));
    }

    @Test
    public void test9() {
        assertEquals(3, HowManyDecimalPlaces.getDecimalPlaces("3,141.592"));
    }
}