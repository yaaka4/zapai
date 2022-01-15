import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P010C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var constructionInfoArray = returnIntArray(sc);
        final var restPoints = Integer.parseInt(sc.nextLine());

        IntStream.range(0, restPoints)
                .mapToObj(i -> returnIntArray(sc))
                .map(array -> judgeNoisy(array, constructionInfoArray))
                .forEach(System.out::println);

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static String judgeNoisy(int[] array, int[] constructionInfoArray) {
        final var a = constructionInfoArray[0];
        final var b = constructionInfoArray[1];
        final var r = constructionInfoArray[2];
        final var x = array[0];
        final var y = array[1];
        final var distance = (x - a) * (x - a) + (y - b) * (y - b);

        if (distance >= r*r) {
            return "silent";
        } else {
            return "noisy";
        }
    }
}
