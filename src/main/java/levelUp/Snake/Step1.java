package levelUp.Snake;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var height = sc.nextInt();
        // 使わないのでスキップ
        // final var width =
        sc.nextInt();
        final var sy = sc.nextInt();
        final var sx = sc.nextInt();
        final var direct = sc.next();
        // 末尾の改行コードをスキップ
        sc.nextLine();

        final var gameMap =
            IntStream.range(0, height)
                .mapToObj(i -> returnArray(sc))
                .toList();

        // 移動先座標
        final int nextY;
        final int nextX;
        switch (direct) {
            case "N" -> {
                nextY = sy - 1;
                nextX = sx;
            }
            case "S" -> {
                nextY = sy + 1;
                nextX = sx;
            }
            case "E" -> {
                nextY = sy;
                nextX = sx + 1;
            }
            case "W" -> {
                nextY = sy;
                nextX = sx - 1;
            }
            default -> {
                nextY = sy;
                nextX = sx;
            }
        }

        final String result;
        if(nextX < 0 || nextY < 0 || nextX > gameMap.get(0).length - 1 || nextY > gameMap.size() - 1) {
            // 範囲外チェック
            result = "No";
        } else {
            // 障害物チェック
            result = ".".equals(gameMap.get(nextY)[nextX]) ? "Yes" : "No";
        }

        System.out.println(result);

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(""))
                .toArray(String[]::new);
    }
}
