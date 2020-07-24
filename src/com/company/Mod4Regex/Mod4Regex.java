package com.company.Mod4Regex;

import com.company.KataDescription;

import java.util.regex.Pattern;

@KataDescription(
        name = "Mod4 Regex",
        Sensei = "wthit56",
        kyu = 5,
        link = "https://www.codewars.com/kata/54746b7ab2bc2868a0000acf")

public class Mod4Regex {
    public static Pattern mod4 = Pattern.compile("\\[[-+]?\\d]|\\[[-+]?\\d*[02468][048]]|\\[[-+]?\\d*[13579][26]]");
}
