package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P078C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var conditionArray =
                Stream.of(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        final var day = conditionArray[0];
        final var minAmount = conditionArray[1];
        final var maxAmount = conditionArray[2];

        final var stockPriceArray = IntStream.range(0, day)
                .map(i -> Integer.parseInt(sc.nextLine()))
                .boxed()
                .toList();

        var stockCount = 0;
        var profit = 0;
        for(var i = 0; i < stockPriceArray.size() - 1; i++) {
            final var price = stockPriceArray.get(i);
            if(price <= minAmount) {
                stockCount++;
                profit -= price;
            } else if(maxAmount <= price) {
                profit += stockCount * price;
                stockCount = 0;
            }
        }
        profit += stockCount * stockPriceArray.get(day - 1);
        System.out.println(profit);

        sc.close();
    }
}