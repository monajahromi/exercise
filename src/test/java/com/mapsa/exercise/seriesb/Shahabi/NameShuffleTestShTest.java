package com.mapsa.exercise.seriesb.Shahabi;

import com.mapsa.exercise.seriesb.b.NameShuffleSh;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameShuffleTestShTest {
	
	
	  @Test
	  public void test1() {
	    assertEquals("Trump Donald", NameShuffleSh.nameShuffle("Donald Trump"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("O'Donnel Rosie", NameShuffleSh.nameShuffle("Rosie O'Donnel"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("Butts Seymour", NameShuffleSh.nameShuffle("Seymour Butts"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("Greene Ebony", NameShuffleSh.nameShuffle("Ebony Greene"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("Kennedy Ken", NameShuffleSh.nameShuffle("Ken Kennedy"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals("Gonzalez Allison", NameShuffleSh.nameShuffle("Allison Gonzalez"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals("Frazier Albert", NameShuffleSh.nameShuffle("Albert Frazier"));
	  }
		
		@Test
	  public void test8() {
	    assertEquals("Hopkins Eloise", NameShuffleSh.nameShuffle("Eloise Hopkins"));
	  }
		
		@Test
	  public void test9() {
	    assertEquals("Welch Donnie", NameShuffleSh.nameShuffle("Donnie Welch"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals("Thomas Vernon", NameShuffleSh.nameShuffle("Vernon Thomas"));
	  }

}
