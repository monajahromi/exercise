package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.b.NumberedCards;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberedCardsTest {
    @Test
    public void test1() {
        assertEquals(NumberedCards.winRound(new int[]{1, 2, 7, 7}, new int[]{5, 7}), true);
    }

    @Test
    public void test2() {
        assertEquals(NumberedCards.winRound(new int[]{7}, new int[]{5, 7}), false);
    }

    @Test
    public void test3() {
        assertEquals(NumberedCards.winRound(new int[]{1, 2, 4, 7}, new int[]{5}), true);
    }

    @Test
    public void test4() {
        assertEquals(NumberedCards.winRound(new int[]{1}, new int[]{}), true);
    }

    @Test
    public void test5() {
        assertEquals(NumberedCards.winRound(new int[]{}, new int[]{}), false);
    }
}
