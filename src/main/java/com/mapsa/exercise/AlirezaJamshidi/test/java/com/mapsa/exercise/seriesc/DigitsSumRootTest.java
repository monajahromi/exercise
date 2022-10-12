package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.m.DigitsSumRoot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitsSumRootTest {
    @Test
    public void test1() {
        assertEquals(DigitsSumRoot.digitroot(123), 6);
    }

    @Test
    public void test2() {
        assertEquals(DigitsSumRoot.digitroot(129), 3);
    }

    @Test
    public void test3() {
        assertEquals(DigitsSumRoot.digitroot(-129), 3);
    }

    @Test
    public void test4() {
        assertEquals(DigitsSumRoot.digitroot(0), 0);
    }

    @Test
    public void test5() {
        assertEquals(DigitsSumRoot.digitroot(-8), 8);
    }
}
