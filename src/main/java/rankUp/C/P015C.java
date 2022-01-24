package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P015C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var day = Integer.parseInt(line);

        final var totalPoint = IntStream.range(0, day)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray())
                .mapToInt(array -> {
                    final double percent;
                    if (array[0] == 3 || array[0] == 13 || array[0] == 23 || array[0] == 30 || array[0] == 31) {
                        percent = 0.03;
                    } else if (array[0] == 5 || array[0] == 15 || array[0] == 25) {
                        percent = 0.05;
                    } else {
                        percent = 0.01;
                    }
                    return (int)(array[1] * percent);
                })
                .sum();

        System.out.println(totalPoint);

        sc.close();
    }
}