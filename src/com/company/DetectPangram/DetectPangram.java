package com.company.DetectPangram;

import com.company.KataDescription;

@KataDescription(
        name = "Detect Pangram",
        Sensei = "anindyabd",
        kyu = 6,
        link = "https://www.codewars.com/kata/545cedaa9943f7fe7b000048")

public class DetectPangram {
    public boolean check(String sentence) {
        return sentence.toLowerCase().chars().filter(x -> x > 'A' && x < 'z').distinct().count() == 25;
    }
}
