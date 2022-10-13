package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.c.LargestGap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestGapTest {
    @Test
    public void test1() {
        assertEquals(LargestGap.largestGap(new int[]{}), 0);
    }

    @Test
    public void test2() {
        assertEquals(LargestGap.largestGap(new int[]{1}), 1);
    }

    @Test
    public void test3() {
        assertEquals(LargestGap.largestGap(new int[]{1, 3}), 2);
    }

    @Test
    public void test4() {
        assertEquals(LargestGap.largestGap(new int[]{1, 3, 4, 12, 8, 9}), 4);
    }

    @Test
    public void test5() {
        assertEquals(LargestGap.largestGap(new int[]{1, -7, 4, 12, 8, 9}), 8);
    }
}
