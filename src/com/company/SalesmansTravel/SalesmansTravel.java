package com.company.SalesmansTravel;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.stream.Stream;

@KataDescription(
        name = "Salesman's Travel",
        Sensei = "g964",
        kyu = 6,
        link = "https://www.codewars.com/kata/56af1a20509ce5b9b000001e")

public class SalesmansTravel {
    public static String travel(String r, String zipcode) {
        StringBuilder sb = new StringBuilder(zipcode + ":/");
        Stream<String> strs = Arrays.stream(r.split(",")).filter(x -> x.substring(x.length() - 8).equals(zipcode));
        strs.forEach(x -> sb.insert(sb.indexOf("/"), x.substring(x.indexOf(" ") + 1, x.length() - 9) + ",").append(x.substring(0, x.indexOf(" ")) + ","));
        return sb.toString().replaceAll(",/", "/").replaceAll(",$", "");
    }
}
