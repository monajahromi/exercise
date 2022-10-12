package com.mapsa.exercise.seriesb.Shahabi;

import com.mapsa.exercise.seriesb.c.CanCaptureSh;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanCaptureShTest {

	@Test
	public void test1() {
		assertTrue(CanCaptureSh.canCapture(new String[] { "A8", "E8" }));
	}

	@Test
	public void test2() {
		assertFalse(CanCaptureSh.canCapture(new String[] { "A1", "B2" }));
	}

	@Test
	public void test3() {
		assertTrue(CanCaptureSh.canCapture(new String[] { "H4", "H3" }));
	}

	@Test
	public void test4() {
		assertFalse(CanCaptureSh.canCapture(new String[] { "F5", "C8" }));
	}

	@Test
	public void test5() {
		assertTrue(CanCaptureSh.canCapture(new String[] { "G3", "G7" }));
	}

	@Test
	public void test6() {
		assertTrue(CanCaptureSh.canCapture(new String[] { "B3", "B2" }));
	}

	@Test
	public void test7() {
		assertFalse(CanCaptureSh.canCapture(new String[] { "F5", "B2" }));
	}

	@Test
	public void test8() {
		assertFalse(CanCaptureSh.canCapture(new String[] { "H5", "C8" }));
	}

}
