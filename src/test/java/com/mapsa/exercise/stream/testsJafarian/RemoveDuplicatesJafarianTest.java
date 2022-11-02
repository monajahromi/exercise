package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.a.PurgeOrganize;
import com.mapsa.exercise.stream.b.RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new Integer[]{1, 0}, RemoveDuplicates.RemoveDuplicates(new Integer[]{1, 0, 1, 0}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"The","big","cat"}, RemoveDuplicates.RemoveDuplicates(new String[]{"The","big","cat"}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{"John","Taylor"}, RemoveDuplicates.RemoveDuplicates(new String[]{"John","Taylor","John"}));
    }


}
