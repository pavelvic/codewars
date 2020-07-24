package com.company.CentParser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentParserTest {
    @Test
    public void testBasic() {
        assertEquals(null, CentParser.toCents(""));
        assertEquals(null, CentParser.toCents("1"));
        assertEquals(null, CentParser.toCents("1.23"));
        assertEquals(null, CentParser.toCents("$1"));
        assertEquals(Integer.valueOf(123), CentParser.toCents("$1.23"));
        assertEquals(Integer.valueOf(9999), CentParser.toCents("$99.99"));
        assertEquals(Integer.valueOf(1234567890), CentParser.toCents("$12345678.90"));
        assertEquals(Integer.valueOf(969), CentParser.toCents("$9.69"));
        assertEquals(Integer.valueOf(970), CentParser.toCents("$9.70"));
        assertEquals(Integer.valueOf(971), CentParser.toCents("$9.71"));
        assertEquals(null, CentParser.toCents("$1.23\n"));
        assertEquals(null, CentParser.toCents("\n$1.23"));
        assertEquals(Integer.valueOf(69), CentParser.toCents("$0.69"));
        assertEquals(null, CentParser.toCents("$9.69$4.3.7"));
        assertEquals(null, CentParser.toCents("$9.692"));

        assertEquals(Integer.valueOf(1), CentParser.toCents("$0.01"));
        assertEquals(Integer.valueOf(405182), CentParser.toCents("$4051.82"));


    }

}