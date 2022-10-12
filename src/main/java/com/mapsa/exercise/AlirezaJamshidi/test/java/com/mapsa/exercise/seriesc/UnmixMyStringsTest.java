package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.o.UnmixMyStrings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnmixMyStringsTest {
    @Test
    public void test1() {
        assertEquals(UnmixMyStrings.unmix(""), "");
    }

    @Test
    public void test2() {
        assertEquals(UnmixMyStrings.unmix("a"), "a");
    }

    @Test
    public void test3() {
        assertEquals(UnmixMyStrings.unmix("si"), "is");
    }

    @Test
    public void test4() {
        assertEquals(UnmixMyStrings.unmix("htsii s"), "this is");
    }

    @Test
    public void test5() {
        assertEquals(UnmixMyStrings.unmix("ababab"), "bababa");
    }

    @Test
    public void test6() {
        assertEquals(UnmixMyStrings.unmix("abababa"), "bababaa");
    }
}
