package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P028C {
    private final static int PERFECT = 2;
    private final static int CLOSE = 1;
    private final static int MISTAKE = 0;

    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var wordCount = sc.nextInt();
        // 改行スキップ
        sc.nextLine();

        var resultPoint = IntStream.range(0, wordCount)
                .mapToObj(i -> sc.nextLine().split(" "))
                .mapToInt(P028C::judgeWord)
                .sum();
        System.out.println(resultPoint);

        sc.close();
    }

    private static int judgeWord(String[] array) {
        if (array[0].length() != array[1].length()) {
            return MISTAKE;
        } else if (array[0].equals(array[1])) {
            return PERFECT;
        } else if (isMistakeSpell(array)) {
            return MISTAKE;
        } else {
            return CLOSE;
        }
    }

    private static boolean isMistakeSpell(String[] array) {
        var mistakeCount = 0;
        var index = 0;
        for (char c : array[0].toCharArray()) {
            if (c != array[1].toCharArray()[index]) {
                mistakeCount++;
            }
            index++;
        }
        return mistakeCount >= 2;
    }
}
