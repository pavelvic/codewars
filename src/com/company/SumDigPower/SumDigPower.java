package com.company.SumDigPower;

import com.company.KataDescription;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@KataDescription(
        name = "Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!",
        Sensei = "raulbc777",
        kyu = 6,
        link = "https://www.codewars.com/kata/5626b561280a42ecc50000d1")

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        Stream<Long> st = Stream.iterate(a, x -> x + 1).limit(b - a + 1);
        Predicate<Long> pr = aLong -> {
            double pw = 0;
            String str = aLong.toString();
            for (int i = 0; i < str.length(); i++) {
                pw = pw + Math.pow(Long.parseLong(String.valueOf(str.charAt(i))), i + 1);
            }
            return pw == aLong ? true : false;
        };
        return st.filter(pr).collect(Collectors.toList());
    }
}
