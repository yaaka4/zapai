package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P079C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var buyCount = sc.nextInt();
        final var kindCount = sc.nextInt();
        // 改行スキップ
        sc.nextLine();

        final var resultStream = IntStream.range(0, buyCount)
                .mapToObj(i -> sc.nextInt())
                .toList();

        var cardKind = new boolean[kindCount];
        Arrays.fill(cardKind, false);
        var index = 0;
        for(var card : resultStream) {
            cardKind[card - 1] = true;
            index++;
            if (isAllGet(cardKind)) {
                break;
            }
        }
        if (index == buyCount && !isAllGet(cardKind)) {
            System.out.println("unlucky");
        } else {
            System.out.println(index);
        }

        sc.close();
    }

    private static boolean isAllGet(boolean[] kindCount) {
        var result = true;
        for (var tf : kindCount) {
            if (!tf) {
                result = false;
                break;
            }
        }
        return result;
    }
}
