package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P089C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var hwArray = line.split(" ");
        final var height = Integer.parseInt(hwArray[0]);

        final var resultList = IntStream.range(0, height)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(""))
                                .toArray(String[]::new))
                .flatMap(Arrays::stream)
                .toArray(String[]::new);

        final var scoreList = IntStream.range(0, height)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray())
                .flatMapToInt(Arrays::stream)
                .toArray();

        final var totalScore = IntStream.range(0, resultList.length)
                .map(i -> {
                    if (resultList[i].equals("o")) {
                        return scoreList[i];
                    }
                    return 0;
                })
                .sum();

        System.out.println(totalScore);

        sc.close();
    }
}