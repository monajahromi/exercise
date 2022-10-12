package com.mapsa.exercise.seriesc.shahabi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberedCardsShTest {
    @Test
    public void test1() {
        assertEquals(NumberedCardsSh.checkWinner(new int[]{2,5,2,6,9},new int[]{3,7,3,1,2}), true);
    }
    public void test2() {
        assertEquals(NumberedCardsSh.checkWinner(new int[]{4,3,4,4,5},new int[]{3,2,5,4,1}), false);
    }
    public void test3() {
        assertEquals(NumberedCardsSh.checkWinner(new int[]{1,2,3,4,5},new int[]{9,8,7,6,5}), false);
    }

}
