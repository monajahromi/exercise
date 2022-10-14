package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.g.VowelReplacer;
import org.junit.Test;

public class VowelReplacerTest {
	@Test
	public void test1() {
		assertEquals("th# ##rdv#rk", VowelReplacer.replaceVowels("the aardvark", '#'));
	}

	@Test
	public void test2() {
		assertEquals("m?nn?? m??s?", VowelReplacer.replaceVowels("minnie mouse", '?'));
	}

	@Test
	public void test3() {
		assertEquals("sh*k*sp**r*", VowelReplacer.replaceVowels("shakespeare", '*'));
	}

	@Test
	public void test4() {
		assertEquals("<ll <s f<<r <n l<v< <nd w<r", VowelReplacer.replaceVowels("all is fair in love and war", '<'));
	}
}