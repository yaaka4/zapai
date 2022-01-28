package rankUp.B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P068B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var baseInfo = sc.nextLine().split(" ");
        final var height = Integer.parseInt(baseInfo[0]);
        final var width = Integer.parseInt(baseInfo[1]);

        final var chocolateList =
            IntStream.range(0, height)
                .mapToObj(i -> returnIntArray(sc))
                .toList();

        var resultString = "Yes";
        var resultArray = new String[height][width];
        var i = 0;
        for(var row : chocolateList) {
            final var half = Arrays.stream(row).sum() / 2;
            var j = 0;
            var sugarSum = 0;
            for(var sugar : row) {
                sugarSum += sugar;
                resultArray[i][j] = "A";
                j++;
                if(sugarSum == half) {
                    break;
                }
                if(sugarSum > half) {
                    resultString = "No";
                    break;
                }
            }
            for(; j < row.length; j++) {
                resultArray[i][j] = "B";
            }
            if(resultString.equals("No")) {
                break;
            }
            i++;
        }

        System.out.println(resultString);
        if(resultString.equals("Yes")) {
            for(var resultRow : resultArray) {
                Arrays.stream(resultRow).forEach(System.out::print);
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
