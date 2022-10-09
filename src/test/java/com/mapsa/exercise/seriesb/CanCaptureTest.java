package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mapsa.exercise.seriesb.c.CanCaptureRaminRezaei;
import org.junit.Test;

import com.mapsa.exercise.seriesb.c.CanCapture;

public class CanCaptureTest {

	@Test
	public void test1() {
		assertTrue(CanCaptureRaminRezaei.canCapture(new String[] { "A8", "E8" }));
	}

	@Test
	public void test2() {
		assertFalse(CanCaptureRaminRezaei.canCapture(new String[] { "A1", "B2" }));
	}

	@Test
	public void test3() {
		assertTrue(CanCaptureRaminRezaei.canCapture(new String[] { "H4", "H3" }));
	}

	@Test
	public void test4() {
		assertFalse(CanCaptureRaminRezaei.canCapture(new String[] { "F5", "C8" }));
	}

	@Test
	public void test5() {
		assertTrue(CanCaptureRaminRezaei.canCapture(new String[] { "G3", "G7" }));
	}

	@Test
	public void test6() {
		assertTrue(CanCaptureRaminRezaei.canCapture(new String[] { "B3", "B2" }));
	}

	@Test
	public void test7() {
		assertFalse(CanCaptureRaminRezaei.canCapture(new String[] { "F5", "B2" }));
	}

	@Test
	public void test8() {
		assertFalse(CanCaptureRaminRezaei.canCapture(new String[] { "H5", "C8" }));
	}

}
