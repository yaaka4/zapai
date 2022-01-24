package rankUp.C;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P098C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var peopleNum = Integer.parseInt(line);
        var firstCountList = IntStream.range(0, peopleNum)
                .map(i -> Integer.parseInt(sc.nextLine()))
                .boxed()
                .collect(Collectors.toList());

        final var passCount = Integer.parseInt(sc.nextLine());
        IntStream.range(0, passCount)
                .forEach(i -> {
                    final var intArray =
                            Stream.of(sc.nextLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
                    final var moveCount = (firstCountList.get(intArray[0] - 1) - intArray[2]) >= 0 ?
                            intArray[2] : firstCountList.get(intArray[0] - 1);
                    firstCountList.set(intArray[0] - 1, firstCountList.get(intArray[0] - 1) - moveCount);
                    firstCountList.set(intArray[1] - 1, firstCountList.get(intArray[1] - 1) + moveCount);
                });

        firstCountList.forEach(System.out::println);

        sc.close();
    }
}