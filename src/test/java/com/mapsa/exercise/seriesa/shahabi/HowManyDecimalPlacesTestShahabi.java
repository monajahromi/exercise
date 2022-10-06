package com.mapsa.exercise.seriesa.shahabi;

import com.mapsa.exercise.seriesa.d.HowManyDecimalPlacesShahabi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyDecimalPlacesTestShahabi {

    @Test
    public void test1() {
        assertEquals(2, HowManyDecimalPlacesShahabi.getDecimalPlaces("3.22"));
    }

    @Test
    public void test2() {
        assertEquals(0, HowManyDecimalPlacesShahabi.getDecimalPlaces("400"));
    }

    @Test
    public void test3() {
        assertEquals(2, HowManyDecimalPlacesShahabi.getDecimalPlaces("43.50"));
    }

    @Test
    public void test4() {
        assertEquals(0, HowManyDecimalPlacesShahabi.getDecimalPlaces("100,000,000"));
    }

    @Test
    public void test5() {
        assertEquals(4, HowManyDecimalPlacesShahabi.getDecimalPlaces("3.1415"));
    }

    @Test
    public void test6() {
        assertEquals(0, HowManyDecimalPlacesShahabi.getDecimalPlaces("0"));
    }

    @Test
    public void test7() {
        assertEquals(0, HowManyDecimalPlacesShahabi.getDecimalPlaces("01"));
    }

    @Test
    public void test8() {
        assertEquals(5, HowManyDecimalPlacesShahabi.getDecimalPlaces("00010.00010"));
    }

    @Test
    public void test9() {
        assertEquals(3, HowManyDecimalPlacesShahabi.getDecimalPlaces("3,141.592"));
    }
}