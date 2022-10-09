package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesb.b.NameShuffleRaminRezaei;
import org.junit.Test;

import com.mapsa.exercise.seriesb.b.NameShuffle;

public class NameShuffleTest {
	
	
	  @Test
	  public void test1() {
	    assertEquals("Trump Donald", NameShuffleRaminRezaei.nameShuffle("Donald Trump"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("O'Donnel Rosie", NameShuffleRaminRezaei.nameShuffle("Rosie O'Donnel"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("Butts Seymour", NameShuffleRaminRezaei.nameShuffle("Seymour Butts"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("Greene Ebony", NameShuffleRaminRezaei.nameShuffle("Ebony Greene"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("Kennedy Ken", NameShuffleRaminRezaei.nameShuffle("Ken Kennedy"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals("Gonzalez Allison", NameShuffleRaminRezaei.nameShuffle("Allison Gonzalez"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals("Frazier Albert", NameShuffleRaminRezaei.nameShuffle("Albert Frazier"));
	  }
		
		@Test
	  public void test8() {
	    assertEquals("Hopkins Eloise", NameShuffleRaminRezaei.nameShuffle("Eloise Hopkins"));
	  }
		
		@Test
	  public void test9() {
	    assertEquals("Welch Donnie", NameShuffleRaminRezaei.nameShuffle("Donnie Welch"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals("Thomas Vernon", NameShuffleRaminRezaei.nameShuffle("Vernon Thomas"));
	  }

}
