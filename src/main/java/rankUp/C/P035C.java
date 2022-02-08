package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P035C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var personNum = sc.nextInt();
        sc.nextLine();

        final var okCount = IntStream.range(0, personNum)
            .mapToObj(i -> returnArray(sc))
            .mapToInt(array -> {
                final var eng = Integer.parseInt(array[1]);
                final var math = Integer.parseInt(array[2]);
                final var sci = Integer.parseInt(array[3]);
                final var jap = Integer.parseInt(array[4]);
                final var his = Integer.parseInt(array[5]);
                if(array[0].equals("l")) {
                    if((eng + math + sci + jap + his >= 350) && (jap + his) >= 160) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    if((eng + math + sci + jap + his >= 350) && (math + sci) >= 160) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            })
            .sum();
        System.out.println(okCount);

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .toArray(String[]::new);
    }
}
