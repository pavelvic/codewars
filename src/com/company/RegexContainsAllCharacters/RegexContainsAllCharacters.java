package com.company.RegexContainsAllCharacters;

import com.company.KataDescription;

@KataDescription(
        name = "regex pattern to check if string has all characters",
        Sensei = "albertogcmr",
        kyu = 6,
        link = "https://www.codewars.com/kata/5e4eb72bb95d28002dbbecde")

public class RegexContainsAllCharacters {
    public static String regexContainsAll(String str) {

        String result = "^";
        for (int i = 0; i < str.length(); i++) {
            String s = Character.toString(str.charAt(i));
            result += "(?=[^" + s + "]*+" + s + ")";
        }
        System.out.println(result);
        return result;
    }

}
