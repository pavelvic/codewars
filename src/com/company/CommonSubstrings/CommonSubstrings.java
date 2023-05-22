package com.company.CommonSubstrings;

import com.company.KataDescription;

@KataDescription(
        name = "Common Substrings",
        Sensei = "Shivo",
        kyu = 7,
        link = "https://www.codewars.com/kata/5669a5113c8ebf16ed00004c")
public class CommonSubstrings {
    public static boolean SubstringTest(String str1, String str2) {
        String str1lc = str1.toLowerCase();
        String str2lc = str2.toLowerCase();
        for (int i = 0; i < str2lc.length() - 1; i++) {
            String toFind = str2lc.charAt(i) + "" + str2lc.charAt(i + 1);
            if (str1lc.contains(toFind)) return true;
        }
        return false;
    }
}
