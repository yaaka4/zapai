package projava;

import java.util.Locale;

public class RunLengthCompression2 {
    public static void main(String[] args) {
        final var UPPER_SIGN = '0';
        final var LOWER_SIGN = '1';
        var data = "aa0bcd1efg1gg0abc";
        var isUpper = false;

        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (ch == UPPER_SIGN) {
                isUpper = true;
                continue;
            } else if (ch == LOWER_SIGN) {
                isUpper = false;
                continue;
            }
            if (isUpper) {
                builder.append(String.valueOf(ch).toUpperCase());
            } else {
                builder.append(String.valueOf(ch).toLowerCase());
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
