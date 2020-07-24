package com.company.AreSame;

import com.company.KataDescription;

import java.util.Arrays;

@KataDescription(
        name = "Are they the \"same\"?",
        Sensei = "g964",
        kyu = 6,
        link = "https://www.codewars.com/kata/550498447451fbbd7600041c")

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;

        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] * a[i];
        }
        Arrays.sort(b);
        Arrays.sort(arr);

        return Arrays.compare(b, arr) == 0;
    }
}
