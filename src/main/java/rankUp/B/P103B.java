package rankUp.B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P103B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var lightTimes = Integer.parseInt(sc.nextLine());
        var initPositionArray = returnIntArray(sc);
        final var lightArray = IntStream.range(0, lightTimes)
                .mapToObj(i -> sc.nextLine().split(" "))
                .toList();
        final var RED_LIST = Arrays.asList("R", "Y", "M", "W");
        final var GREEN_LIST = Arrays.asList("G", "Y", "C", "W");
        final var BLUE_LIST = Arrays.asList("B", "M", "C", "W");

        Integer result = null;
        for(String[] array : lightArray) {
            final var direction = switch (array[0]) {
                case "L" -> -1;
                case "R" -> 1;
                default -> 0;
            };
            if(RED_LIST.contains(array[1])) {
                initPositionArray[0] += direction;
            }
            if(GREEN_LIST.contains(array[1])) {
                initPositionArray[1] += direction;
            }
            if(BLUE_LIST.contains(array[1])) {
                initPositionArray[2] += direction;
            }
            if(initPositionArray[0] == initPositionArray[1] && initPositionArray[1] == initPositionArray[2]) {
                result = initPositionArray[0];
                break;
            }
        }
        if(null != result) {
            System.out.println(result);
        } else {
            System.out.println("no");
        }

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
