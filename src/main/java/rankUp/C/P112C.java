package rankUp.C;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P112C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var tourDate = sc.nextInt();
        final var hourList = IntStream.range(0, tourDate)
                .mapToObj(i -> sc.nextInt() + sc.nextInt() + 24 - sc.nextInt())
                .toList();

        System.out.println(Collections.min(hourList));
        System.out.println(Collections.max(hourList));
        sc.close();
    }
}
