package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result = true;
        Deque<String> stack = new ArrayDeque<>();
        for (var c : s.split("")) {
            if (c.equals("(") || c.equals("{") || c.equals("[")) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    result = false;
                    stack.push("*");
                    break;
                }
                var last = stack.pop();
                if (last.equals("(") && !c.equals(")")) {
                    result = false;
                    stack.push("*");
                    break;
                }
                if (last.equals("{") && !c.equals("}")) {
                    result = false;
                    stack.push("*");
                    break;
                }
                if (last.equals("[") && !c.equals("]")) {
                    result = false;
                    stack.push("*");
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        if (s.length() <= 1) {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("(]"));
    }
}
