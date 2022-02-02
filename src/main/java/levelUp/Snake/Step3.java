package levelUp.Snake;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step3 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var height = sc.nextInt();
        // 使わないのでスキップ
        // final var width =
        sc.nextInt();
        final var sy = sc.nextInt();
        final var sx = sc.nextInt();
        final var moveCount = sc.nextInt();
        // 末尾の改行コードをスキップ
        sc.nextLine();

        final var gameMap =
                IntStream.range(0, height)
                        .mapToObj(i -> returnArray(sc))
                        .toList();

        final var rlArray =
                IntStream.range(0, moveCount)
                        .mapToObj(i -> sc.nextLine())
                        .toArray(String[]::new);
        // 最初の向き
        var direct = "N";
        // 現在地
        int currentY = sy;
        int currentX = sx;

        for(var rl : rlArray) {
            // 移動先座標
            final int nextY;
            final int nextX;
            if (direct.equals("N") && rl.equals("R")) {
                nextY = currentY;
                nextX = currentX + 1;
                direct = "E";
            } else if (direct.equals("N") && rl.equals("L")) {
                nextY = currentY;
                nextX = currentX - 1;
                direct = "W";
            } else if (direct.equals("S") && rl.equals("R")) {
                nextY = currentY;
                nextX = currentX - 1;
                direct = "W";
            } else if (direct.equals("S") && rl.equals("L")) {
                nextY = currentY;
                nextX = currentX + 1;
                direct = "E";
            } else if (direct.equals("E") && rl.equals("R")) {
                nextY = currentY + 1;
                nextX = currentX;
                direct = "S";
            } else if (direct.equals("E") && rl.equals("L")) {
                nextY = currentY - 1;
                nextX = currentX;
                direct = "N";
            } else if (direct.equals("W") && rl.equals("R")) {
                nextY = currentY - 1;
                nextX = currentX;
                direct = "N";
            } else if (direct.equals("W") && rl.equals("L")) {
                nextY = currentY + 1;
                nextX = currentX;
                direct = "S";
            } else {
                nextY = currentY;
                nextX = currentX;
                direct = "E";
            }

            final String result;
            if (nextX < 0 || nextY < 0 || nextX > gameMap.get(0).length - 1 || nextY > gameMap.size() - 1) {
                // 範囲外チェック
                result = "Stop";
                System.out.println(result);
                break;
            } else if("#".equals(gameMap.get(nextY)[nextX])) {
                // 障害物チェック
                result = "Stop";
                System.out.println(result);
                break;
            } else {
                result = nextY + " " + nextX;
                System.out.println(result);
            }

            currentY = nextY;
            currentX = nextX;
        }

        sc.close();
    }

    private static String[] returnArray(Scanner sc) {
        return Stream.of(sc.nextLine().split(""))
                .toArray(String[]::new);
    }
}
