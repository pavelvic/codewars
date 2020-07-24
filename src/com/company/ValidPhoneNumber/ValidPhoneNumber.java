package com.company.ValidPhoneNumber;

import com.company.KataDescription;

@KataDescription(
        name = "Valid Phone Number",
        Sensei = "xDranik",
        kyu = 6,
        link = "https://www.codewars.com/kata/525f47c79f2f25a4db000025")

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d\\d\\d\\)\\s\\d\\d\\d-\\d\\d\\d\\d$");
    }

}
