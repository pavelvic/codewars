package com.company.BinaryToTextASCII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryToTextASCIITest {
    @Test
    public void testHello() {
        assertEquals(
                "Hello",
                BinaryToTextASCII.binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(
                "",
                BinaryToTextASCII.binaryToText(""));
    }

}