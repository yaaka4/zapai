package rankUp.D;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P196D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.println(
            IntStream.range(0, sc.nextInt())
                .map(i -> sc.nextInt())
                .sum()
        );
    }
}
