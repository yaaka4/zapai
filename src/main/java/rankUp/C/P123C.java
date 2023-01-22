package rankUp.C;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P123C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var memberCount = sc.nextInt();
        final var yearList = IntStream.range(0, memberCount)
                .mapToObj(i -> sc.nextInt())
                .toList();

        final var orderCount = sc.nextInt();
        final var orderList = IntStream.range(0, orderCount)
                .mapToObj(i -> List.of(sc.nextInt(), sc.nextInt(), sc.nextInt()))
                .toList();

        var resultArray = new int[memberCount];
        for(var order : orderList) {
            final var start = order.get(0);
            final var end = order.get(1);
            final var beanCount = order.get(2);

            for(int i = start; i <= end; i++) {
                resultArray[i - 1] += beanCount;
            }
        }

        for(var j = 0; j < resultArray.length; j++) {
            if(resultArray[j] > yearList.get(j)) {
                resultArray[j] = yearList.get(j);
            }
        }

        Arrays.stream(resultArray).forEach(System.out::println);

        sc.close();
    }
}
