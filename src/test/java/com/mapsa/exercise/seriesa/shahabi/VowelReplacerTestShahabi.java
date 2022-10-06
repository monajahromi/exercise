package com.mapsa.exercise.seriesa.shahabi;

import com.mapsa.exercise.seriesa.g.VowelReplacerShahabi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelReplacerTestShahabi {
    @Test
    public void test1() {
        assertEquals("th# ##rdv#rk", VowelReplacerShahabi.replaceVowels("the aardvark", '#'));
    }

    @Test
    public void test2() {
        assertEquals("m?nn?? m??s?", VowelReplacerShahabi.replaceVowels("minnie mouse", '?'));
    }

    @Test
    public void test3() {
        assertEquals("sh*k*sp**r*", VowelReplacerShahabi.replaceVowels("shakespeare", '*'));
    }

    @Test
    public void test4() {
        assertEquals("<ll <s f<<r <n l<v< <nd w<r", VowelReplacerShahabi.replaceVowels("all is fair in love and war", '<'));
    }
}