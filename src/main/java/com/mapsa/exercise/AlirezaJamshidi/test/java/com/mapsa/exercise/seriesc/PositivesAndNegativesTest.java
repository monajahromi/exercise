package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.l.PositivesAndNegatives;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositivesAndNegativesTest {
    @Test
    public void test1() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{}), true);
    }

    @Test
    public void test2() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{11}), true);
    }

    @Test
    public void test3() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{11, -2, 88, -9}), true);
    }


    @Test
    public void test4() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{11, -2, 88, -9, -7}), false);
    }

    @Test
    public void test5() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{-11, 2, -88, 9}), true);
    }

    @Test
    public void test6() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{-11, 2, -88, 9, -94}), true);
    }

    @Test
    public void test7() {
        assertEquals(PositivesAndNegatives.alternateSign(new int[]{-11, 2, -88, -9, -94}), false);
    }
}
