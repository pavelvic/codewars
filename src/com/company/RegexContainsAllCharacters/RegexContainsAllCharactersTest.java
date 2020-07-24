package com.company.RegexContainsAllCharacters;

import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.*;

public class RegexContainsAllCharactersTest {
    @Test
    public void sampleTests() {
        String abc = "abc";
        String regex = RegexContainsAllCharacters.regexContainsAll(abc);
        Pattern pattern = Pattern.compile(regex);
        assertTrue(assertionMsg("bca", abc, regex), pattern.matcher("bca").find());
        assertTrue(assertionMsg("baczzz", abc, regex), pattern.matcher("baczzz").find());
        assertFalse(assertionMsg("ac", abc, regex), pattern.matcher("ac").find());
        assertFalse(assertionMsg("bc", abc, regex), pattern.matcher("bc").find());
        assertFalse(assertionMsg("cb", abc, regex), pattern.matcher("cb").find());
    }

    @Test
    public void randomTests() {
        final Random rnd = new Random();
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 100; ++i) {
            // generate str
            int len = rnd.nextInt(4) + 2;
            Set<Character> letters = new LinkedHashSet<>();
            while (letters.size() < len) letters.add(alphabet.charAt(rnd.nextInt(alphabet.length())));
            List<Character> word = new ArrayList<>();
            word.addAll(letters);
            len = rnd.nextInt(13) + 1;
            while (word.size() < len) word.add(alphabet.charAt(rnd.nextInt(alphabet.length())));
            final boolean expected;
            if (rnd.nextBoolean()) expected = true;
            else {
                expected = false;
                Set<Character> subset = new LinkedHashSet<>();
                letters.forEach(l -> {
                    if (rnd.nextBoolean()) subset.add(l);
                });
                if (subset.isEmpty()) subset.add(letters.iterator().next());
                word.removeIf(subset::contains);
            }
            String str = letters.stream().map(c -> String.valueOf(c)).collect(joining());
            Collections.shuffle(word, rnd);
            String test = word.stream().map(c -> String.valueOf(c)).collect(joining());
            String regex = RegexContainsAllCharacters.regexContainsAll(str);
            assertEquals(assertionMsg(test, str, regex), expected, Pattern.compile(regex).matcher(test).find());
        }
    }

    private String assertionMsg(String test, String letters, String regex) {
        return String.format("Checking if %s contains all characters in %s with your pattern %s", test, letters, regex);
    }

}