package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.k.HarshedNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarshedNumberTest {
    @Test
    public void test1() {
        assertEquals(HarshedNumber.isHarshed(1), true);
    }

    @Test
    public void test2() {
        assertEquals(HarshedNumber.isHarshed(171), true);
    }

    @Test
    public void test3() {
        assertEquals(HarshedNumber.isHarshed(71), false);
    }

    @Test
    public void test4() {
        assertEquals(HarshedNumber.isHarshed(-171), true);
    }

    @Test
    public void test5() {
        assertEquals(HarshedNumber.isHarshed(555), true);
    }
}
