package rankUp.B;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P098B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var baseInfo = returnIntArray(sc);
        final var tweetNum = baseInfo[0];
        final var checkHour = baseInfo[1];
        final var targetHour = baseInfo[2];
        final var targetGood = baseInfo[3];

        final var tweetList = IntStream.range(0, checkHour)
                .mapToObj(i -> returnIntArray(sc))
                .toList();

        for(var k = 0; k < tweetNum; k++) {
            for(var i = 0; i < checkHour; i++) {
                var goodSum = 0;
                for(var j = 0; j < targetHour; j++) {
                    goodSum += tweetList.get(i + j)[k];
                    if(goodSum >= targetGood) {
                        System.out.println("yes" + " " + (i + j + 1));
                        break;
                    }
                }
                if(goodSum >= targetGood) {
                    break;
                }
                if(i == checkHour - targetHour) {
                    System.out.println("no" + " " + 0);
                    break;
                }
            }
        }

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
