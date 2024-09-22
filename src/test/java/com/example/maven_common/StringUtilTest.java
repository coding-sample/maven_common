package com.example.maven_common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.StringUtil;

public class StringUtilTest {
    @Test
    public void testGetRepo() {
        StringUtil comm = new StringUtil();
        assertEquals("Comm", comm.getRepo());
    }

    @Test
    public void testCalculateSum() {
        StringUtil stringUtil = new StringUtil();
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = stringUtil.calculateSum(numbers);
        assertEquals(15, sum);
    }
}
