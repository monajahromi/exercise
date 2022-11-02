package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.d.SumTwoSmallestNumbers;
import com.mapsa.exercise.stream.j.IndexFiltering;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexFilteringJafarianTest {

    @Test
    public void test1() {
        assertEquals("tesh", IndexFiltering.indexFiltering(new int[]{7, -1, 5, 1}, "She is the love of my love"));

    }

    @Test
    public void test2() {
        assertEquals("xavier", IndexFiltering.indexFiltering(new int[]{4, -7, -13, -11, -2, 0}, "Relax and stay calm to avoid failures"));
    }

    @Test
    public void test3() {
        assertEquals("frank sinatra", IndexFiltering.indexFiltering(new int[]{9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2}, "That's life, I've got you under my skin"));
    }


}
