package com.company.MaxSubarraySum;

import com.company.KataDescription;

@KataDescription(
        name = "Maximum subarray sum",
        Sensei = "knotman90",
        kyu = 5,
        link = "https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c")

public class MaxSubarraySum {
    public static int sequence(int[] arr) {
        int s = 0, mins = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            mins = Math.min(mins, s);
            ans = Math.max(ans, s - mins);
        }
        return ans;
    }
}

