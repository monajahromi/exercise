package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.h.ValidZipCode;
import org.junit.Test;

public class ValidZipCodeTest {
	@Test
	public void test1() {
		assertEquals(true, ValidZipCode.isValid("59001"));
	}

	@Test
	public void test2() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, ValidZipCode.isValid("853a7"));
	}

	@Test
	public void test3() {
		System.out.println("No spaces allowed.");
		assertEquals(false, ValidZipCode.isValid("732 32"));
	}

	@Test
	public void test4() {
		System.out.println("No sequences of length greater than 5.");
		assertEquals(false, ValidZipCode.isValid("788876"));
	}

	@Test
	public void test5() {
		System.out.println("No letters allowed.");
		assertEquals(false, ValidZipCode.isValid("a923b"));
	}

	@Test
	public void test6() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, ValidZipCode.isValid("5923!"));
	}

	@Test
	public void test7() {
		System.out.println("No letters and no sequences of length greater than 5.");
		assertEquals(false, ValidZipCode.isValid("59238aa"));
	}

	@Test
	public void test8() {
		assertEquals(true, ValidZipCode.isValid("88231"));
	}
}