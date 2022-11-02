package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.i.InclusiveArrayRanges;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InclusiveArrayRangesJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                InclusiveArrayRanges.inclusiveArrayRanges(1, 5));
    }


    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 8},
                InclusiveArrayRanges.inclusiveArrayRanges(2, 8));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                InclusiveArrayRanges.inclusiveArrayRanges(10, 20));
    }


    @Test
    public void test4() {
        assertArrayEquals(new int[]{17},
                InclusiveArrayRanges.inclusiveArrayRanges(17, 5));
    }


}
