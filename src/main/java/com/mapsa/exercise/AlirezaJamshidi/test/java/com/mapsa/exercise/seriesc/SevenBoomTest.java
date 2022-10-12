package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.a.SevenBoom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SevenBoomTest {
    @Test
    public void test1() {
        assertEquals(SevenBoom.sevenBoom(new int[]{}), "There Is NO 7 In Array!");
    }

    @Test
    public void test2() {
        assertEquals(SevenBoom.sevenBoom(new int[]{7}), "Boom!");
    }

    @Test
    public void test3() {
        assertEquals(SevenBoom.sevenBoom(new int[]{3, 2, 7, 977}), "Boom!");
    }

    @Test
    public void test4() {
        assertEquals(SevenBoom.sevenBoom(new int[]{3, 2, 972, 8}), "Boom!");
    }

    @Test
    public void test5() {
        assertEquals(SevenBoom.sevenBoom(new int[]{3, 2, 8, 8}), "There Is NO 7 In Array!");
    }
}
