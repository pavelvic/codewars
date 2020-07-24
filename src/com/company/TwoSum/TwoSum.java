package com.company.TwoSum;

import com.company.KataDescription;

@KataDescription(
        name = "Two Sum",
        Sensei = "wthit56",
        kyu = 6,
        link = "https://www.codewars.com/kata/52c31f8e6605bcc646000082"
)

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = j;
                    res[1] = i;
                    break;
                }
            }
        }
        return res;
    }
}
