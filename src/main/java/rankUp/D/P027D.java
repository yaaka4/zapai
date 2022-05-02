package rankUp.D;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P027D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var result = IntStream.rangeClosed(1, sc.nextInt())
                .sum();
        System.out.println(result);
    }
}
