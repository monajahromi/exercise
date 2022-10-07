package com.mapsa.exercise.seriesa;

import com.mapsa.exercise.seriesa.d.HowManyDecimalPlacesNorouzi;
import org.junit.Test;

public class HowManyDecimalPlacesNorouziTest {

	 @Test
	  public void test1() {
	    assertEquals(2, HowManyDecimalPlacesNorouzi.getDecimalPlaces("3.22"));
	  }

		@Test
	  public void test2() {
	    assertEquals(0, HowManyDecimalPlacesNorouzi.getDecimalPlaces("400"));
	  }

		@Test
	  public void test3() {
	    assertEquals(2, HowManyDecimalPlacesNorouzi.getDecimalPlaces("43.50"));
	  }

		@Test
	  public void test4() {
	    assertEquals(0, HowManyDecimalPlacesNorouzi.getDecimalPlaces("100,000,000"));
	  }

		@Test
	  public void test5() {
	    assertEquals(4, HowManyDecimalPlacesNorouzi.getDecimalPlaces("3.1415"));
	  }

		@Test
	  public void test6() {
	    assertEquals(0, HowManyDecimalPlacesNorouzi.getDecimalPlaces("0"));
	  }

		@Test
	  public void test7() {
	    assertEquals(0, HowManyDecimalPlacesNorouzi.getDecimalPlaces("01"));
	  }

		@Test
	  public void test8() {
	    assertEquals(5, HowManyDecimalPlacesNorouzi.getDecimalPlaces("00010.00010"));
	  }

		@Test
	  public void test9() {
	    assertEquals(3, HowManyDecimalPlacesNorouzi.getDecimalPlaces("3,141.592"));
	  }
}