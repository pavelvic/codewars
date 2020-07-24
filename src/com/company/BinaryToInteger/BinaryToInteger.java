package com.company.BinaryToInteger;

import java.util.List;

public class BinaryToInteger {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}