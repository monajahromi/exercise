package com.mapsa.exercise.AlirezaJamshidi.test.java.com.mapsa.exercise.seriesa;

import com.mapsa.exercise.AlirezaJamshidi.seriesa.n.RepeatingLettersNTimes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatingLettersNTimesTest {
	  @Test
	  public void test1() {
	    assertEquals("mmmmmiiiiiccccceeeee", RepeatingLettersNTimes.repeat("mice", 5));
	  }

		@Test
	  public void test2() {
	    assertEquals("hhheeellllllooo", RepeatingLettersNTimes.repeat("hello", 3));
	  }

		@Test
	  public void test3() {
	    assertEquals("stop", RepeatingLettersNTimes.repeat("stop", 1));
	  }

		@Test
	  public void test4() {
	    assertEquals("ttoommaattoo", RepeatingLettersNTimes.repeat("tomato", 2));
	  }
}