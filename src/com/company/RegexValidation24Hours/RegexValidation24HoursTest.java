package com.company.RegexValidation24Hours;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RegexValidation24HoursTest {
    private final static String TIME_PATTERN = "\\A([01]?\\d|2[0-3]):[0-5]\\d\\z";
    private final static String[] WRONG_SEPARATORS = new String[]{".", " ", "/", "-", ",", ""};

    @Test
    public void basicTests() {
        assertTrue(RegexValidation24Hours.validateTime("01:00"));
        assertTrue(RegexValidation24Hours.validateTime("1:00"));
        assertTrue(RegexValidation24Hours.validateTime("00:00"));
        assertFalse(RegexValidation24Hours.validateTime("13:1"));
        assertFalse(RegexValidation24Hours.validateTime("12:60"));
        assertFalse(RegexValidation24Hours.validateTime("12: 60"));
        assertFalse(RegexValidation24Hours.validateTime("24:00"));
        assertFalse(RegexValidation24Hours.validateTime("140:00"));
        assertFalse(RegexValidation24Hours.validateTime("14:000"));
        assertFalse(RegexValidation24Hours.validateTime(""));
        assertFalse(RegexValidation24Hours.validateTime("2400"));
        assertFalse(RegexValidation24Hours.validateTime("15.47"));
        assertTrue(RegexValidation24Hours.validateTime("15:47"));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int k = 1; k <= 100; k++) {
            String randomTime = generateTime(random);
            assertEquals(validateTimeSolution(randomTime), RegexValidation24Hours.validateTime(randomTime));
        }
    }

    private String generateTime(Random random) {
        return genHours(random) + genSeparator(random) + genMinutes(random);
    }

    private String genHours(Random random) {
        int hours = random.nextInt(25);
        if (random.nextInt(5) == 4)
            hours += random.nextInt(5);
        if (random.nextInt(100) > 95)
            hours *= 10;
        return String.format(random.nextBoolean() ? "%02d" : "%d", hours);
    }

    private String genMinutes(Random random) {
        int minutes = random.nextInt(60);
        if (random.nextInt(100) > 95)
            minutes *= 10;
        return String.format(random.nextInt(100) > 10 ? "%02d" : "%d", minutes);
    }

    private String genSeparator(Random random) {
        return random.nextInt(100) > 10 ? ":" : WRONG_SEPARATORS[random.nextInt(WRONG_SEPARATORS.length)];
    }

    private boolean validateTimeSolution(String time) {
        return time.matches(TIME_PATTERN);
    }
}