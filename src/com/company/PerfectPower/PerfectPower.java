package com.company.PerfectPower;

import com.company.KataDescription;

@KataDescription(
        name = "What's a Perfect Power anyway?",
        Sensei = "bkaes",
        kyu = 5,
        link = "https://www.codewars.com/kata/54d4c8b08776e4ad92000835")

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                for (int j = 2; j <= Math.log(n) / Math.log(2); j++) {
                    if (Math.pow(i, j) == n) return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
