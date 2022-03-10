package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P105C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var count = sc.nextInt();
        // スキップ
        sc.nextLine();
        final var cardArray =
            IntStream.range(0, count)
                .map(i -> sc.nextInt())
                .sorted()
                .toArray();

        var result = 0;
        for(var i = 0; i < cardArray.length; i++) {
            if(i == cardArray.length - 1) {
                result += cardArray[i];
                break;
            }
            if(cardArray[i] + 1 != cardArray[i + 1]) {
                result += cardArray[i];
            }
        }

        System.out.println(result);

        sc.close();
    }
}
