package com.company.PickPeaks;

import com.company.KataDescription;

import java.util.*;

@KataDescription(
        name = "Pick peaks",
        Sensei = "frenetic_be",
        kyu = 5,
        link = "https://www.codewars.com/kata/5279f6fe5ab7f447890006a7")
public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result= new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        boolean increas = false;
        int peak = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]< arr[i]) {
                increas = true;
                peak = i;
            }

            if (increas && arr[i-1] > arr[i]) {
                increas = false;
                pos.add(peak);
                peaks.add(arr[peak]);
            }
        }
        result.put("pos",pos);
        result.put("peaks",peaks);
        return result;
    }
}
