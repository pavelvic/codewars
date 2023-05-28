package com.company.SimpleAssembler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

public class SolutionTest {
    @Test
    public void simple_1() {
        String[] program = new String[]{"mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_3() {
        String[] program = new String[]{"mov a 5", "inc a", "dec a", "dec a", "inc a"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 5);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_2() {
        String[] program = new String[]{"mov a -10", "mov b a", "inc a", "dec b", "jnz a -2"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 0);
        out.put("b", -20);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_4() {
        String[] program = new String[]{"mov d 100", "dec d", "mov b d", "jnz b -2", "inc d", "mov a d", "jnz 5 10", "mov c a"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 1);
        out.put("b", 0);
        out.put("d", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
    } //[mov d 100, dec d, mov b d, jnz b -2, inc d, mov a d, jnz 5 10, mov c a]
}
