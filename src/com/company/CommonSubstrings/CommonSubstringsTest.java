package com.company.CommonSubstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSubstringsTest {
    @Test
    public void ShouldBeTrue()
    {
        assertTrue(CommonSubstrings.SubstringTest("Something", "Home"));
    }

    @Test
    public void ShouldBeFalse()
    {
        assertFalse(CommonSubstrings.SubstringTest("Something", "Fun"));
    }

    @Test
    public void ShouldBeTrue2()
    {
        assertTrue(CommonSubstrings.SubstringTest("xvfusfhgvzajhqdkbna", "jjeusandknbljjacrwp"));
    }
}
