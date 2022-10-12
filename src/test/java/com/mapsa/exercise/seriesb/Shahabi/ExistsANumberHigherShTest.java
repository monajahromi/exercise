package com.mapsa.exercise.seriesb.Shahabi;

import com.mapsa.exercise.seriesb.a.ExistsANumberHigherSh;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExistsANumberHigherShTest {

	@Test
	public void test1() {
		assertTrue(ExistsANumberHigherSh.existsHigher(new int[] { 5, 3, 15, 22, 4 }, 10));
	}

	@Test
	public void test2() {
		assertFalse(ExistsANumberHigherSh.existsHigher(new int[] { 1, 2, 3, 4, 5 }, 8));
	}

	@Test
	public void test3() {
		assertTrue(ExistsANumberHigherSh.existsHigher(new int[] { 4, 3, 3, 3, 2, 2, 2 }, 4));
	}

	@Test
	public void test4() {
		assertFalse(ExistsANumberHigherSh.existsHigher(new int[] { 2, 2, 2, 2 }, 5));
	}

	@Test
	public void test5() {
		assertFalse(ExistsANumberHigherSh.existsHigher(new int[] {}, 0));
	}
}
