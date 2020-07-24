package com.company.MexicanWave;

import com.company.KataDescription;

import java.util.ArrayList;
import java.util.List;

@KataDescription(
        name = "Mexican Wave",
        Sensei = "adrian.eyre",
        kyu = 6,
        link = "https://www.codewars.com/kata/58f5c63f1e26ecda7e000029")

public class MexicanWave {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                StringBuilder sb = new StringBuilder(str);
                sb.replace(i, i + 1, sb.substring(i, i + 1).toUpperCase());
                list.add(sb.toString());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
