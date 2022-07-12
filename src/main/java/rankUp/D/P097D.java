package rankUp.D;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P097D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var sum = IntStream.range(0, 7).map(i -> sc.nextInt()).sum();
        System.out.println(sum >= 5 ? "yes" : "no");
    }
}
