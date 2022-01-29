package levelUp.janken;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var tryCount = sc.nextInt();
        final var fingerCount = sc.nextInt();
        // 末尾の改行コードをスキップ
        sc.nextLine();
        final var rivalHands = sc.nextLine().split("");

        final var pWinCount = calcWinCount(rivalHands, "G");
        final var cWinCount = calcWinCount(rivalHands, "P");
        final var gWinCount = calcWinCount(rivalHands, "C");

        final var pCount = fingerCount / 5;
        final var cCount = (fingerCount % 5) / 2;
        final var gCount = Math.max(0, tryCount - pCount - cCount);

        final var winCount = Math.min(pWinCount, pCount) + Math.min(cWinCount, cCount) + Math.min(gWinCount, gCount);

        System.out.println(winCount);

        sc.close();
    }

    private static int calcWinCount(String[] rivalHands, String loserHand) {
        return Arrays.stream(rivalHands)
                    .filter(hand -> hand.equals(loserHand))
                    .mapToInt(hand -> 1)
                    .sum();
    }
}