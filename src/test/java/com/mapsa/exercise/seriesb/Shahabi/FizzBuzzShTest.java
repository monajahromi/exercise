package com.mapsa.exercise.seriesb.Shahabi;

import com.mapsa.exercise.seriesb.d.FizzBuzzSh;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzzSh.fizzBuzz(3), "Fizz");
	}

	@Test
	public void test2() {
		assertEquals(FizzBuzzSh.fizzBuzz(5), "Buzz");
	}

	@Test
	public void test3() {
		assertEquals(FizzBuzzSh.fizzBuzz(15), "FizzBuzz");
	}

	@Test
	public void test4() {
		assertEquals(FizzBuzzSh.fizzBuzz(10), "Buzz");
	}

	@Test
	public void test5() {
		assertEquals(FizzBuzzSh.fizzBuzz(98), "98");
	}

}
