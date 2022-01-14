import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P103C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var infoArray = returnIntArray(sc);
        final var moveTime = infoArray[0];
        final var actionCount = infoArray[1];

        final var actionInfoList = IntStream.range(0, actionCount)
                .mapToObj(i -> Stream.of(sc.nextLine().split(" "))
                        .toArray(String[]::new))
                .toList();

        IntStream.rangeClosed(1, moveTime)
                .forEach(time -> {
                    StringJoiner output = new StringJoiner(" ");
                    for(String[] actionArray : actionInfoList) {
                        if(time % Integer.parseInt(actionArray[0]) == 0) {
                            output.add(actionArray[1]);
                        }
                    }
                    if (output.toString().equals("")) {
                        System.out.println(time);
                    } else {
                        System.out.println(output.toString().trim());
                    }
                });

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
