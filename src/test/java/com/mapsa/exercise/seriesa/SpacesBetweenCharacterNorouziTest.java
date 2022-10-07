package com.mapsa.exercise.seriesa;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacterNorouzi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacesBetweenCharacterNorouziTest {
	@Test
	public void test1() {
		assertEquals("s p a c e", SpacesBetweenCharacterNorouzi.spaceMeOut("space"));
	}

	@Test
	public void test2() {
		assertEquals("f a r   o u t", SpacesBetweenCharacterNorouzi.spaceMeOut("far out"));
	}

	@Test
	public void test3() {
		assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacterNorouzi.spaceMeOut("elongated musk"));
	}

	@Test
	public void test4() {
		assertEquals("l o n g", SpacesBetweenCharacterNorouzi.spaceMeOut("long"));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3", SpacesBetweenCharacterNorouzi.spaceMeOut("123"));
	}

	@Test
	public void test6() {
		assertEquals("a 1 b 2 c 3", SpacesBetweenCharacterNorouzi.spaceMeOut("a1b2c3"));
	}
}