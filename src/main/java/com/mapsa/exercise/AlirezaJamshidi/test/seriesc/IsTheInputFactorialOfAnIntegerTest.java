package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.h.IsTheInputFactorialOfAnInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsTheInputFactorialOfAnIntegerTest {
    @Test
    public void test1() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(1), true);
    }

    @Test
    public void test2() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(0), false);
    }

    @Test
    public void test3() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(-24), false);
    }

    @Test
    public void test4() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(24), true);
    }

    @Test
    public void test5() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(720), true);
    }

    @Test
    public void test6() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(5040), true);
    }

    @Test
    public void test7() {
        assertEquals(IsTheInputFactorialOfAnInteger.isFactorial(11), false);
    }
}
