package com.company.SimplePigLatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplePigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("This!ay siay ymay tringsay", SimplePigLatin.pigIt("!This is my string"));
//        assertEquals("This!ay siay ymay tringsay", SimplePigLatin.pigIt("O tempora o mores !"));

    }
}
