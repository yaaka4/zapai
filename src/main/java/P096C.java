import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P096C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var memberNum = Integer.parseInt(sc.nextLine());

        final var vacationList = IntStream.range(0, memberNum)
                .mapToObj(i -> returnIntArray(sc))
                .toList();

        var comStartDay = 0;
        var comEndDay = 0;
        var result = "OK";
        for(int i = 0; i < vacationList.size(); i++) {
            final var start = vacationList.get(i)[0];
            final var end = vacationList.get(i)[1];
            if(i == 0) {
                comStartDay = start;
                comEndDay = end;
                continue;
            }
            if(comStartDay >= start && comStartDay <= end) {
                comEndDay = Math.min(comEndDay, end);
            } else if(comEndDay <= end && comEndDay >= start) {
                comStartDay = Math.min(comStartDay, start);
            } else if(comStartDay <= start && comEndDay >= end) {
                comStartDay = start;
                comEndDay = end;
            } else {
                result = "NG";
                break;
            }
        }
        System.out.println(result);

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
