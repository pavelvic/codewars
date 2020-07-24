package com.company.DescOrder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescOrderTest {
    @Test
    public void test_01() {
        assertEquals(0, DescOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, DescOrder.sortDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, DescOrder.sortDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescOrder.sortDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescOrder.sortDesc(123495678));
    }

}