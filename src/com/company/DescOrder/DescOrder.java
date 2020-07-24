package com.company.DescOrder;

import com.company.KataDescription;

import java.util.Comparator;

@KataDescription(
        name = "Descending Order",
        Sensei = "TastyOs",
        kyu = 7,
        link = "https://www.codewars.com/kata/5467e4d82edf8bbf40000155")

public class DescOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(Integer.toString(num).chars().boxed().sorted(Comparator.reverseOrder()).
                reduce(new StringBuilder(), (a, b) -> a.append((char) b.intValue()), StringBuilder::append).toString());
    }
}