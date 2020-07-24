package com.company.CamelCase;

import com.company.KataDescription;

@KataDescription(
        name = "Break camelCase",
        Sensei = "hakt",
        kyu = 6,
        link = "https://www.codewars.com/kata/5208f99aee097e6552000148")

public class CamelCase {
    public static String camelCase(String input) {
        StringBuilder str = new StringBuilder(input);
        String res = str.toString();
        int c = 0;

        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) >= 'A' && res.charAt(i) <= 'Z') {
                str.insert(i + c++, " ");
            }
        }
        return str.toString();
    }
}
