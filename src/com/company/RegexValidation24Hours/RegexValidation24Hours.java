package com.company.RegexValidation24Hours;

import com.company.KataDescription;

@KataDescription(
        name = "regex validation of 24 hours time.",
        Sensei = "daymos",
        kyu = 7,
        link = "https://www.codewars.com/kata/56a4a3d4043c316002000042")

public class RegexValidation24Hours {
    public static boolean validateTime(String time) {
        return time.matches("^[0-1]?\\d:[0-5]\\d$|^2[0-3]:[0-5]\\d$");
    }
}
