package rankUp.D;

import java.util.Scanner;

public class P062D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        final var figure = "ABCDEFGHIJ";
        Scanner sc = new Scanner(System.in);
        final var first = sc.nextInt();
        final var second = sc.nextInt();
        final var third = sc.nextInt();
        System.out.println(figure.substring(0, first));
        System.out.println(figure.substring(first, first + second));
        System.out.println(figure.substring(first + second, first + second + third));
    }
}
