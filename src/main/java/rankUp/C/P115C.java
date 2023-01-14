package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P115C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var carCount = sc.nextInt();
        final var complexMeter = sc.nextInt();
        final var totalComplex = IntStream.range(0, carCount - 1)
                .mapToObj(i -> sc.nextInt())
                .filter(m -> m <= complexMeter)
                .mapToInt(m -> m)
                .sum();

        System.out.println(totalComplex);
        sc.close();
    }
}
