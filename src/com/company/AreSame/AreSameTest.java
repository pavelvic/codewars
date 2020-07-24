package com.company.AreSame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreSameTest {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void aIsEmptytest() {
        int[] a = new int[]{};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void bIsEmptytest() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void dubls() {
        int[] a = new int[]{3, 2, 3};
        int[] b = new int[]{9, 9, 4};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void nlls() {
        int[] a = new int[]{0, 1, 2};
        int[] b = new int[]{1, 4, 0, 1};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void bothABIsEmptytest() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void nullTest() {
        assertEquals(false, AreSame.comp(null, null));
    }
}