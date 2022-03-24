package projava;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        var data = "abcde";

        var builder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if ((i + 1) % 2 == 0) {
                continue;
            }
            if (i + 1 == data.length()) {
                builder.append(data.charAt(i));
                continue;
            }
            builder.append(data.charAt(i + 1));
            builder.append(data.charAt(i));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
