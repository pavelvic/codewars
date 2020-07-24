package com.company.ValidPhoneNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPhoneNumberTest {
    @Test
    public void basicTests() {
        String msg = "Follow the formatting instructions carefully";
        assertEquals(msg, true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(123)456-7890"));
    }

    @Test
    public void formCharTests() {
        String msg = "Pay attention to the formatting of the string and surrounding characters";
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("abc(123)456-7890"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(123)456-7890abc"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("abc(123)456-7890abc"));
    }

    @Test
    public void charTests() {
        String msg = "Be careful with characters surrounding the phone number";
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("abc(123) 456-7890"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(123) 456-7890abc"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("abc(123) 456-7890abc"));
    }

    @Test
    public void badCharTests() {
        String msg = "Be careful with non-digit characters inside phone number";
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(123) 456-78f0"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(123) 4e6-7890"));
        assertEquals(msg, false, ValidPhoneNumber.validPhoneNumber("(*23) 456-7890"));
    }
}