package com.company.CountDig;

import com.company.KataDescription;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@KataDescription(
        name = "Count the Digit",
        Sensei = "g964",
        kyu = 7,
        link = "https://www.codewars.com/kata/566fc12495810954b1000030")

public class CountDig {
    public static int nbDig(int n, int d) {
        String st = IntStream.rangeClosed(0, n).map(x -> x * x).boxed()
                .map(x -> "" + x).collect(Collectors.joining());
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            if (String.valueOf(st.charAt(i)).equals(Integer.toString(d))) sum++;
        }

        return sum;
    }
}
