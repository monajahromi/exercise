package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeWordShTest {
    @Test
    public void test1() {
        assertEquals(PalindromeWordSh.isPalindrome("madam", 0), true);
    }
    @Test
    public void test2() {
        assertEquals(PalindromeWordSh.isPalindrome("adieu", 0), false);
    }
    @Test
    public void test3() {
        assertEquals(PalindromeWordSh.isPalindrome("rotor", 0), true);
    }
}
