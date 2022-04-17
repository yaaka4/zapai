package projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloat {

    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO, ZERO_FLOAT, MINUS_START
    }

    static boolean check(String data) {
        var state = FloatState.START;
        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> { // 開始
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else if (ch == '-'){
                        state = FloatState.MINUS_START;
                    } else {
                        return false;
                    }
                }
                case MINUS_START -> { // マイナス開始
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case ZERO -> { // 頭のゼロ
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                case INT -> { // 整数部
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    } else if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                case FRAC_START, FRAC, ZERO_FLOAT -> { // 小数部
                    if (ch >= '1' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else if (ch == '0') {
                        state = FloatState.ZERO_FLOAT;
                    } else {
                        return false;
                    }
                }
            }
        }
        return switch (state) {
            case ZERO, INT, FRAC -> true;
            default -> false;
        };
    }

    static Pattern pat = Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
    static boolean check2(String data) {
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    public static void main(String[] args) {
        System.out.println(check(""));
        System.out.println(check("012"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
        System.out.println(check("12.0"));
        System.out.println(check("-123"));
        System.out.println(check("--123"));
        System.out.println(check("-12-3"));

        System.out.println("---------");
        System.out.println(check2(""));
        System.out.println(check2("012"));
        System.out.println(check2(".12"));
        System.out.println(check2("12."));
        System.out.println(check2("1.2.3"));
        System.out.println(check2("1..3"));
        System.out.println(check2("0"));
        System.out.println(check2("12"));
        System.out.println(check2("12.3"));
        System.out.println(check2("0.3"));
        System.out.println(check2("12.30"));
        System.out.println(check2("12.0"));
        System.out.println(check2("-123"));
        System.out.println(check2("--123"));
        System.out.println(check2("-12-3"));
    }
}
