package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.b.RemoveDuplicates;
import com.mapsa.exercise.stream.c.LongestWord;
import com.mapsa.exercise.stream.d.SumTwoSmallestNumbers;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SumTwoSmallestNumbersJafarianTest {

    @Test
    public void test1() {
        assertEquals(7, SumTwoSmallestNumbers.sumTwoSmallestNumbers(new int[]{19, 5, 2, 77}));

    }

    @Test
    public void test2() {
        assertEquals(8, SumTwoSmallestNumbers.sumTwoSmallestNumbers(new int[]{2, 9, 6, -1}));
    }

    @Test
    public void test3() {
        assertEquals(563, SumTwoSmallestNumbers.sumTwoSmallestNumbers(new int[]{879, 953, 694, -847, 342, 221, -91, -723, 791, -587}));
    }

    @Test
    public void test4() {
        assertEquals(4519, SumTwoSmallestNumbers.sumTwoSmallestNumbers(new int[]{3683, 2902, 3951, -475, 1617, -2385}));
    }


}
