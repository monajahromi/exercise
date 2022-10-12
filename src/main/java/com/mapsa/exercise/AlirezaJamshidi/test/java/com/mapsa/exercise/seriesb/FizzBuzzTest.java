package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesb;

import com.mapsa.exercise.AlirezaJamshidi.seriesb.d.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");
	}

	@Test
	public void test2() {
		assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");
	}

	@Test
	public void test3() {
		assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
	}

	@Test
	public void test4() {
		assertEquals(FizzBuzz.fizzBuzz(10), "Buzz");
	}

	@Test
	public void test5() {
		assertEquals(FizzBuzz.fizzBuzz(98), "98");
	}

}
