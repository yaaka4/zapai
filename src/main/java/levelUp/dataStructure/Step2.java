package levelUp.dataStructure;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step2 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        sc.nextLine();

        final var result =
            Stream.of(sc.nextLine().split(" "))
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.println(result);

        sc.close();
    }
}
