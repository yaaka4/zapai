package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P040C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var peopleCount = sc.nextInt();
        // スキップ
        sc.nextLine();
        final var childrenInfoList = IntStream.range(0, peopleCount)
                .mapToObj(i -> returnArray(sc))
                .toList();

        var low = 100.0;
        var high = 200.0;
        for(var child : childrenInfoList) {
            var diff = child[0];
            var tall = Double.parseDouble(child[1]);
            if(diff.equals("le")) {
                high = Math.min(high, tall);
            } else {
                low = Math.max(low, tall);
            }
        }
        System.out.println(low + " " + high);

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .toArray(String[]::new);
    }
}
