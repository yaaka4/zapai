package levelUp.unagi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Step1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var chairCount = sc.nextInt();
        final var groupCount = sc.nextInt();

        final var groupInfoList =
                IntStream.range(0, groupCount)
                        .mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()})
                        .toList();

        var table = new int[chairCount];
        for(var groupInfo : groupInfoList) {
            final var personCount = groupInfo[0];
            final var start = groupInfo[1];
            for(var i = 0; i < personCount; i++) {
                final var position = (start - 1 + i) % chairCount;
                if(table[position] == 0)  {
                    table[position] = 1;
                } else {
                    for(var j = i; j > 0; j--) {
                        table[position - j ] = 0;
                    }
                    break;
                }
            }
        }
        final var result = Arrays.stream(table).sum();

        System.out.println(result);

        sc.close();
    }
}
