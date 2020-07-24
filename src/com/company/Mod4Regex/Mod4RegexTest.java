package com.company.Mod4Regex;

import org.junit.Test;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Mod4RegexTest {
    @Test
    public void testRealPattern() {
        assertTrue("Mod.mod4 must be a standard Java Pattern object", Pattern.class.equals(Mod4Regex.mod4.getClass()));
    }

    @Test
    public void testValidMod4() throws Exception {
        String[] validTests = {"[+05620]", "[005624]", "[-05628]", "[005632]", "[555636]", "[+05640]", "[005600]",
                "the beginning [-0] the end", "~[4]", "[32]", "the beginning [0] ... [invalid] numb[3]rs ... the end",
                "...may be [+002016] will be.", "~[4]", "[32]"};
        for (String test : validTests) {
            Matcher m = Mod4Regex.mod4.matcher(test);
            assertTrue(test + " is valid, but no match was made.", m.find());
        }
    }

    @Test
    public void testInvalidMod4() throws Exception {
        String[] invalidTests = {"[+05621]", "[-55622]", "[005623]", "[~24]", "[8.04]", "No, [2014] isn't a multiple of 4..."};
        for (String test : invalidTests) {
            Matcher m = Mod4Regex.mod4.matcher(test);
            assertFalse(test + " is invalid, but a match was made.", m.find());
        }
    }

    @Test
    public void testRandomInput() throws Exception {
        for (int i = 0; i < 100; i++) {
            double signR = Math.random();
            String sign = signR > 0.6 ? "+" : signR > 0.3 ? "-" : "";
            String test = UUID.randomUUID().toString() +
                    "[" + sign + ((int) (Math.random() * 1000) * 4) + "]" +
                    UUID.randomUUID().toString() +
                    "[" + (Math.random() * 1000) + "]" +
                    UUID.randomUUID().toString() +
                    "[~" + (int) (Math.random() * 1000) + "]";
            Matcher m = Mod4Regex.mod4.matcher(test);
            assertTrue(test + " should be found valid", m.find());
        }

        for (int i = 0; i < 100; i++) {
            double signR = Math.random();
            String sign = signR > 0.6 ? "+" : signR > 0.3 ? "-" : "";
            String test = UUID.randomUUID().toString() +
                    "[" + (Math.random() * 1000) + "]" +
                    UUID.randomUUID().toString() +
                    "[~" + (int) (Math.random() * 1000) + "]";
            Matcher m = Mod4Regex.mod4.matcher(test);
            assertFalse(test + " should not be found valid", m.find());

            test = UUID.randomUUID().toString() +
                    ((int) (Math.random() * 1000) * 4) +
                    " " +
                    (int) (Math.random() * 1000);
            m = Mod4Regex.mod4.matcher(test);
            assertFalse(test + " should not be found valid", m.find());
        }
    }
}