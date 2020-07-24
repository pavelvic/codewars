package com.company.NumberOfPeopleInTheBus;

import com.company.KataDescription;

import java.util.ArrayList;

@KataDescription(
        name = "Number of People in the Bus",
        Sensei = "aryan-firouzian",
        kyu = 7,
        link = "https://www.codewars.com/kata/5648b12ce68d9daa6b000099")

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int allIn = 0;
        int allOut = 0;
        for (int[] i : stops
        ) {
            allIn = allIn + i[0];
            allOut = allOut + i[1];
        }
        return allIn - allOut;
    }
}
