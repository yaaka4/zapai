import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P077C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var studentsCount = Integer.parseInt(line.split(" ")[0]);
        final var questionCount = Integer.parseInt(line.split(" ")[1]);
        final var points = 100 / questionCount;

        IntStream.range(0, studentsCount)
                .mapToObj(i ->
                        Stream.of(sc.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray())
                .mapToDouble(array -> {
                    if (array[0] <= 0) {
                        return array[1] * points;
                    } else if (array[0] >= 10) {
                        return 0;
                    } else {
                        return array[1] * points * 0.8;
                    }
                })
                .mapToObj(point -> {
                    if (100 >= point && point >=80) {
                        return "A";
                    } else if (79 >= point && point >=70) {
                        return "B";
                    } else if (69 >= point && point >=60) {
                        return "C";
                    } else if (59 >= point && point >=0) {
                        return "D";
                    } else {
                        return "D";
                    }
                })
                .forEach(System.out::println);

        sc.close();
    }
}