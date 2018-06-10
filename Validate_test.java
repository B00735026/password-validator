package com.example.android.password_validator;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class Validate_test {
private Validator valid = new Validator();
    @Test

    public void test1(){
        assertTrue(valid.validate("passwor3434343d"));
    }
    @Test
    public void test2(){
        assertTrue(valid.validate("qwertewewewewewe"));
    }
    public void test3(){
        assertFalse(valid.validate("password"));
    }
}
