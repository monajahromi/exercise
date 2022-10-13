package com.mapsa.exercise.AlirezaJamshidi.test.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.f.ConsecutiveNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersTest {
    @Test
    public void test1() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{}), true);
    }

    @Test
    public void test2() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{5}), false);
    }

    @Test
    public void test3() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{1}), true);
    }

    @Test
    public void test4() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{5, 1, 4, 3, 2}), true);
    }

    @Test
    public void test5() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{5, 1, 4, 3, 2, 8}), false);
    }

    @Test
    public void test6() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{5, 6, 7, 8, 9, 9}), false);
    }

    @Test
    public void test7() {
        assertEquals(ConsecutiveNumbers.cons(new int[]{9, 6, 7, 8, 5}), true);
    }
}
