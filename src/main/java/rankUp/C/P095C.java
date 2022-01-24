package rankUp.C;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class P095C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var password = sc.nextLine();
        final var input = sc.nextLine();
        final var passArray =
                Stream.of(password.split(""))
                        .sorted()
                        .toArray(String[]::new);

        final var inputArray =
                Stream.of(input.split(""))
                    .sorted()
                    .toArray(String[]::new);

        final String result;
        if (password.equals(input)) {
            result = "NO";
        } else if(Arrays.equals(passArray, inputArray)) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);

        sc.close();
    }
}