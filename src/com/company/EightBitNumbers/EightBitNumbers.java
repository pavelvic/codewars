package com.company.EightBitNumbers;

import com.company.KataDescription;

@KataDescription(
        name = "Regexp Basics - is it a eight bit unsigned number?",
        Sensei = "taw",
        kyu = 7,
        link = "https://www.codewars.com/kata/567e8f7b4096f2b4b1000005")

public class EightBitNumbers {
    public static boolean eightBitNumber(String n) {
        return n.matches("(^\\d$)|(^[1-9]\\d$)|(^1\\d\\d$)|(^2[0-4]\\d$)|(^25[0-5]$)");
    }

}
