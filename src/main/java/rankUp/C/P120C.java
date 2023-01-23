package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P120C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var flowerCount = sc.nextInt();
        final var aRease = IntStream.range(0, flowerCount)
                .mapToObj(i -> sc.next())
                .toList();
        sc.nextLine();
        final var bRease = IntStream.range(0, flowerCount)
                .mapToObj(i -> sc.next())
                .toList();

        var result = "Yes";
        for (var i = 0; i < aRease.size(); i++) {
            for (var j = i; j < bRease.size(); j++) {
                if(!aRease.get(i).equals(bRease.get(j))) {
                    result = "No";
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
