import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P022C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var day = Integer.parseInt(line);

        final var stockDataArray = IntStream.range(0, day)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray())
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.print(stockDataArray[0] + " ");

        System.out.print(stockDataArray[stockDataArray.length - 3] + " ");

        IntStream.of(stockDataArray)
                .max()
                .ifPresent(i -> System.out.print(i + " "));

        IntStream.of(stockDataArray)
                .min()
                .ifPresent(System.out::print);

        sc.close();
    }
}