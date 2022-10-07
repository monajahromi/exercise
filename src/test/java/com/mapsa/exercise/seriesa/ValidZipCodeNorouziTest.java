package com.mapsa.exercise.seriesa;

import com.mapsa.exercise.seriesa.h.ValidZipCodeNorouzi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidZipCodeNorouziTest {
	@Test
	public void test1() {
		assertEquals(true, ValidZipCodeNorouzi.isValid("59001"));
	}

	@Test
	public void test2() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("853a7"));
	}

	@Test
	public void test3() {
		System.out.println("No spaces allowed.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("732 32"));
	}

	@Test
	public void test4() {
		System.out.println("No sequences of length greater than 5.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("788876"));
	}

	@Test
	public void test5() {
		System.out.println("No letters allowed.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("a923b"));
	}

	@Test
	public void test6() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("5923!"));
	}

	@Test
	public void test7() {
		System.out.println("No letters and no sequences of length greater than 5.");
		assertEquals(false, ValidZipCodeNorouzi.isValid("59238aa"));
	}

	@Test
	public void test8() {
		assertEquals(true, ValidZipCodeNorouzi.isValid("88231"));
	}
}