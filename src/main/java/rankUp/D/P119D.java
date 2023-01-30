package rankUp.D;

import java.util.Scanner;

public class P119D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var order = sc.nextInt();
        final var pi = "3.141592653589793";
        System.out.println(pi.substring(0, order + 2));
    }
}
