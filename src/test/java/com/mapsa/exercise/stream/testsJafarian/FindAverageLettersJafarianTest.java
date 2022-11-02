package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.f.WeeklySalary;
import com.mapsa.exercise.stream.g.FindAverageLetters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FindAverageLettersJafarianTest {

    @Test
    public void test1() {
        assertEquals("15.0", FindAverageLetters.findAverageLetters(new String[]{"m", "y", "t", "e", "s", "h"}));

    }

    @Test
    public void test2() {
        assertEquals("15.71", FindAverageLetters.findAverageLetters(new String[]{"m", "y", "w", "o", "r", "l","d"}));
    }


}
