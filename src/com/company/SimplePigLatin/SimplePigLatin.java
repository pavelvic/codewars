package com.company.SimplePigLatin;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.stream.Collectors;

@KataDescription(
        name = "Simple Pig Latin",
        Sensei = "user2505876",
        kyu = 5,
        link = "https://www.codewars.com/kata/520b9d2ad5c005041100000f")
public class SimplePigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(e->e.matches("\\W") ? e : e.substring(1)+e.charAt(0)+"ay ").collect(Collectors.joining()).trim();
    }
}
