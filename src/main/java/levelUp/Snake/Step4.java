package levelUp.Snake;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step4 {
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

        final List<String[]> gameMap =
                IntStream.range(0, height)
                        .mapToObj(i -> returnArray(sc, ""))
                        .toList();

        final var rlList =
                IntStream.range(0, moveCount)
                        .mapToObj(i -> returnArray(sc, " "))
                        .toList();
        // 最初の向き
        var currentDirect = "N";
        // 現在地
        int currentY = sy;
        int currentX = sx;

        for(var rlArray : rlList) {
            final var rl = rlArray[0];
            var baseStepCount = Integer.parseInt(rlArray[1]);
            // 移動先座標
            var nextY = currentY;
            var nextX = currentX;
            var nextDirect = currentDirect;
            var stepCount = 1;

            var result = "";
            for(; stepCount <= baseStepCount; stepCount++) {
                if (nextDirect.equals("N") && rl.equals("R")) {
                    nextX = currentX + stepCount;
                    nextDirect = "E";
                } else if (nextDirect.equals("N") && rl.equals("L")) {
                    nextX = currentX - stepCount;
                    nextDirect = "W";
                } else if (nextDirect.equals("S") && rl.equals("R")) {
                    nextX = currentX - stepCount;
                    nextDirect = "W";
                } else if (nextDirect.equals("S") && rl.equals("L")) {
                    nextX = currentX + stepCount;
                    nextDirect = "E";
                } else if (nextDirect.equals("E") && rl.equals("R")) {
                    nextY = currentY + stepCount;
                    nextDirect = "S";
                } else if (nextDirect.equals("E") && rl.equals("L")) {
                    nextY = currentY - stepCount;
                    nextDirect = "N";
                } else if (nextDirect.equals("W") && rl.equals("R")) {
                    nextY = currentY - stepCount;
                    nextDirect = "N";
                } else if (nextDirect.equals("W") && rl.equals("L")) {
                    nextY = currentY + stepCount;
                    nextDirect = "S";
                }
                if(!checkOutAreaBlock(nextX, nextY, gameMap)) {
                    // 範囲外・障害物チェック
                    result = nextY + " " + nextX;
                    if(stepCount != baseStepCount) {
                        nextY = currentY;
                        nextX = currentX;
                        nextDirect = currentDirect;
                    }
                } else {
                    if(stepCount == 1) {
                        result = currentY + " " + currentX;
                    }
                    System.out.println(result);
                    break;
                }
            }
            if(stepCount == baseStepCount + 1) {
                System.out.println(result);
                currentY = nextY;
                currentX = nextX;
                currentDirect = nextDirect;
            } else {
                result = "Stop";
                System.out.println(result);
                break;
            }
        }

        sc.close();
    }

    private static String[] returnArray(Scanner sc, String regex) {
        return Stream.of(sc.nextLine().split(regex))
                .toArray(String[]::new);
    }

    private static boolean checkOutAreaBlock(int nextX, int nextY, List<String[]> gameMap) {
        return nextX < 0 || nextY < 0
                || nextX > gameMap.get(0).length - 1 || nextY > gameMap.size() - 1
                || "#".equals(gameMap.get(nextY)[nextX]);
    }
}

