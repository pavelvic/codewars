package com.company.SimpleAssembler;

import com.company.KataDescription;

import java.util.*;


@KataDescription(
        name = "Simple assembler interpreter",
        Sensei = "ShinuToki",
        kyu = 5,
        link = "https://www.codewars.com/kata/58e24788e24ddee28e000053")

public class SimpleAssembler {
    public static Map<String, Integer> reg;
    public static Map<String, Integer> interpret(String[] program) {
        //prepare
        Map<String, Integer> registers = new HashMap<>();
        reg = registers;

        for (int i = 0; i < program.length; i++) {
            //parse command
            String[] split = program[i].split(" ");
            String command = split[0];
            String arg1 = split[1];
            String arg2 = split.length == 3 ? split[2] : null;

            //run command
            switch (command) {
                case ("mov"):
                    assert arg2 != null;
                    registers.put(arg1, getConstantOrRegister(arg2));
                    break;
                case ("inc"):
                    registers.computeIfPresent(arg1, (k, v) -> v = v + 1);
                    break;
                case ("dec"):
                    registers.computeIfPresent(arg1, (k, v) -> v = v - 1);
                    break;
                case ("jnz"):
                    if (getConstantOrRegister(arg1) == 0) continue;
                    assert arg2 != null;
                    i = i + getConstantOrRegister(arg2) - 1;
                    break;
                default:
                    throw new RuntimeException("Unknown command" + command);
            }
        }
        System.out.println(registers);
        return registers;
    }

    public static int getConstantOrRegister(String arg) {
        if (arg.matches("[0-9]+|-[0-9]+")) {
            return Integer.parseInt(arg);
        } else if (arg.matches("[a-zA-Z]")) {
            return reg.get(arg);
        } else {
            throw new RuntimeException("illegal arg value " + arg + ". Must be alphabetical (letters only) " +
                    "or integers (positive or negative).");
        }
    }
}
