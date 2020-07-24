package com.company.SupermarketQueue;

import com.company.KataDescription;

import java.util.Arrays;

@KataDescription(
        name = "The Supermarket Queue",
        Sensei = "mattlub",
        kyu = 6,
        link = "https://www.codewars.com/kata/57b06f90e298a7b53d000a86")

public class SupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] res = new int[n];
        for (int i = 0; i < customers.length; i++) {
            res[0] += customers[i];
            Arrays.sort(res);
        }
        return res[n - 1];
    }
}
