package com.company.HowMuch;

import com.company.KataDescription;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@KataDescription(
        name = "How Much?",
        Sensei = "g964",
        kyu = 6,
        link = "https://www.codewars.com/kata/55b4d87a3766d9873a0000d4")

public class HowMuch {
    public static String howmuch(int m, int n) {
        String res = IntStream.rangeClosed(Math.min(m, n), Math.max(m, n)).filter(x -> x % 7 == 2 && x % 9 == 1).mapToObj(x -> "[M: " + x + " B: " + x / 7 + " C: " + x / 9 + "]").collect(Collectors.joining());
        return "[" + res + "]";
    }
}
