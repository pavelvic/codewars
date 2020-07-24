package com.company.MexicanWave;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class MexicanWaveTest {
    private Random rand = new Random();
    private String letters = "abcd efghi jklmno pqrstu vwxyz";

    @Test
    public void basicTest1() {
        System.out.println("Testing for 'a       b    '");
        String[] result = new String[]{"A       b    ", "a       B    "};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("a       b    "));
    }

    @Test
    public void basicTest2() {
        System.out.println("Testing for 'this is a few words'");
        String[] result = new String[]{"This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS"};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("this is a few words"));
    }

    @Test
    public void basicTest3() {
        System.out.println("Testing for ''");
        String[] result = new String[]{};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(""));
    }

    @Test
    public void basicTest4() {
        System.out.println("Testing for ' gap '");
        String[] result = new String[]{" Gap ", " gAp ", " gaP "};
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(" gap "));
    }

    @Test
    public void randomTest() {
        for (int i = 0; i <= 200; i++) {
            String word = getWord();
            System.out.println("Testing for '" + word + "'");
            String[] result = wave2(word);
            assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(word));
        }
    }

    private String getWord() {
        StringBuilder builder = new StringBuilder();

        for (int let = 0; let < rand.nextInt(200); let++) {
            builder.append(letters.charAt(rand.nextInt(letters.length())));
        }

        return builder.toString();
    }

    private String[] wave2(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    }

}