package com.com.parical_app;
import static com.com.parical_app.Dbhelper.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DbhelperTest {

    @Test
    public void testAgeFactorial() {
        int result = ageFactorial("3");
        int expected = 6;
        assertEquals(expected, result);

        result = ageFactorial("5");
        expected = 120;
        assertEquals(expected, result);
    }
}