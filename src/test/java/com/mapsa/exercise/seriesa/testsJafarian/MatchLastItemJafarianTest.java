package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.f.MatchLastItem;
import com.mapsa.exercise.seriesa.f.MatchLastItemJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchLastItemJafarianTest {
	@Test
	public void test01() {
		assertEquals(true, MatchLastItemJafarian.matchLastItem(new String[] { "i", "love", "tesh", "ilovetesh" }));
	}

	@Test
	public void test02() {
		assertEquals(true,
				MatchLastItemJafarian.matchLastItem(new String[] { "i", "am", "into", "her", "world", "iamintoherworld" }));
	}

	@Test
	public void test03() {
		assertEquals(true,
				MatchLastItemJafarian.matchLastItem(new String[] { "12", "13", "17", "19", "20", "40", "121317192040" }));
	}

	@Test
	public void test04() {
		assertEquals(false,
				MatchLastItemJafarian.matchLastItem(new String[] { "she's", "not", "into", "you", "sheisnotintoyou" }));
	}

	@Test
	public void test05() {
		assertEquals(true, MatchLastItemJafarian.matchLastItem(new String[] { "rsq", "6hi", "g", "rsq6hig" }));
	}

	@Test
	public void test06() {
		assertEquals(false, MatchLastItemJafarian.matchLastItem(new String[] { "0", "1", "2", "3", "4", "5", "12345" }));
	}

	@Test
	public void test07() {
		assertEquals(false, MatchLastItemJafarian.matchLastItem(new String[] { "for", "mi", "da", "bel", "formidable" }));
	}

	@Test
	public void test08() {
		assertEquals(true, MatchLastItemJafarian.matchLastItem(new String[] { "8", "thunder", "true", "8thundertrue" }));
	}

	@Test
	public void test09() {
		assertEquals(false, MatchLastItemJafarian.matchLastItem(new String[] { "1", "1", "1", "11" }));
	}

	@Test
	public void test10() {
		assertEquals(true, MatchLastItemJafarian.matchLastItem(new String[] { "tocto", "G8G", "xtohkgc", "3V8", "ctyghrs",
				"100.88", "fyuo", "Q", "toctoG8Gxtohkgc3V8ctyghrs100.88fyuoQ" }));
	}
}