package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SevenBoomShTest {
    @Test
    public void test1() {
        assertEquals(SevenBoomSh.findSeven(new String[]{"1", "2", "3", "4", "5", "6", "7"}), "Boom");
    }

    @Test
    public void test2() {
        assertEquals(SevenBoomSh.findSeven(new String[]{"8", "6", "33", "100"}), "there is no 7 in the array");
    }
    @Test
    public void test3() {
        assertEquals(SevenBoomSh.findSeven(new String[]{"2", "55", "60", "97", "86"}), "Boom");
    }
}
