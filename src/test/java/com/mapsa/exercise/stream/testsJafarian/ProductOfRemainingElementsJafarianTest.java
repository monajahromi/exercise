package com.mapsa.exercise.stream.testsJafarian;

import com.mapsa.exercise.seriesc.b.NumberedCardsJafarian;
import com.mapsa.exercise.stream.l.ProductOfRemainingElements;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductOfRemainingElementsJafarianTest {

    @Test
    public void test1() {
        assertTrue(ProductOfRemainingElements.canPartition(new int[]{2, 8, 4, 1}));
    }

    @Test
    public void test2() {
        assertFalse(ProductOfRemainingElements.canPartition(new int[]{-1, -10, 1, -2, 20}));
    }

    @Test
    public void test3() {
        assertTrue(ProductOfRemainingElements.canPartition(new int[]{-1, -20, 5, -1, -2, 2}));
    }


}
