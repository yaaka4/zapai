package rankUp.B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P104B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var personCount = sc.nextInt();
        final var questionCount = sc.nextInt();
        final var collectNum = Pattern.compile("(^[0-9]$)|(^[0-9][0-9]$)|(^[0-1][0][0]$)");
        // 末尾の改行コードをスキップ
        sc.nextLine();
        final var answerList =
            IntStream.range(0, personCount)
                .mapToObj(i -> returnArray(sc))
                .map(array ->
                        Arrays.stream(array)
                            .map(x -> collectNum.matcher(x).matches() ? x : "_")
                            .toArray(String[]::new)
                    )
                .toList();

        for(var answerIndex = 0; answerIndex < questionCount; answerIndex++) {
            var total = 0;
            var collectCount = 0;
            for(var personAns : answerList) {
                var ans = personAns[answerIndex];
                if(!ans.equals("_")) {
                    total += Integer.parseInt(ans);
                    collectCount++;
                }
            }
            var result = collectCount == 0 ? 0 : total / collectCount;
            System.out.println(result);
        }

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .toArray(String[]::new);
    }
}
