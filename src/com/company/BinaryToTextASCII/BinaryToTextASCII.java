package com.company.BinaryToTextASCII;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.stream.Collectors;

@KataDescription(
        name = "Binary to Text (ASCII) Conversion",
        Sensei = "deanvn",
        kyu = 6,
        link = "https://www.codewars.com/kata/5583d268479559400d000064")

public class BinaryToTextASCII {
    public static String binaryToText(String binary) {
        if (binary.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binary.length() / 8; i++) sb.append(binary, i * 8, i * 8 + 8).append(" ");

        String res = Arrays.stream(sb.toString().split(" ")).map(value -> {
            Integer res2 = 0;
            for (int i = value.length() - 1; i >= 0; i--) {
                res2 = res2 + (int) Math.pow(2, i) * Integer.parseInt(String.valueOf(value.charAt(Math.abs(i - 7))));
            }
            return String.valueOf((char) res2.intValue());
        }).collect(Collectors.joining());

        return res;
    }
}
