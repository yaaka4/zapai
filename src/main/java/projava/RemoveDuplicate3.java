package projava;

import java.util.Arrays;

public class RemoveDuplicate3 {
    public static void main(String[] args) {
        int[] data = {3, 6, 9, 4, 2, 1, 5};

        var result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (i + 1 == data.length) {
                result[i] = data[i];
                continue;
            }
            result[i] = Math.max(data[i], data[i + 1]);
        }
        Arrays.stream(data).forEach(System.out::print);
        System.out.println();
        Arrays.stream(result).forEach(System.out::print);
    }
}
