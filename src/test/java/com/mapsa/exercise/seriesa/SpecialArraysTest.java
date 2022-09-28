package com.mapsa.exercise.seriesa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mapsa.exercise.seriesa.k.SpecialArrays;

public class SpecialArraysTest {
	@Test
	public void test1() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 2, 7, 4, 9, 6, 1, 6, 3 }), is(true));
	}

	@Test
	public void test2() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 2, 7, 9, 1, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test3() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 2, 7, 8, 8, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test4() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 1, 1, 1, 2 }), is(false));
	}

	@Test
	public void test5() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 2, 2, 2, 2 }), is(false));
	}

	@Test
	public void test6() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 2, 1, 2, 1 }), is(true));
	}

	@Test
	public void test7() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 4, 5, 6, 7 }), is(true));
	}

	@Test
	public void test8() {
		assertThat(SpecialArrays.isSpecialArray(new int[] { 4, 5, 6, 7, 0, 5 }), is(true));
	}
}