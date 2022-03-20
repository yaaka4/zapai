package rankUp.C;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P030C {
    private final static int WHITE_SCALE = 128;

    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var height = sc.nextInt();
        final var width = sc.nextInt();
        // 改行スキップ
        sc.nextLine();

        IntStream.range(0, height)
                .mapToObj(i -> returnStreamInt(sc, width))
                .map(sti -> sti.map(p -> p >= WHITE_SCALE ? "1" : "0")
                               .collect(Collectors.joining(" ")))
                .forEach(System.out::println);

        sc.close();
    }

    private static Stream<Integer> returnStreamInt(Scanner sc, int width) {
        return IntStream.range(0, width)
                .mapToObj(i -> sc.nextInt());
    }
}
