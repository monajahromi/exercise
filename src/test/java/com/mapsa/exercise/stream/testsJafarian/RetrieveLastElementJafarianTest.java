package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.i.InclusiveArrayRanges;
import com.mapsa.exercise.stream.m.RetrieveLastElement;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RetrieveLastElementJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{5},
                RetrieveLastElement.last(new int[]{1,2,3,4,5}, 1));
    }


    @Test
    public void test2() {
        assertArrayEquals(new int[]{9,7,6},
                RetrieveLastElement.last(new int[]{4,3,9,9,7,6}, 3));
    }

    @Test
    public void test3() {
        assertArrayEquals(null,
                RetrieveLastElement.last(new int[]{1,2,3,4,5}, 7));
    }


    @Test
    public void test4() {
        assertArrayEquals(new int[]{},
                RetrieveLastElement.last(new int[]{1,2,3,4,5}, 0));
    }


}
