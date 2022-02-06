package levelUp.binarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class CutPipe {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var beforeCount = sc.nextInt();
        final var afterCount = sc.nextInt();
        // 末尾の改行コードをスキップ
        sc.nextLine();
        final var treeLength = Stream.of(sc.nextLine().split(" "))
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::parseInt)
                .toArray();
        final var allLengthSum = Arrays.stream(treeLength).sum();

        var resultLength = 0;
        if(treeLength[0] * afterCount < allLengthSum) {
            for(var length : treeLength) {
                var matchCount =
                    Arrays.stream(treeLength)
                        .filter(l -> l >= length)
                        .map(i -> 1)
                        .sum();
                if(matchCount > afterCount) {

                    break;
                }

            }

            resultLength = 1;
        } else {
            for(var length : treeLength) {


            }
            resultLength = 2;
        }

        System.out.println(resultLength);

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int calcWinCount(String[] rivalHands, String loserHand) {
        return Arrays.stream(rivalHands)
                .filter(hand -> hand.equals(loserHand))
                .mapToInt(hand -> 1)
                .sum();
    }
}
