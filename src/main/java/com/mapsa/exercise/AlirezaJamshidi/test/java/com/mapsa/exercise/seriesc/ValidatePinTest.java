package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.d.ValidatePin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatePinTest {
    @Test
    public void test1() {
        assertEquals(ValidatePin.validate("123454"), true);
    }

    @Test
    public void test2() {
        assertEquals(ValidatePin.validate("1 3454"), false);
    }

    @Test
    public void test3() {
        assertEquals(ValidatePin.validate(" 13454"), false);
    }

    @Test
    public void test4() {
        assertEquals(ValidatePin.validate("13454 "), false);
    }

    @Test
    public void test5() {
        assertEquals(ValidatePin.validate("13454c"), false);
    }

    @Test
    public void test6() {
        assertEquals(ValidatePin.validate("1345"), true);
    }

    @Test
    public void test7() {
        assertEquals(ValidatePin.validate(".1349"), false);
    }

    @Test
    public void test8() {
        assertEquals(ValidatePin.validate("134.9"), false);
    }
}
