package com.company.ValidParentheses;

import com.company.KataDescription;

public class ValidParentheses {
    @KataDescription(
            name = "Valid Parentheses",
            Sensei = "xDranik",
            kyu = 5,
            link = "https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java")
    public static boolean validParentheses(String parens) {
        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') counter++;
            if (parens.charAt(i) == ')') counter--;
            if (counter < 0) return false;
        }
            return counter == 0 ? true : false;
    }
}
