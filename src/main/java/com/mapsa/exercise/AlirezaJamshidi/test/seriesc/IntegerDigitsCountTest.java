package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.e.IntegerDigitsCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerDigitsCountTest {
    @Test
    public void test1() {
        assertEquals(IntegerDigitsCount.count(0), 1);
    }

    @Test
    public void test2() {
        assertEquals(IntegerDigitsCount.count(11), 2);
    }

    @Test
    public void test3() {
        assertEquals(IntegerDigitsCount.count(195), 3);
    }

    @Test
    public void test4() {
        assertEquals(IntegerDigitsCount.count(-187), 3);
    }
}
