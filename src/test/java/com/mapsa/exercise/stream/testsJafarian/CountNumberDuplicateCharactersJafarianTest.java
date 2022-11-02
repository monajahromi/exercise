package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.d.SumTwoSmallestNumbers;
import com.mapsa.exercise.stream.k.CountNumberDuplicateCharacters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumberDuplicateCharactersJafarianTest {

    @Test
    public void test1() {
        assertEquals(3, CountNumberDuplicateCharacters
                .countNumberDuplicateCharacters("Hello World!"));

    }

    @Test
    public void test2() {
        assertEquals(1, CountNumberDuplicateCharacters
                .countNumberDuplicateCharacters("foobar"));
    }

    @Test
    public void test3() {
         assertEquals(1, CountNumberDuplicateCharacters
                .countNumberDuplicateCharacters("helicopter"));
    }

    @Test
    public void test4() {
        assertEquals(0, CountNumberDuplicateCharacters
                .countNumberDuplicateCharacters("birthday"));
    }


}
