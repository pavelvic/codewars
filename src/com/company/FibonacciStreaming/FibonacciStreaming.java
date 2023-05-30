package com.company.FibonacciStreaming;

import com.company.KataDescription;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@KataDescription(
        name = "Fibonacci Streaming",
        Sensei = "Unihedron",
        kyu = 5,
        link = "https://www.codewars.com/kata/55695bc4f75bbaea5100016b")
public class FibonacciStreaming {
    public static IntStream generateFibonacciSequence() {
        return Stream.iterate(new int[]{1, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                .mapToInt(y -> y[0]);
    }

    public static void main(String[] args) {
        generateFibonacciSequence().limit(20).forEach(System.out::println);
    }
}
