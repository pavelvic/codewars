package com.company.MessageValidator;


import com.company.KataDescription;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@KataDescription(
        name = "Message Validator",
        Sensei = "frkn2076",
        kyu = 6,
        link = "https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc")
public class MessageValidator {
    public static boolean isAValidMessage(String message) {
        if (message.equals("0")|message.equals("")) return true;
        if (!Character.isDigit(message.charAt(0))) return false;
        Pattern pattern = Pattern.compile("(\\d+)(\\D*)");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()){
            if (Integer.parseInt(matcher.group(1)) != matcher.group(2).length()) return false;
        }
        return true;
    }
}
