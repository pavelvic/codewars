package com.company.VasyaClerk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VasyaClerkTest {
    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 25, 100}));
    }

    @Test
    public void test4() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 50, 100}));
    }

    @Test
    public void test5() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
    }


}