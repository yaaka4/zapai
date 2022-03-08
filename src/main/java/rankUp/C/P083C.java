package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P083C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var period = sc.nextInt();
        final var rate = sc.nextInt();
        // スキップ
        sc.nextLine();

        final var gainList = IntStream.range(0, period)
                .mapToObj(i -> sc.nextInt())
                .toList();

        final var max = gainList.stream().mapToInt(i -> i).max().orElseThrow() / rate;
        var index = 1;
        for(var gain : gainList) {
            var result = "*".repeat(gain / rate);
            result += ".".repeat(max - gain / rate);
            System.out.println(index + ":" + result);
            index++;
        }

        sc.close();
    }
}
