package levelUp.dataStructure;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Step2ver2 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var numCount = sc.nextInt();
        final var result = IntStream.range(0, numCount)
                .map(i -> sc.nextInt())
                .distinct()
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);

        sc.close();
    }
}
