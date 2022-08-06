package com.company.HumanReadableTime;

import com.company.KataDescription;

@KataDescription(
        name = "Human Readable Time",
        Sensei = "BattleRattle",
        kyu = 5,
        link = "https://www.codewars.com/kata/52685f7382004e774f0001f7")

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h,m,s;
        String result="";

        h = seconds/3600;
        if (h >= 10) {
            result = result.concat(String.valueOf(h));
        } else {
            result = result.concat("0").concat(h==0?"0":String.valueOf(h));
        }
        result = result.concat(":");

        m = (seconds % 3600)/60;
        if (m >= 10) {
            result = result.concat(String.valueOf(m));
        } else {
            result = result.concat("0").concat(m==0?"0":String.valueOf(m));
        }
        result = result.concat(":");

        s = seconds % 60;
        if (s >= 10) {
            result = result.concat(String.valueOf(s));
        } else {
            result = result.concat("0").concat(s==0?"0":String.valueOf(s));
        }

        return result;
    }
}
