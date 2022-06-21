package Leetcode;

import java.util.Arrays;

public class RomanToInteger {
    public int romanToInt(String s) {
        var list = Arrays.asList(s.split(""));
        var result = 0;
        for (var i = 0; i < list.size(); i++) {
            if(i != list.size() - 1 && isMinus(list.get(i), list.get(i + 1))) {
                result -= convertR2I(list.get(i));
            } else {
                result += convertR2I(list.get(i));
            }
        }
        return result;
    }

    private boolean isMinus(String current, String next) {
        if (current.equals("I") && (next.equals("V") || next.equals("X"))) {
            return true;
        }
        if (current.equals("X") && (next.equals("L") || next.equals("C"))) {
            return true;
        }
        if (current.equals("C") && (next.equals("D") || next.equals("M"))) {
            return true;
        }
        return false;

    }

    private int convertR2I(String s) {
        return switch(s) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}
