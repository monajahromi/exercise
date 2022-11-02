package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.n.TripleLetterGroupings;
import com.mapsa.exercise.stream.o.BeginningAndEndParis;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BeginningAndEndParisJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{1, 2}, {1, 3}, {1, 2}, {1, 7}},
                BeginningAndEndParis.paris(new int[]{1, 1, 1, 1, 7, 2, 3, 2}));
    }


    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{5, 4}, {4, 6}, {4, 6}, {6, 6}},
                BeginningAndEndParis.paris(new int[]{5, 4, 4, 6, 6, 6, 4}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[][]{{1, 7}, {2, 6}, {3, 5}, {4, 4}},
                BeginningAndEndParis.paris(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[][]{{1, 6}, {2, 5}, {3, 4}},
                BeginningAndEndParis.paris(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[][]{{5, 2}, {9, 1}, {8, 8}},
                BeginningAndEndParis.paris(new int[]{5, 9, 8, 1, 2}));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[][]{},
                BeginningAndEndParis.paris(new int[]{}));
    }




}
