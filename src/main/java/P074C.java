import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P074C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var windowInfoArray = returnIntArray(sc);
        final var height = windowInfoArray[0];
        final var afterWidth = windowInfoArray[2];

        final var allString = IntStream.range(0, height)
                .mapToObj(i -> sc.nextLine())
                .collect(Collectors.joining());

        final var afterHeight = (int)Math.ceil((double)allString.length() / (double)afterWidth);
        for (int i = 0; i < afterHeight; i++) {
            Arrays.stream(allString.split(""))
                    .skip((long) i * afterWidth)
                    .limit(afterWidth)
                    .forEach(System.out::print);
            if(i != afterHeight -1) {
                System.out.println();
            }
        }

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
