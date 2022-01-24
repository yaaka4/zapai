package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class P093C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var pointsArray =
                Stream.of(sc.nextLine().split(" "))
                    .toArray(String[]::new);

        final var resultArray = Arrays.stream(pointsArray)
                .mapToInt(P093C::calcDigitSum)
                .toArray();

        if(resultArray[0] > resultArray[1]) {
            System.out.println("Bob");
        } else if (resultArray[0] < resultArray[1]) {
            System.out.println("Alice");
        } else {
            System.out.println("Draw");
        }

        sc.close();
    }

    private static int calcDigitSum(String point) {
        var digitSum = Arrays.stream(point.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        var digitSumStr = String.valueOf(digitSum);
        return Integer.parseInt(digitSumStr.substring(digitSumStr.length() - 1));
    }
}
