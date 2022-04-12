package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P108C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var areaCount = sc.nextInt();
        final var stayTimeList = IntStream.range(0, areaCount)
                .mapToObj(i -> sc.nextInt())
                .toList();
        // 改行スキップ
        sc.nextLine();
        final var moveTimeList = IntStream.range(0, areaCount)
                .mapToObj(i -> Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .toList())
                .toList();
        final var visitCount = sc.nextInt();
        final var visitList = IntStream.range(0, visitCount)
                .mapToObj(i -> sc.nextInt())
                .toList();

        var resultTime = 0;
        var preArea = visitList.get(0);
        for(var area : visitList) {
            // 移動時間
            resultTime += moveTimeList.get(preArea - 1).get(area - 1);
            // 滞在時間
            resultTime += stayTimeList.get(area - 1);
            preArea = area;
        }

        System.out.println(resultTime);

        sc.close();
    }
}
