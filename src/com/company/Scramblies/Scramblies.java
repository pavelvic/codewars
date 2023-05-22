package com.company.Scramblies;

import com.company.KataDescription;

import java.util.HashMap;
import java.util.Map;

@KataDescription(
        name = "Scramblies",
        Sensei = "joh_pot",
        kyu = 5,
        link = "https://www.codewars.com/kata/55c04b4cc56a697bb0000048")
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> map1 = constructFrequencyMap(str1.toCharArray());
        Map<Character, Integer> map2 = constructFrequencyMap(str2.toCharArray());
        for (Character key : map2.keySet()) {
            if (!map1.containsKey(key) || map2.get(key) > map1.get(key)) return false;
        }
        return true;
    }

    private static Map<Character, Integer> constructFrequencyMap(char[] chars) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : chars) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        return freq;
    }
}
