package com.company.PowerSumDig;

import com.company.KataDescription;

@KataDescription(
        name = "Numbers that are a power of their sum of digits",
        Sensei = "raulbc777",
        kyu = 5,
        link = "https://www.codewars.com/kata/55f4e56315a375c1ed000159")

public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        Integer num = 81;
        int parsNum;
        int it = 0;
        long res = 0;

        while (it != n) {

            parsNum = num.toString().chars().mapToObj(x -> Integer.parseInt(String.valueOf((char) x))).reduce(0, (x, y) -> x + y);

            for (int i = 2; i <= num.toString().length(); i++) {
                if (num == Math.pow(parsNum, i)) {
                    it++;
                    res = num;
                    break;
                }
            }
            num++;
        }
        return res;


    }

}
