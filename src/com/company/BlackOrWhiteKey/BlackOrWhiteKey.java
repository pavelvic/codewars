package com.company.BlackOrWhiteKey;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.List;

@KataDescription(
        name = "Piano Kata, Part 1",
        Sensei = "tachyonlabs",
        kyu = 6,
        link = "https://www.codewars.com/kata/589273272fab865136000108")

public class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {
        List<Integer> blackList = Arrays.asList(2, 5, 7, 10, 12);
        int kompl;

        switch (keyPressCount % 88) {
            case 0:
                kompl = keyPressCount / 88 - 1;
                break;

            default:
                kompl = keyPressCount / 88;
                break;
        }

        int do88 = keyPressCount - 88 * kompl;

        int vpred12;

        switch (do88 % 12) {
            case 0:
                vpred12 = do88 / 12 - 1;
                break;

            default:
                vpred12 = do88 / 12;
                break;
        }
        int q = do88 - vpred12 * 12;
        return blackList.contains(q) ? "black" : "white";
    }
}
