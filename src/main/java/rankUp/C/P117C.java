package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P117C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var storeCount = sc.nextInt();
        final var month = sc.nextInt();
        final var structCost = sc.nextInt();
        final var humanCost = sc.nextInt();
        final var gain = sc.nextInt();

        final var closeCount = IntStream.range(0, storeCount)
                .mapToObj(i -> sc.nextInt())
                .filter(count -> gain * count - structCost - humanCost * month < 0)
                .count();

        System.out.println(closeCount);
        sc.close();
    }
}
