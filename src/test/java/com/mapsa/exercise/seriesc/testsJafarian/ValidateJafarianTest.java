package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.d.ValidatePinJafarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateJafarianTest {

    @Test
    public void test1() {
        assertTrue(ValidatePinJafarian.validatePin("121217" ));
    }

    @Test
    public void test2() {
        assertTrue(ValidatePinJafarian.validatePin("1234" ));
    }

    @Test
    public void test3() {
        assertFalse(ValidatePinJafarian.validatePin("45135" ));
    }

    @Test
    public void test4() {
        assertFalse(ValidatePinJafarian.validatePin("89abc1" ));
    }

    @Test
    public void test5() {
        assertTrue(ValidatePinJafarian.validatePin("900876" ));
    }

    @Test
    public void test6() {
        assertFalse(ValidatePinJafarian.validatePin(" 4983" ));
    }

    @Test
    public void test7() {
        assertFalse(ValidatePinJafarian.validatePin(" 54983" ));
    }

    @Test
    public void test8() {
        assertFalse(ValidatePinJafarian.validatePin("" ));
    }

    @Test
    public void test9() {
        assertFalse(ValidatePinJafarian.validatePin(" " ));
    }

}
