package Leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            var tmp = s.charAt(0);
            switch (tmp) {
                case '(' -> {
                    if(s.contains(")")) {
                        s.substring(0, 1);
                        s.replace(")", "");
                        continue;
                    }
                    result = false;
                    break;
                }
                case '{' -> {
                    if(s.contains("}")) {
                        s.substring(0, 1);
                        s.replace(")", "");
                        continue;
                    }
                    result = false;
                    break;
                }
                case '[' -> {
                    if(s.contains("]")) {
                        s.substring(0, 1);
                        s.replace(")", "");
                        continue;
                    }
                    result = false;
                    break;
                }
                default -> {
                    ;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("(]"));
    }
}
