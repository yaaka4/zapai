package levelUp.dataStructure;

import java.util.Scanner;
import java.util.stream.Stream;

public class Step1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var baseInfo = returnIntArray(sc);
        final var targetNum = baseInfo[1];

        final var isExist = Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .anyMatch(num -> num == targetNum);

        System.out.println(isExist ? "Yes" : "No");

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
