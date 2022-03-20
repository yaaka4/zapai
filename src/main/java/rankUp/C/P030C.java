package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P030C {
    final static int WHITE_SCALE = 128;

    public static void main(String[] args) {

        final var sc = new Scanner(System.in);

        final var height = sc.nextInt();
        // スキップ
        //final var weight =
        sc.nextInt();
        // スキップ
        sc.nextLine();

        IntStream.range(0, height)
                .mapToObj(i -> returnIntArray(sc))
                .map(array ->
                        Arrays.stream(array)
                            .mapToObj(p -> p >= WHITE_SCALE ? "1" : "0")
                            .toArray(String[]::new)
                    )
                .forEach(array -> System.out.println(String.join(" ", array)));

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
