package com.mapsa.exercise.seriesa;

import com.mapsa.exercise.seriesa.g.VowelReplacerNorouzi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelReplacerNorouziTest {
	@Test
	public void test1() {
		assertEquals("th# ##rdv#rk", VowelReplacerNorouzi.replaceVowels("the aardvark", '#'));
	}

	@Test
	public void test2() {
		assertEquals("m?nn?? m??s?", VowelReplacerNorouzi.replaceVowels("minnie mouse", '?'));
	}

	@Test
	public void test3() {
		assertEquals("sh*k*sp**r*", VowelReplacerNorouzi.replaceVowels("shakespeare", '*'));
	}

	@Test
	public void test4() {
		assertEquals("<ll <s f<<r <n l<v< <nd w<r", VowelReplacerNorouzi.replaceVowels("all is fair in love and war", '<'));
	}
}