package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.seriesc.o.UnmixMyStrings;
import com.mapsa.exercise.stream.b.RemoveDuplicates;
import com.mapsa.exercise.stream.c.LongestWord;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LongestWordJafarianTest {

    @Test
    public void test1() {
        assertEquals("Margaret's", LongestWord.findLongestWord("Margaret's toy is a pretty doll."));
    }

    @Test
    public void test2() {


        assertEquals("forever.", LongestWord.findLongestWord("A thing of beauty is a joy forever."));














    }

    @Test
    public void test3() {
        assertEquals("Forgetfulness", LongestWord.findLongestWord("Forgetfulness is by all means powerless!"));
    }


}
