package com.company.VasyaClerk;

import com.company.KataDescription;

@KataDescription(
        name = "Vasya - Clerk",
        Sensei = "AlexIsHappy",
        kyu = 6,
        link = "https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8")

public class VasyaClerk {
    public static String tickets(int[] peopleInLine) {
        int k25 = 0;
        int k50 = 0;
        for (int price : peopleInLine
        ) {
            switch (price) {
                case 25:
                    k25++;
                    break;
                case 50:
                    if (k25 > 0) {
                        k25--;
                        k50++;
                    } else return "NO";
                    break;
                case 100:
                    if (k50 > 0 && k25 > 0) {
                        k50--;
                        k25--;
                    } else if (k25 > 2) {
                        k25 -= 3;
                    } else return "NO";
                    break;
            }
        }
        return "YES";
    }
}
