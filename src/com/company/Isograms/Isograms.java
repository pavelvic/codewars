package com.company.Isograms;

import com.company.KataDescription;

import java.util.Arrays;

@KataDescription(
        name = "Isograms",
        Sensei = "chunjef",
        kyu = 7,
        link = "https://www.codewars.com/kata/54ba84be607a92aa900000f1")

public class Isograms {
    public static boolean isIsogram(String str) {
        int[] ish = str.toLowerCase().chars().toArray();
        int[] dis = str.toLowerCase().chars().distinct().toArray();

        return Arrays.compare(ish, dis) == 0;
    }
}
