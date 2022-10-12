package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesc;

import com.mapsa.exercise.AlirezaJamshidi.seriesc.n.HowManyPrimeNumbersAreThere;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyPrimeNumbersAreThereTest {
    @Test
    public void test1() {
        assertEquals(HowManyPrimeNumbersAreThere.primeNumbers(1), 0);
    }

    @Test
    public void test2() {
        assertEquals(HowManyPrimeNumbersAreThere.primeNumbers(21), 8);
    }

    @Test
    public void test3() {
        assertEquals(HowManyPrimeNumbersAreThere.primeNumbers(23), 9);
    }

    @Test
    public void test4() {
        assertEquals(HowManyPrimeNumbersAreThere.primeNumbers(30), 10);
    }
}
