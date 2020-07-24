package com.company.CapitalizationEvenAndOdds;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class CapitalizationEvenAndOddTest {
    private static final String letters = "abcdefghijklmnopqrstuvwxyz";
    private static Random random = new Random();

    private static String[] ans(String s) {
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                o += u.charAt(i);
                t += s.charAt(i);
            } else {
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }

    private static int random(int l, int u) {
        return random.nextInt(u - l) + l;
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, CapitalizationEvenAndOdd.capitalize("abcdef"));
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, CapitalizationEvenAndOdd.capitalize("codewars"));
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, CapitalizationEvenAndOdd.capitalize("abracadabra"));
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, CapitalizationEvenAndOdd.capitalize("codewarriors"));
        assertArrayEquals(new String[]{"InDeXiNgLeSsOnS", "iNdExInGlEsSoNs"}, CapitalizationEvenAndOdd.capitalize("indexinglessons"));
        assertArrayEquals(new String[]{"CoDiNgIsAfUnAcTiViTy", "cOdInGiSaFuNaCtIvItY"}, CapitalizationEvenAndOdd.capitalize("codingisafunactivity"));
    }

    @Test
    public void randomTests() {
        int j, r;
        String s;
        char[] c;
        for (int i = 0; i < 100; i++) {
            r = random(10, 20);
            c = new char[r];
            for (j = 0; j < r; j++)
                c[j] = letters.charAt(random(0, 26));
            s = new String(c);
            assertArrayEquals(ans(s), CapitalizationEvenAndOdd.capitalize(s));
        }
    }

}