package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P104C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var a = sc.nextInt();
        final var b = sc.nextInt();

        IntStream.range(0, 9)
                .forEach(aa ->
                        IntStream.range(0, 9)
                                .forEach(ii -> {
                                    final var left = Integer.parseInt(aa + "" + ii);
                                    final var right = ii;
                                    final var ans = Integer.parseInt(a + "" + aa + "" + b);
                                    if(left * right == ans) System.out.println(a + " " + b);
                                })
                );

        sc.close();
    }
}
