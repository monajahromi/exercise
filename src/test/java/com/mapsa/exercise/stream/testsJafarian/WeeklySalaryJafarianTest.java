package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.d.SumTwoSmallestNumbers;
import com.mapsa.exercise.stream.f.WeeklySalary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeeklySalaryJafarianTest {

    @Test
    public void test1() {
        assertEquals(400, WeeklySalary.weeklySalary(new int[]{8,8,8,8,8,0,0}));

    }

    @Test
    public void test2() {
        assertEquals(410, WeeklySalary.weeklySalary(new int[]{10,10,10,0,8,0,0}));
    }

    @Test
    public void test3() {
        assertEquals(280, WeeklySalary.weeklySalary(new int[]{0,0,0,0,0,12,0}));
    }


}
