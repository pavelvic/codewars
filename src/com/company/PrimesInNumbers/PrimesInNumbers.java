package com.company.PrimesInNumbers;

import com.company.KataDescription;

import java.util.Map;
import java.util.TreeMap;

@KataDescription(
        name = "Primes in numbers",
        Sensei = "g964",
        kyu = 5,
        link = "https://www.codewars.com/kata/54d512e62a5e54c96200019e")

public class PrimesInNumbers {
    private static Map<Integer, Integer> mp = new TreeMap<>();

    private static Map<Integer, Integer> factorsM(int n) {
        int count;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (mp.containsKey(i)) {
                    count = mp.get(i) + 1;
                    mp.put(i, count);
                } else {
                    mp.put(i, 1);
                }
                factorsM(n / i);
                break;
            }
        }
        return mp;
    }

    public static String factors(int n) {
        String res = "";
        for (Map.Entry<Integer, Integer> entry : factorsM(n).entrySet()) {
            if (entry.getValue() != 1) res = res + "(" + entry.getKey() + "**" + entry.getValue() + ")";
            else res = res + "(" + entry.getKey() + ")";
        }
        mp.clear();
        return res;
    }
}
