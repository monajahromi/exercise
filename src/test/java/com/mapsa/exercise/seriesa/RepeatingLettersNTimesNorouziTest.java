package com.mapsa.exercise.seriesa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatingLettersNTimesNorouziTest {
	  @Test
	  public void test1() {
	    assertEquals("mmmmmiiiiiccccceeeee", RepeatingLettersNTimesNorouzi.repeat("mice", 5));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("hhheeellllllooo", RepeatingLettersNTimesNorouzi.repeat("hello", 3));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("stop", RepeatingLettersNTimesNorouzi.repeat("stop", 1));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("ttoommaattoo", RepeatingLettersNTimesNorouzi.repeat("tomato", 2));
	  }
}