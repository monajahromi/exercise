package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.m.RetrieveLastElement;
import com.mapsa.exercise.stream.n.TripleLetterGroupings;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TripleLetterGroupingsJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"abi","bit","dab","eda"},
                TripleLetterGroupings.threeLetterCollection("edabit"));
    }


    @Test
    public void test2() {
        assertArrayEquals(new String[]{"cli","ick","lic"},
                TripleLetterGroupings.threeLetterCollection("click"));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{"cat"},
                TripleLetterGroupings.threeLetterCollection("cat"));
    }


    @Test
    public void test4() {
        assertArrayEquals(new String[]{},
                TripleLetterGroupings.threeLetterCollection("hi"));
    }
    @Test
    public void test5() {
        assertArrayEquals(new String[]{"lap","sla"},
                TripleLetterGroupings.threeLetterCollection("slap"));
    }



}
