package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P024C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var operationCount = sc.nextInt();
        final var operationList = IntStream.rangeClosed(0, operationCount)
                .mapToObj(i -> returnArray(sc))
                .toList();

        var first = 0;
        var second = 0;
        for(var operation : operationList) {
            switch (operation[0]) {
                case "SET" -> {
                    if("1".equals(operation[1])) {
                        first = Integer.parseInt(operation[2]);
                    } else {
                        second = Integer.parseInt(operation[2]);
                    }
                }
                case "ADD" -> second = first + Integer.parseInt(operation[1]);
                case "SUB" -> second = first - Integer.parseInt(operation[1]);
                default -> {
                }
            }
        }
        System.out.println(first + " " + second);

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .toArray(String[]::new);
    }
}
