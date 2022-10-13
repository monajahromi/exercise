package com.mapsa.exercise.AlirezaJamshidi.test.seriesb;

import com.mapsa.exercise.AlirezaJamshidi.seriesb.c.CanCapture;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanCaptureTest {

	@Test
	public void test1() {
		assertTrue(CanCapture.canCapture(new String[] { "A8", "E8" }));
	}

	@Test
	public void test2() {
		assertFalse(CanCapture.canCapture(new String[] { "A1", "B2" }));
	}

	@Test
	public void test3() {
		assertTrue(CanCapture.canCapture(new String[] { "H4", "H3" }));
	}

	@Test
	public void test4() {
		assertFalse(CanCapture.canCapture(new String[] { "F5", "C8" }));
	}

	@Test
	public void test5() {
		assertTrue(CanCapture.canCapture(new String[] { "G3", "G7" }));
	}

	@Test
	public void test6() {
		assertTrue(CanCapture.canCapture(new String[] { "B3", "B2" }));
	}

	@Test
	public void test7() {
		assertFalse(CanCapture.canCapture(new String[] { "F5", "B2" }));
	}

	@Test
	public void test8() {
		assertFalse(CanCapture.canCapture(new String[] { "H5", "C8" }));
	}

}
