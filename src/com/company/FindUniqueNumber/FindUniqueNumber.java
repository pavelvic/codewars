package com.company.FindUniqueNumber;

import com.company.KataDescription;

import java.util.Arrays;

@KataDescription(
        name = "Find the unique number",
        Sensei = "isqua",
        kyu = 6,
        link = "https://www.codewars.com/kata/585d7d5adb20cf33cb000235")

public class FindUniqueNumber {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
