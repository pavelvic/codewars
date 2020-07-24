package com.company.CapitalizationEvenAndOdds;

import com.company.KataDescription;

@KataDescription(
        name = "Alternate capitalization",
        Sensei = "KenKamau",
        kyu = 7,
        link = "https://www.codewars.com/kata/59cfc000aeb2844d16000075")

public class CapitalizationEvenAndOdd {
    public static String[] capitalize(String s) {
        String res1 = "";
        String res2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                res1 += String.valueOf(s.charAt(i)).toUpperCase();
                res2 += String.valueOf(s.charAt(i));
            } else {
                res2 += String.valueOf(s.charAt(i)).toUpperCase();
                res1 += String.valueOf(s.charAt(i));
            }
        }

        String[] res = new String[2];
        res[0] = res1;
        res[1] = res2;
        return res;
    }

}
