package com.company.Dubstep;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.stream.Collectors;

@KataDescription(
        name = "Dubstep",
        Sensei = "AlexIsHappy",
        kyu = 6,
        link = "https://www.codewars.com/kata/551dc350bf4e526099000ae5")

public class Dubstep {
    public static String SongDecoder(String song) {
        return Arrays.stream(song.split("WUB"))
                .filter(x -> !x.equals(""))
                .map(x -> x + " ")
                .collect(Collectors.joining()).trim();
    }
}
