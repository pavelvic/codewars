package com.company.NumberOfDivisors;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class NumberOfDivisorsTest {
    NumberOfDivisors fd = new NumberOfDivisors();

    public static int myImplementation(int n) {
        if (n == 0)
            return 0;
        int numDiv = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) numDiv++;
        }
        return numDiv;
    }

    @Test
    public void zeroTest() {
        assertEquals("Sould return 0 if the parameter equals 0", 0, fd.numberOfDivisors(0));
    }

    @Test
    public void squareTest() {
        assertEquals("Sould return 3 if the parameter equals 25", 3, fd.numberOfDivisors(25));
    }

    @Test
    public void randomTest() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int generated = rand.nextInt(500000);
            assertEquals(myImplementation(generated), fd.numberOfDivisors(generated));
        }
    }
}