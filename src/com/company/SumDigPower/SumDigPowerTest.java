package com.company.SumDigPower;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SumDigPowerTest {
    private static void testing(long a, long b, long[] res) {
        assertEquals(Arrays.toString(res),
                Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
    }

    //.......
    private static int sumPowerDigitsSol(long num) {
        String s = Long.toString(num, 10);
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            result += Math.pow(Character.digit(s.charAt(i), 10), i + 1);
        return result;
    }

    private static List<Long> sumDigPowSol(long a, long b) {
        List<Long> res = new ArrayList<Long>();
        long nb = a;
        while (nb <= b) {
            if (sumPowerDigitsSol(nb) == nb)
                res.add(nb);
            nb++;
        }
        return res;
    }

    //.......
    private static int randint(Random rnd, int min, int max) {
        int randomNumber = rnd.nextInt(max - min) + min;
        return randomNumber;
    }

    private static void wTests1() {
        for (int i = 0; i < 35; i++) {
            Random rnd = new Random();
            long a = randint(rnd, 100, 500);
            long b = randint(rnd, 1000, 3000);
            assertEquals(Arrays.toString(sumDigPowSol(a, b).toArray()),
                    Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
        }
    }

    private static void wTests2() {
        for (int i = 0; i < 15; i++) {
            Random rnd = new Random();
            long a = randint(rnd, 10, 999);
            long b = randint(rnd, 1100, 3000);
            assertEquals(Arrays.toString(sumDigPowSol(a, b).toArray()),
                    Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
        }
    }

    private static void wTests3() {
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            long a = randint(rnd, 2620000, 2640000);
            long b = randint(rnd, 2647000, 2648000);
            assertEquals(Arrays.toString(sumDigPowSol(a, b).toArray()),
                    Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
        }
    }

    @Test
    public void test() {
        System.out.println("Basic Tests");
        testing(1, 10, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        testing(1, 100, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        testing(10, 100, new long[]{89});
        testing(90, 100, new long[]{});
        testing(90, 150, new long[]{135});
        testing(50, 150, new long[]{89, 135});
        testing(10, 150, new long[]{89, 135});
    }

    @Test
    public void tests1() {
        System.out.println("Random Tests 1 ****");
        wTests1();
    }

    @Test
    public void tests2() {
        System.out.println("Random Tests 2 ****");
        wTests2();
    }

    @Test
    public void tests3() {
        System.out.println("Random Tests 3 ****");
        wTests3();
    }
}