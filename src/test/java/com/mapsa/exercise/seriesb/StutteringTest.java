package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesb.e.StutteringRaminRezaei;
import org.junit.Test;

import com.mapsa.exercise.seriesb.e.Stuttering;

public class StutteringTest {
	
	
	
	@Test
	public void test01() { 
		assertEquals("in... in... increasing?", StutteringRaminRezaei.stutter("increasing"));
	}

	@Test
	public void test02() { 
		assertEquals("ad... ad... adventures?", StutteringRaminRezaei.stutter("adventures"));
	}

	@Test
	public void test03() { 
		assertEquals("en... en... enticing?", StutteringRaminRezaei.stutter("enticing"));
	}

	@Test
	public void test04() { 
		assertEquals("un... un... unacceptable?", StutteringRaminRezaei.stutter("unacceptable"));
	}

	@Test
	public void test05() { 
		assertEquals("ac... ac... accountable?", StutteringRaminRezaei.stutter("accountable"));
	}

	@Test
	public void test06() { 
		assertEquals("in... in... incredible?", StutteringRaminRezaei.stutter("incredible"));
	}

	@Test
	public void test07() { 
		assertEquals("ex... ex... exquisite?", StutteringRaminRezaei.stutter("exquisite"));
	}

	@Test
	public void test08() { 
		assertEquals("am... am... am?", StutteringRaminRezaei.stutter("am"));
	}

	@Test
	public void test09() { 
		assertEquals("en... en... enduring?", StutteringRaminRezaei.stutter("enduring"));
	}

	@Test
	public void test10() { 
		assertEquals("ou... ou... outstanding?", StutteringRaminRezaei.stutter("outstanding"));
	}

	@Test
	public void test11() { 
		assertEquals("as... as... astonishing?", StutteringRaminRezaei.stutter("astonishing"));
	}

	@Test
	public void test12() { 
		assertEquals("as... as... astounding?", StutteringRaminRezaei.stutter("astounding"));
	}

	@Test
	public void test13() { 
		assertEquals("im... im... impressive?", StutteringRaminRezaei.stutter("impressive"));
	}

	@Test
	public void test14() { 
		assertEquals("re... re... revolutionize?", StutteringRaminRezaei.stutter("revolutionize"));
	}

	@Test
	public void test15() { 
		assertEquals("re... re... recurring?", StutteringRaminRezaei.stutter("recurring"));
	}

	@Test
	public void test16() { 
		assertEquals("re... re... recollection?", StutteringRaminRezaei.stutter("recollection"));
	}

	@Test
	public void test17() { 
		assertEquals("so... so... so?", StutteringRaminRezaei.stutter("so"));
	}

	@Test
	public void test18() { 
		assertEquals("go... go... gorgeous?", StutteringRaminRezaei.stutter("gorgeous"));
	}

	@Test
	public void test19() { 
		assertEquals("ca... ca... captivating?", StutteringRaminRezaei.stutter("captivating"));
	}

}
