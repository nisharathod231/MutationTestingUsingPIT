package com.atyanidan.utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {

    @Test
    public void checkAdd() {
        A a = new A();
        assertEquals(a.add(2,3), 5);
    }
}
