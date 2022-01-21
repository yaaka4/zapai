import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P099B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var baseInfo = returnIntArray(sc);
        final var mapCount = baseInfo[0];
        final var maxRain = baseInfo[1];

        final var mapList = IntStream.range(0, mapCount)
                .mapToObj(i -> returnIntArray(sc))
                .toList();

        var waitArray = new String[mapCount][mapCount];
        for (int i = 0; i < mapList.size(); i++) {
            for (int j = 0; j < mapList.get(i).length; j ++) {
                if (mapList.get(i)[j] >= maxRain) {
                    waitArray[j][i] = "wait";
                } else {
                    waitArray[j][i] = "ok";
                }
            }
        }

        var sj = new StringJoiner(" ");
        for(int k = 0; k < waitArray[0].length; k++) {
            if (!Arrays.asList(waitArray[k]).contains("wait")) {
                sj.add(String.valueOf(k + 1));
            }
        }
        var resultRoute = sj.toString();
        resultRoute = resultRoute.length() == 0 ? "wait" : resultRoute;
        System.out.println(resultRoute);

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
