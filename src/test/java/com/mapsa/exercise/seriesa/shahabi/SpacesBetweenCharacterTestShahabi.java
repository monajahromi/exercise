package com.mapsa.exercise.seriesa.shahabi;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacterShahabi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacesBetweenCharacterTestShahabi {
    @Test
    public void test1() {
        assertEquals("s p a c e", SpacesBetweenCharacterShahabi.spaceMeOut("space"));
    }

    @Test
    public void test2() {
        assertEquals("f a r   o u t", SpacesBetweenCharacterShahabi.spaceMeOut("far out"));
    }

    @Test
    public void test3() {
        assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacterShahabi.spaceMeOut("elongated musk"));
    }

    @Test
    public void test4() {
        assertEquals("l o n g", SpacesBetweenCharacterShahabi.spaceMeOut("long"));
    }

    @Test
    public void test5() {
        assertEquals("1 2 3", SpacesBetweenCharacterShahabi.spaceMeOut("123"));
    }

    @Test
    public void test6() {
        assertEquals("a 1 b 2 c 3", SpacesBetweenCharacterShahabi.spaceMeOut("a1b2c3"));
    }
}