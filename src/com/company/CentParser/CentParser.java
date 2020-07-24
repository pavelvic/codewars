package com.company.CentParser;

import com.company.KataDescription;

@KataDescription(
        name = "Regexp basics - parsing prices",
        Sensei = "taw",
        kyu = 7,
        link = "https://www.codewars.com/kata/56833b76371e86f8b6000015")

public class CentParser {
    public static Integer toCents(String price) {
        String regex = "\\$\\d+\\.\\d{2}";
        boolean b = price.matches(regex);
        if (!b) return null;
        String s = price.replaceAll("[$.]", "");
        Integer res = Integer.parseInt(s);

        return res;
    }

}
