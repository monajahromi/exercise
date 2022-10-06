package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacter;

public class SpacesBetweenCharacterTest {
    @Test
    public void test1() {
        assertEquals("s p a c e", SpacesBetweenCharacter.spaceMeOut("space"));
    }

    @Test
    public void test2() {
        assertEquals("f a r   o u t", SpacesBetweenCharacter.spaceMeOut("far out"));
    }

    @Test
    public void test3() {
        assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacter.spaceMeOut("elongated musk"));
    }

    @Test
    public void test4() {
        assertEquals("l o n g", SpacesBetweenCharacter.spaceMeOut("long"));
    }

    @Test
    public void test5() {
        assertEquals("1 2 3", SpacesBetweenCharacter.spaceMeOut("123"));
    }

    @Test
    public void test6() {
        assertEquals("a 1 b 2 c 3", SpacesBetweenCharacter.spaceMeOut("a1b2c3"));
    }
}