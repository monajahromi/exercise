package com.mapsa.exercise.seriesa.shahabi;

import com.mapsa.exercise.seriesa.c.GetSumOfPeopleBudgetShahabi;
import com.mapsa.exercise.seriesa.c.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GetSumOfPeopleBudgetTestShahabi {

    @Test
    public void test1() {
        assertTrue(GetSumOfPeopleBudgetShahabi.getBudgets(new Person[]{new Person("John", 21, 23000), new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)}) - 65700.0 == 0.0);
    }

    @Test
    public void test2() {
        assertTrue(GetSumOfPeopleBudgetShahabi.getBudgets(new Person[]{new Person("John", 21, 29000), new Person("Steve", 32, 32000),
                new Person("Martin", 16, 1600)}) - 62600.0 == 0.0);
    }

    @Test
    public void test3() {
        assertTrue(GetSumOfPeopleBudgetShahabi.getBudgets(new Person[]{new Person("John", 21, 19401), new Person("Steve", 32, 12321),
                new Person("Martin", 16, 1204)}) - 32926.0 == 0.0);
    }

    @Test
    public void test4() {
        assertTrue(GetSumOfPeopleBudgetShahabi.getBudgets(new Person[]{new Person("John", 21, 10234), new Person("Steve", 32, 21754),
                new Person("Martin", 16, 4935)}) - 36923.0 == 0.0);
    }
}
