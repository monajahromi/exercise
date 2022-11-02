package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.seriesa.h.ValidZipCodeJafarian;
import com.mapsa.exercise.seriesa.j.CheckArrayCanNestedInAnotherJafarian;
import com.mapsa.exercise.seriesc.d.ValidatePinJafarian;
import com.mapsa.exercise.seriesc.e.IntegerDigitsCountJafarian;
import com.mapsa.exercise.stream.a.PurgeOrganize;
import org.junit.Test;

import static org.junit.Assert.*;

public class PurgeOrganizeJafarianTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, PurgeOrganize.purgeOrganize(new int[]{1, 2, 4, 3}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, PurgeOrganize.purgeOrganize(new int[]{1, 4, 4, 4, 4, 4, 3, 2, 1, 2}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2, 3, 6, 7}, PurgeOrganize.purgeOrganize(new int[]{6, 7, 3, 2, 1}));
    }


}
