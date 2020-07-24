package com.company.CamelCase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelCaseTest {
    private static String[] words = new String[]{
            "nouns", "time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand", "part",
            "child", "eye", "woman", "place", "work", "week", "case", "point", "government", "company", "number", "group",
            "problem", "fact", "verbs", "be", "have", "do", "say", "get", "make", "go", "know", "take", "see", "come",
            "think", "look", "want", "give", "use", "find", "tell", "ask", "work", "seem", "feel", "try", "leave", "call",
            "adjectives", "good", "new", "first", "last", "long", "great", "little", "own", "other", "old", "right", "big", "high",
            "different", "small", "large", "next", "early", "young", "important", "few", "public", "bad", "same", "able"
    };

    private static String camelCaseSol(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    private static String capitalize(String str) {
        String capitalizedWord = str.substring(0, 1).toUpperCase() + str.substring(1);
        return capitalizedWord;
    }

    private static int randInt(int num) {
        return (int) (Math.random() * num);
    }

    @Test
    public void tests() {
        assertEquals("Incorrect", "camel Casing", CamelCase.camelCase("camelCasing"));
        assertEquals("Incorrect", "camel Casing Test", CamelCase.camelCase("camelCasingTest"));
        assertEquals("Incorrect", "camelcasingtest", CamelCase.camelCase("camelcasingtest"));
    }

    @Test
    public void randomTests() {

        TestLoop:
        for (int testIter = 0; testIter < 50; testIter++) {
            int wordLength = randInt(10);

            StringBuilder wordString = new StringBuilder();

            for (int i = 0; i < wordLength; i++) {
                String word = words[randInt(words.length)];
                wordString = wordString.append(i != 0 ? capitalize(word) : word);
            }

            assertEquals("Incorrect", camelCaseSol(wordString.toString()), CamelCase.camelCase(wordString.toString()));
        }
    }

}