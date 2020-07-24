package com.company.EightBitNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBitNumbersTest {
    @Test
    public void sampleTests() {
        assertEquals(false, EightBitNumbers.eightBitNumber(""));
        assertEquals(true, EightBitNumbers.eightBitNumber("0"));
        assertEquals(false, EightBitNumbers.eightBitNumber("00"));
        assertEquals(true, EightBitNumbers.eightBitNumber("55"));
        assertEquals(false, EightBitNumbers.eightBitNumber("042"));
        assertEquals(true, EightBitNumbers.eightBitNumber("123"));
        assertEquals(true, EightBitNumbers.eightBitNumber("255"));
        assertEquals(false, EightBitNumbers.eightBitNumber("256"));
        assertEquals(false, EightBitNumbers.eightBitNumber("999"));
        assertEquals(false, EightBitNumbers.eightBitNumber("-1"));
    }

}