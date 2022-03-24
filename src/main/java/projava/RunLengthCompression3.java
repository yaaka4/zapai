package projava;

public class RunLengthCompression3 {
    public static void main(String[] args) {
        var data = "ab0c1ba2bc9cd1";

        var prev = '0';
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (Character.isDigit(ch)) {
                builder.append(String.valueOf(prev).repeat(Character.getNumericValue(ch) + 1));
            } else {
                builder.append(ch);
                prev = ch;
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
