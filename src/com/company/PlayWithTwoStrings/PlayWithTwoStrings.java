package com.company.PlayWithTwoStrings;

import com.company.KataDescription;

import java.util.HashMap;
import java.util.Map;

@KataDescription(
        name = "Play with two Strings",
        Sensei = "smile67",
        kyu = 5,
        link = "https://www.codewars.com/kata/56c30ad8585d9ab99b000c54")

public class PlayWithTwoStrings {
    public static String workOnStrings(String a, String b) {
        Map<Character, Integer> countOfA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            countOfA.computeIfPresent(Character.toLowerCase(a.charAt(i)), (x1, x2) -> ++x2);
            countOfA.putIfAbsent(Character.toLowerCase(a.charAt(i)), 1);
        }

        Map<Character, Integer> countOfB = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            countOfB.computeIfPresent(Character.toLowerCase(b.charAt(i)), (x1, x2) -> ++x2);
            countOfB.putIfAbsent(Character.toLowerCase(b.charAt(i)), 1);
        }

        String resb = "";
        for (int i = 0; i < b.length(); i++) {
            if (countOfA.containsKey(Character.toLowerCase(b.charAt(i))) && countOfA.get(Character.toLowerCase(b.charAt(i))) % 2 != 0)
                resb = resb + (Character.isUpperCase(b.charAt(i)) ? Character.toLowerCase(b.charAt(i)) : Character.toUpperCase(b.charAt(i)));
            else resb = resb + b.charAt(i);
        }

        String resa = "";
        for (int i = 0; i < a.length(); i++) {
            if (countOfB.containsKey(Character.toLowerCase(a.charAt(i))) && countOfB.get(Character.toLowerCase(a.charAt(i))) % 2 != 0)
                resa = resa + (Character.isUpperCase(a.charAt(i)) ? Character.toLowerCase(a.charAt(i)) : Character.toUpperCase(a.charAt(i)));
            else resa = resa + a.charAt(i);
        }

        return resa + resb;
    }
}

