package rankUp.B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P096B {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var height = sc.nextInt();
        final var width = sc.nextInt();
        // 末尾の改行コードをスキップ
        sc.nextLine();
        final var gameMap =
            IntStream.range(0, height)
                .mapToObj(i -> returnArray(sc))
                .toList();

        // まず全てOK（=0）のマップを生成
        var fullClearMap = new int[height][width];
        for(var row : fullClearMap) {
            Arrays.fill(row,0);
        }

        var rowIndex = 0;
        for(var row : gameMap) {
            var colIndex = 0;
            for(var cell : row) {
                if("#".equals(cell)) {
                    Arrays.fill(fullClearMap[rowIndex], 1);
                    for(var i = 0; i < height; i++) {
                        fullClearMap[i][colIndex] = 1;
                    }
                }
                colIndex++;
            }
            rowIndex++;
        }
        var resultCount = Arrays.stream(fullClearMap).flatMapToInt(Arrays::stream).sum();

        System.out.println(resultCount);

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(""))
            .toArray(String[]::new);
    }
}
