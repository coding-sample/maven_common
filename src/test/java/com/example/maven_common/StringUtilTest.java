package com.example.maven_common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    public void test() {
        StringUtil comm = new StringUtil();
        assertEquals("Comm", comm.getRepo());
    }
}
