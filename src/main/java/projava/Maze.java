package projava;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 3);
        var goal = new Position(4, 1);
        var isSmallIcon = true;
        for (;;) {
            // 迷路の表示
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (current.x() - 2 > x || x > current.x() + 2
                            || current.y() - 2 > y || y > current.y() + 2) {
                        continue;
                    }
                    if (x == current.x() && y == current.y()) {
                        System.out.print(isSmallIcon ? "o" : "O");
                    } else if (x == goal.x() && y == goal.y()) {
                        System.out.print("G");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    }  else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            // ゴール判定
            if (current.equals(goal)) {
                System.out.println("GOAL!!!");
                break;
            }
            // キー入力処理
            int ch = System.in.read();
            // 押された方向の座標を得る
            var next = switch (ch) {
                case 'h' -> new Position(current.x()-1, current.y());
                case 'u' -> new Position(current.x()     , current.y()-1);
                case 'j' -> new Position(current.x()+1, current.y());
                case 'n' -> new Position(current.x()     , current.y()+1);
                default -> current;
            };
            // 押された方向が通路なら進む
            if (map[next.y()][next.x()] == 0) {
                current = next;
                isSmallIcon = !isSmallIcon;
            }
            // Enterキーの入力を捨てる
            System.in.read();
        }
    }
}
