package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.j.ProductOfRemainingElements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfRemainingElementsTest {
    @Test
    public void test1() {
        assertEquals(ProductOfRemainingElements.canPartition(new int[]{}), true);
    }

    @Test
    public void test2() {
        assertEquals(ProductOfRemainingElements.canPartition(new int[]{2}), true);
    }

    @Test
    public void test3() {
        assertEquals(ProductOfRemainingElements.canPartition(new int[]{2, -4, -8}), true);
    }

    @Test
    public void test4() {
        assertEquals(ProductOfRemainingElements.canPartition(new int[]{2, 64, -1, -4, -8}), false);
    }

    @Test
    public void test5() {
        assertEquals(ProductOfRemainingElements.canPartition(new int[]{2, 64, -4, -8}), true);
    }
}
