import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P013C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var unlikeNum = Integer.parseInt(line);
        final var roomCount = Integer.parseInt(sc.nextLine());

        final var resultArray = IntStream.range(0, roomCount)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(""))
                                .map(Integer::parseInt)
                                .toList())
                .map(list -> {
                    if(!list.contains(unlikeNum)) {
                        var roomNumStr = list.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining());
                        return Integer.parseInt(roomNumStr);
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toArray(Integer[]::new);

        if (resultArray.length == 0) {
            System.out.println("none");
        } else {
            Arrays.stream(resultArray).forEach(System.out::println);
        }
        sc.close();
    }
}