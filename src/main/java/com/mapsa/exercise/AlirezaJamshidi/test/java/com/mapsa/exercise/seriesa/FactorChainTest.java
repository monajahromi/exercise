package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesa;

import com.mapsa.exercise.AlirezaJamshidi.seriesa.i.FactorChain;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorChainTest {
	@Test
	public void test1() {
		assertEquals(FactorChain.factorChain(new int[] { 1, 2, 4, 8, 16, 32 }), true);
	}

	@Test
	public void test2() {
		assertEquals(FactorChain.factorChain(new int[] { 1, 1, 1, 1, 1, 1 }), true);
	}

	@Test
	public void test3() {
		assertEquals(FactorChain.factorChain(new int[] { 2, 4, 6, 7, 12 }), false);
	}

	@Test
	public void test4() {
		assertEquals(FactorChain.factorChain(new int[] { 10, 1 }), false);
	}

	@Test
	public void test5() {
		assertEquals(FactorChain.factorChain(new int[] { 10, 20, 30, 40 }), false);
	}

	@Test
	public void test6() {
		assertEquals(FactorChain.factorChain(new int[] { 10, 20, 40 }), true);
	}

	@Test
	public void test7() {
		assertEquals(FactorChain.factorChain(new int[] { 1, 1, 1, 1, 7, 49 }), true);
	}
}