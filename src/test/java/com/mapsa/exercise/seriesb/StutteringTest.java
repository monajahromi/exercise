package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mapsa.exercise.seriesb.e.StutteringSh;

public class StutteringTest {
	
	
	
	@Test
	public void test01() { 
		assertEquals("in... in... increasing?", StutteringSh.stutter("increasing"));
	}


	@Test
	public void test02() { 
		assertEquals("ad... ad... adventures?", StutteringSh.stutter("adventures"));
	}

	@Test
	public void test03() { 
		assertEquals("en... en... enticing?", StutteringSh.stutter("enticing"));
	}

	@Test
	public void test04() { 
		assertEquals("un... un... unacceptable?", StutteringSh.stutter("unacceptable"));
	}

	@Test
	public void test05() { 
		assertEquals("ac... ac... accountable?", StutteringSh.stutter("accountable"));
	}

	@Test
	public void test06() { 
		assertEquals("in... in... incredible?", StutteringSh.stutter("incredible"));
	}

	@Test
	public void test07() { 
		assertEquals("ex... ex... exquisite?", StutteringSh.stutter("exquisite"));
	}

	@Test
	public void test08() { 
		assertEquals("am... am... am?", StutteringSh.stutter("am"));
	}

	@Test
	public void test09() { 
		assertEquals("en... en... enduring?", StutteringSh.stutter("enduring"));
	}

	@Test
	public void test10() { 
		assertEquals("ou... ou... outstanding?", StutteringSh.stutter("outstanding"));
	}

	@Test
	public void test11() { 
		assertEquals("as... as... astonishing?", StutteringSh.stutter("astonishing"));
	}

	@Test
	public void test12() { 
		assertEquals("as... as... astounding?", StutteringSh.stutter("astounding"));
	}

	@Test
	public void test13() { 
		assertEquals("im... im... impressive?", StutteringSh.stutter("impressive"));
	}

	@Test
	public void test14() { 
		assertEquals("re... re... revolutionize?", StutteringSh.stutter("revolutionize"));
	}

	@Test
	public void test15() { 
		assertEquals("re... re... recurring?", StutteringSh.stutter("recurring"));
	}

	@Test
	public void test16() { 
		assertEquals("re... re... recollection?", StutteringSh.stutter("recollection"));
	}

	@Test
	public void test17() { 
		assertEquals("so... so... so?", StutteringSh.stutter("so"));
	}

	@Test
	public void test18() { 
		assertEquals("go... go... gorgeous?", StutteringSh.stutter("gorgeous"));
	}

	@Test
	public void test19() { 
		assertEquals("ca... ca... captivating?", StutteringSh.stutter("captivating"));
	}

}
