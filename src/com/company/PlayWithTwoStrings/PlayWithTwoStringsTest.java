package com.company.PlayWithTwoStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayWithTwoStringsTest {
    @Test
    public void Sample_tests() {
        assertEquals("abCCde", PlayWithTwoStrings.workOnStrings("abc", "cde"));
        assertEquals("abcDeFGtrzWDEFGgGFhjkWqE", PlayWithTwoStrings.workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        assertEquals("abcDEfgDEFGg", PlayWithTwoStrings.workOnStrings("abcdeFg", "defgG"));
        assertEquals("ABABbababa", PlayWithTwoStrings.workOnStrings("abab", "bababa"));
    }

}