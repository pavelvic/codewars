package com.company.FindUniqueNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindUniqueNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(3.0, FindUniqueNumber.findUniq(new double[]{4, 4, 4, 3, 4, 4}), precision);
    }
}