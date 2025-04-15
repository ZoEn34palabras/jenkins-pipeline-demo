package com;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSuma() {
        assertEquals(5, App.sumar(2, 3));
    }
}
