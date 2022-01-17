import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class P051C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var cardSortedArray = Stream.of(sc.nextLine().split(" "))
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);

        final var result = Integer.parseInt(cardSortedArray[0] + cardSortedArray[2]) +
                Integer.parseInt(cardSortedArray[1] + cardSortedArray[3]);

        System.out.println(result);

        sc.close();
    }
}
