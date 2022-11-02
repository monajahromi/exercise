package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.e.FilterRepeatingCharacter;
import com.mapsa.exercise.stream.h.NumbersInStrings;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumbersInStringsJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"1a","2b"},
                NumbersInStrings.numbersInStrings(new String[]{"1a", "a","2b","b"}));
    }


    @Test
    public void test2() {
        assertArrayEquals(new String[]{"abc10"},
                NumbersInStrings.numbersInStrings(new String[]{"abc", "abc10"}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{"ab10c","a10bc"},
                NumbersInStrings.numbersInStrings(new String[]{"abc", "ab10c","a10bc","bcd"}));
    }


    @Test
    public void test4() {
        assertArrayEquals(new String[]{"test1"},
                NumbersInStrings.numbersInStrings(new String[]{"this is a test", "test1"}));
    }


}
