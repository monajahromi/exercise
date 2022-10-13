package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.i.ArraySum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySumTest {
    @Test
    public void test1() {
        assertEquals(ArraySum.sum(new int[]{}), 0);
    }

    @Test
    public void test2() {
        assertEquals(ArraySum.sum(new int[]{1, 2, 3}), 6);
    }

    @Test
    public void test3() {
        assertEquals(ArraySum.sum(new int[]{3}), 3);
    }

    @Test
    public void test4() {
        assertEquals(ArraySum.sum(new int[]{3, -88, 15}), -70);
    }
}
