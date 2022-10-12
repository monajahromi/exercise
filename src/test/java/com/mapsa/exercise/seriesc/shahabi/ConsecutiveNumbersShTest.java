package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersShTest {
    @Test
    public void test1() {
        assertEquals(ConsecutiveNumbersSh.checkConsecutive(new int[]{5,1,4,3,2}), true);
    }
    @Test
    public void test2() {
        assertEquals(ConsecutiveNumbersSh.checkConsecutive(new int[]{5,1,4,3,2,8}), false);
    }
    @Test
    public void test3() {
        assertEquals(ConsecutiveNumbersSh.checkConsecutive(new int[]{5,6,7,8,9,9}), false);
    }
}
