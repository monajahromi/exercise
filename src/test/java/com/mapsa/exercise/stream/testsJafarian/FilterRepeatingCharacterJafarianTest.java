package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.stream.a.PurgeOrganize;
import com.mapsa.exercise.stream.e.FilterRepeatingCharacter;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FilterRepeatingCharacterJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"aaaaaa","d","eeee"},
                FilterRepeatingCharacter
                        .filterRepeatingCharacter(new String[]{"aaaaaa", "bc","d","eeee","xyz"}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"88","999","22"},
                FilterRepeatingCharacter
                        .filterRepeatingCharacter(new String[]{"88", "999","22","545","133"}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{},
                FilterRepeatingCharacter
                        .filterRepeatingCharacter(new String[]{"xxxxo", "oxo","xox","ooxoo","oxo"}));
    }


}
