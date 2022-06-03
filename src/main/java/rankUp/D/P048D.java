package rankUp.D;

import java.util.List;
import java.util.Scanner;

public class P048D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var list = List.of(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        var index = 0;
        for (var i : list) {
            if (index == 0) {
                index++;
                continue;
            }
            System.out.println(i - list.get(index - 1));
            index++;
        }
    }
}
