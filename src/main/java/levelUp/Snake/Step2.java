package levelUp.Snake;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step2 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var height = sc.nextInt();
        // 使わないのでスキップ
        // final var width =
        sc.nextInt();
        final var sy = sc.nextInt();
        final var sx = sc.nextInt();
        final var direct = sc.next();
        final var rl = sc.next();
        // 末尾の改行コードをスキップ
        sc.nextLine();

        final var gameMap =
                IntStream.range(0, height)
                        .mapToObj(i -> returnArray(sc))
                        .toList();

        // 移動先座標
        final int nextY;
        final int nextX;
        if(direct.equals("N") && rl.equals("R")) {
            nextY = sy;
            nextX = sx + 1;
        } else if(direct.equals("N") && rl.equals("L")) {
            nextY = sy;
            nextX = sx - 1;
        } else if(direct.equals("S") && rl.equals("R")) {
            nextY = sy;
            nextX = sx - 1;
        } else if(direct.equals("S") && rl.equals("L")) {
            nextY = sy;
            nextX = sx + 1;
        } else if(direct.equals("E") && rl.equals("R")) {
            nextY = sy + 1;
            nextX = sx;
        } else if(direct.equals("E") && rl.equals("L")) {
            nextY = sy - 1;
            nextX = sx;
        } else if(direct.equals("W") && rl.equals("R")) {
            nextY = sy - 1;
            nextX = sx;
        } else if(direct.equals("W") && rl.equals("L")) {
            nextY = sy + 1;
            nextX = sx;
        } else {
            nextY = sy;
            nextX = sx;
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
