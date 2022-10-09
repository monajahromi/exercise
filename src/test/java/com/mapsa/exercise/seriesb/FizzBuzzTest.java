package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesb.d.FizzBuzzRaminRezaei;
import org.junit.Test;

import com.mapsa.exercise.seriesb.d.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzzRaminRezaei.fizzBuzz(3), "Fizz");
	}

	@Test
	public void test2() {
		assertEquals(FizzBuzzRaminRezaei.fizzBuzz(5), "Buzz");
	}

	@Test
	public void test3() {
		assertEquals(FizzBuzzRaminRezaei.fizzBuzz(15), "FizzBuzz");
	}

	@Test
	public void test4() {
		assertEquals(FizzBuzzRaminRezaei.fizzBuzz(10), "Buzz");
	}

	@Test
	public void test5() {
		assertEquals(FizzBuzzRaminRezaei.fizzBuzz(98), "98");
	}

}
