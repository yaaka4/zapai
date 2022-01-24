package rankUp.B;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P095B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var baseInfo = returnIntArray(sc);
        final var person = baseInfo[0];
        final var songLength = baseInfo[1];
        final var correctArray = IntStream.range(0, songLength)
                .mapToObj(i -> returnIntArray(sc))
                .mapToInt(array -> array[0])
                .toArray();

        final var maxPoint = IntStream.range(0, person)
                .mapToObj(i -> IntStream.range(0, songLength)
                        .mapToObj(j -> returnIntArray(sc))
                        .mapToInt(array -> array[0])
                        .toArray())
                .mapToInt(array -> calcPoint(array, correctArray))
                .max();

        System.out.println(maxPoint.orElse(100));

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int calcPoint(int[] array, int[] correctArray) {
        var resultPoint = 100;
        var index = 0;
        for (int hz : array) {
            final var diff = Math.abs(hz - correctArray[index]);
            if (diff <= 5) {
                resultPoint -= 0;
            } else if (diff <= 10) {
                resultPoint -= 1;
            } else if (diff <= 20) {
                resultPoint -= 2;
            } else if (diff <= 30) {
                resultPoint -= 3;
            } else {
                resultPoint -= 5;
            }
            index++;
        }
        return Math.max(resultPoint, 0);
    }
}
