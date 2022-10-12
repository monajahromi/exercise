package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.g.PalindromeWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeWordTest {
    @Test
    public void test1() {
        assertEquals(PalindromeWord.isPalindrome("a"),true);
    }

    @Test
    public void test2() {
        assertEquals(PalindromeWord.isPalindrome("aba"),true);
    }

    @Test
    public void test3() {
        assertEquals(PalindromeWord.isPalindrome("abb"),false);
    }

    @Test
    public void test4() {
        assertEquals(PalindromeWord.isPalindrome("madam"),true);
    }

    @Test
    public void test5() {
        assertEquals(PalindromeWord.isPalindrome("ABCCBA"),true);
    }

    @Test
    public void test6() {
        assertEquals(PalindromeWord.isPalindrome("madam'"),false);
    }
}
