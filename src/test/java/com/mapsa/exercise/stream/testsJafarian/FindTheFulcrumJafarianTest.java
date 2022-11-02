package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.f.WeeklySalary;
import com.mapsa.exercise.stream.p.FindTheFulcrum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheFulcrumJafarianTest {

    @Test
    public void test1() {
        assertEquals(2, FindTheFulcrum.findFulcrum(new int[]{3, 1, 5, 2, 4, 6, -1}));

    }

    @Test
    public void test2() {
        assertEquals(4, FindTheFulcrum.findFulcrum(new int[]{1, 2, 4, 9, 10, -10, -9, 3}));

    }

    @Test
    public void test3() {

        assertEquals(1, FindTheFulcrum.findFulcrum(new int[]{9, 1, 9}));

    }

    @Test
    public void test4() {
        assertEquals(-1, FindTheFulcrum.findFulcrum(new int[]{5, 4, 4, 4, 6, 6, 6}));
    }

    @Test
    public void test5() {
        assertEquals(0, FindTheFulcrum.findFulcrum(new int[]{7, -1, 0, -1, 1, 1, 2, 3}));
    }

    @Test
    public void test6() {
        assertEquals(-1, FindTheFulcrum.findFulcrum(new int[]{8, 8, 8, 8}));
    }


}
