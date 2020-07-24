package com.company.WhereIsMyParent;

import com.company.KataDescription;

import java.util.stream.Collectors;

@KataDescription(
        name = "Where is my parent!?(cry)",
        Sensei = "smolen",
        kyu = 6,
        link = "https://www.codewars.com/kata/58539230879867a8cd00011c")

public class WhereIsMyParent {
    static String findChildren(final String text) {
        return text.chars().mapToObj(x -> ("" + (char) x))
                .sorted((o1, o2) -> o1.toLowerCase().equals(o2.toLowerCase()) ? o1.compareTo(o2) : o1.compareToIgnoreCase(o2))
                .collect(Collectors.joining());
    }
}


