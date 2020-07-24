package com.company.CreatePhoneNumbers;

import com.company.KataDescription;

import java.util.Arrays;
import java.util.stream.Collectors;

@KataDescription(
        name = "Create Phone Number",
        Sensei = "xDranik",
        kyu = 6,
        link = "https://www.codewars.com/kata/525f50e3b73515a6db000b83")

public class CreatePhoneNumbers {

    public static String createPhoneNumber(int[] numbers) {
        String s = Arrays.stream(numbers).mapToObj(x -> "" + x).collect(Collectors.joining());
        return "(" + s.substring(0, 3) + ")" + " " + s.substring(3, 6) + "-" + s.substring(6);
    }
}
