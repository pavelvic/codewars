package com.company.NumberOfDivisors;

import com.company.KataDescription;

import java.util.stream.IntStream;

@KataDescription(
        name = "Count the divisors of a number",
        Sensei = "tiriana",
        kyu = 7,
        link = "https://www.codewars.com/kata/542c0f198e077084c0000c2e")

public class NumberOfDivisors {
    public long numberOfDivisors(int n) {
        IntStream is = IntStream.rangeClosed(1, n);
        return is.asDoubleStream().map(x -> n % x).filter(x -> x == 0.0).count();
    }
}