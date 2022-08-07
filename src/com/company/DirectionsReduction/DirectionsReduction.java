package com.company.DirectionsReduction;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@KataDescription(
        name = "Directions Reduction",
        Sensei = "g964",
        kyu = 5,
        link = "https://www.codewars.com/kata/550f22f4d758534c1100025a")

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        reducedList(list);
        return list.toArray(String[]::new);
    }

    public static void reducedList (List<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if ((list.get(i).equals("NORTH") && list.get(i + 1).equals("SOUTH")) || (list.get(i).equals("SOUTH") && list.get(i + 1).equals("NORTH")) ||
                (list.get(i).equals("WEST") && list.get(i + 1).equals("EAST")) || (list.get(i).equals("EAST") && list.get(i + 1).equals("WEST"))) {
                list.remove(i);
                list.remove(i);
                reducedList(list);
            }
        }
    }
}